package com.schoolmanager.app;

import java.util.HashMap;
import java.util.List;

public interface StudentService {
    public void addNewStudent(Student student);

    public List<Student> getAllStudent();

    public Student getStudentById(int id);

    public void deleteStudentById(int id);

    public int studentCount();

    public HashMap<String, Double> studentReport();
}