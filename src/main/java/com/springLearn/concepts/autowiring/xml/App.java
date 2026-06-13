package com.springLearn.concepts.autowiring.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("autowiring/autowiringxml.xml");

        Student student= context.getBean("student",Student.class);

        student.study();

        //output
        //Laptop complie code
        //Student study

    }
}
