package com.SpringJDBC.concepts;

import com.SpringJDBC.concepts.config.DatabaseConfiguration;
import com.SpringJDBC.concepts.dao.StudentDao;
import com.SpringJDBC.concepts.entites.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class App {


    public static void main(String[] args) {
        System.out.println("-------Program Started--------");

      //  ApplicationContext context =new ClassPathXmlApplicationContext("SpringJDBC/springJDBCTemplate.xml");


        ApplicationContext context = new AnnotationConfigApplicationContext(DatabaseConfiguration.class);
        JdbcTemplate template = context.getBean("jdbcTemplate", JdbcTemplate.class);


        //insert query



      /*  int result = template.update(query, "John", 23, "kanpuriya");*/


        Student student = new Student();
//        student.setName("Jack");
//        student.setAge(30);
//        student.setCity("Berlin");
//
//
        StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
//        System.out.println(studentDao.insert(student));

        student.setId(6);
//        student.setAge(18);
//        student.setCity("London");
//        student.setName("Jonny");



        //updating the data in the database
     //   System.out.println("updation"+studentDao.change(student));


        //Deleting Query
      //  System.out.println("Deleted the data"+studentDao.delete(student));

        //Select Query

       //` System.out.println("Selecting the data"+studentDao.findById(5).toString());

        //selecting multiple objects
        System.out.println("selecting multiple data"+studentDao.findAll());

    }
}
