package com.SpringORMConcepts.SMS.main;

import com.SpringORMConcepts.SMS.config.AppConfig;
import com.SpringORMConcepts.SMS.dao.StudentDao;
import com.SpringORMConcepts.SMS.daoImpl.StudentDAOImpl;
import com.SpringORMConcepts.SMS.entity.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class mainApplication {
    public static void main(String[] args) {

ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        StudentDao studentDao = (StudentDao) context.getBean("studentDao");


        Student s1 = Student.builder()

                .studentName("Kuldeep Kashyap")
                .studentEmail("kuldeep@gmail.com")
                .studentPhone("9876543210")
                .course("B.Tech CSE")
                .fees(50000)
                .isActive(true)
                .build();

        // peforming insert opration

        System.out.println(studentDao.saveStudent(s1));

    }
}
