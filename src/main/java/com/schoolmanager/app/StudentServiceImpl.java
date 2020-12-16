package com.schoolmanager.app;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentDao studentDao;

    @Override
    @Transactional
    public void addNewStudent(Student student) {

        this.studentDao.save(student);
    }

    private double round(double value, int places) {
        if (places < 0)
            throw new IllegalArgumentException();

        BigDecimal bd = BigDecimal.valueOf(value);
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

    @Override
    @Transactional
    public HashMap<String, Double> studentReport() {

        List<Student> lists = this.studentDao.getAll();
        int size = lists.size();
        int countA = 0;
        int countB = 0;
        int countC = 0;
        int countF = 0;
        for (Student student : lists) {
            double score = student.getScore();

            if (score >= 9) {
                countA++;
            } else if (score >= 7) {
                countB++;
            } else if (score >= 5) {
                countC++;
            } else {
                countF++;
            }
        }

        double percenOfA = round(((double) (countA) * 100 / (double) (size)), 2);
        double percenOfB = round(((double) (countB) * 100 / (double) (size)), 2);
        double percenOfC = round(((double) (countC) * 100 / (double) (size)), 2);
        double percenOfF = round(((double) (countF) * 100 / (double) (size)), 2);
        HashMap<String, Double> report = new HashMap<>();
        report.put("A", percenOfA);
        report.put("B", percenOfB);
        report.put("C", percenOfC);
        report.put("F", percenOfF);

        return report;
    }

    @Override
    @Transactional
    public int studentCount() {
        int size = this.studentDao.getAll().size();
        return size;
    }

    @Override
    @Transactional
    public List<Student> getAllStudent() {

        return this.studentDao.getAll();
    }

    @Override
    @Transactional
    public Student getStudentById(int id) {
        return this.studentDao.getById(id);
    }

    @Override
    @Transactional
    public void deleteStudentById(int id) {

        this.studentDao.deleteById(id);
    }
}