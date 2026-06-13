package com.springLearn.concepts.Stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {


        ApplicationContext context = new ClassPathXmlApplicationContext("Stereotype/Stereotypedemo.xml");

        Student student= (Student) context.getBean("newStudent");
        //
        // System.out.println(student);

        System.out.println(student.getSubjects());
    }
}
