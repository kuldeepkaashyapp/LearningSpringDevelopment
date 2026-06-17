package com.SpringJDBC.concepts;

import com.SpringJDBC.concepts.dao.StudentDao;
import com.SpringJDBC.concepts.entites.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class App {


    public static void main(String[] args) {
        System.out.println("-------Program Started--------");

        ApplicationContext context =new ClassPathXmlApplicationContext("SpringJDBC/springJDBCTemplate.xml");

        JdbcTemplate template = context.getBean("jdbcTemplate", JdbcTemplate.class);


        //insert query



      /*  int result = template.update(query, "John", 23, "kanpuriya");*/



        Student student = new Student();
        student.setName("Jack");
        student.setAge(30);
        student.setCity("Berlin");


        StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
        System.out.println(studentDao.insert(student));


    }
}
