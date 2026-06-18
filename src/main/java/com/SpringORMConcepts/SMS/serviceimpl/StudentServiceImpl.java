package com.SpringORMConcepts.SMS.serviceimpl;

import com.SpringORMConcepts.SMS.daoImpl.StudentDAOImpl;
import com.SpringORMConcepts.SMS.entity.Student;
import com.SpringORMConcepts.SMS.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentDAOImpl studentDao;


    @Override
    public boolean createStudent(Student student) {
        return studentDao.saveStudent(student);
    }

    @Override
    public Student findbyRollnumber(int rollNumhbger) {
        return studentDao.findById(rollNumhbger);
    }

    @Override
    public List<Student> findall() {
        return  studentDao.findAll();
    }

    @Override
    public boolean updateStudent(Student student) {
        return studentDao.updateStudent();
    }

    @Override
    public boolean deleteStudent(int rollNumber) {
        return studentDao.deleteStudent(rollNumber);
    }

    @Override
    public boolean deactivateStudent(int rollNumber) {
        return studentDao.deactivateStudent(rollNumber);
    }

    @Override
    public boolean activateStudent(int rollNumber) {
        return studentDao.activateStudent(rollNumber);
    }
}
