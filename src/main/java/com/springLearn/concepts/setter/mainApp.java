package com.springLearn.concepts.setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mainApp {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("setterinjection/setterDemo.xml");

                ClassRoom classRoom=(ClassRoom) context.getBean("TeachingRoom");

        System.out.println(classRoom.toString());
    }
}
