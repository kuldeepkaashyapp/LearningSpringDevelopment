package com.SpringORMConcepts.SMS.dao;


import com.SpringORMConcepts.SMS.entity.Student;

import java.util.List;

public interface StudentDao {
    //saving inseting Data
    public boolean saveStudent(Student student);

    // findby rollNumber
    public Student findById(int id);

    // Find all Student

    public List<Student> findAll();

    // change data
    public boolean  updateStudent();
    // Deleting StudnetData
    public boolean deleteStudent(int id);
    //Detaivate The Student
    public boolean deactivateStudent(int id);
    //Active student

    public boolean activateStudent(int id);
}
