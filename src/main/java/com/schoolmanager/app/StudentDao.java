package com.schoolmanager.app;

import java.util.List;

public interface StudentDao {
    void save(Student student);

    Student getById(int id);

    List<Student> getAll();

    void deleteById(int id);
}