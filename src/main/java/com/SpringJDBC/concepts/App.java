package com.SpringJDBC.concepts;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class App {


    public static void main(String[] args) {
        System.out.println("-------Program Started--------");

        ApplicationContext context =new ClassPathXmlApplicationContext("SpringJDBC/springJDBCTemplate.xml");

        JdbcTemplate template = context.getBean("jdbcTemplate", JdbcTemplate.class);


        //insert query

        String query = "insert into Student(name,age,city) values(?,?,?)";

        int result = template.update(query, "John", 23, "kanpuriya");
        System.out.println("Student inserted: " + result);


    }
}
