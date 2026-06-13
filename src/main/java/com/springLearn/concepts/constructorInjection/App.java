package com.springLearn.concepts.constructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("injection/constructorInjection.xml");

        Orders order=(Orders) context.getBean("oders");

        System.out.println(order.toString());
     }
}
