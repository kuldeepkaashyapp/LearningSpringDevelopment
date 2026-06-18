package com.SpringORMConcepts.SMS.service;

import com.SpringORMConcepts.SMS.daoImpl.StudentDAOImpl;
import com.SpringORMConcepts.SMS.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface StudentService {
    // saving stundet
    public boolean createStudent(Student student);

    // find by rollNumber
    public Student findbyRollnumber(int rollNumhbger);

    // find ALl student

    public List<Student>  findall();


    // updating a studnet

    public boolean updateStudent(Student student);
    // Deleting Stundent Record
    public boolean deleteStudent(int rollNumber);

    // deativating Student
    public boolean deactivateStudent(int rollNumber);

    //  activate Stundet
    public boolean activateStudent(int rollNumber);



}
