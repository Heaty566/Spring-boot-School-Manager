package com.schoolmanager.app;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDaoImpl implements StudentDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void save(Student student) {
        Session newSession = sessionFactory.getCurrentSession();
        newSession.saveOrUpdate(student);

    }

    @Override
    public Student getById(int id) {
        Session newSession = sessionFactory.getCurrentSession();
        Query<Student> query = newSession.createQuery("from Student where id=" + id, Student.class);
        Student student = query.getResultList().get(0);
        return student;
    }

    @Override
    public List<Student> getAll() {
        Session newSession = sessionFactory.getCurrentSession();
        Query<Student> query = newSession.createQuery("from Student", Student.class);
        List<Student> students = query.getResultList();

        return students;
    }

    @Override
    public void deleteById(int id) {
        Session newSession = sessionFactory.getCurrentSession();
        Query query = newSession.createQuery("delete from Student where id=" + id);

        query.executeUpdate();
    }

}