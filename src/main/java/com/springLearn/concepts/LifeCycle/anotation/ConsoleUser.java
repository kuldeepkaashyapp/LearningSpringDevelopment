package com.springLearn.concepts.LifeCycle.anotation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConsoleUser {
    public static void main(String[] args) {
       AbstractApplicationContext context = new ClassPathXmlApplicationContext("BeanLifeCycleAnotaion.xml");

       context.registerShutdownHook();
       GameConsole gameConsole=(GameConsole) context.getBean("GamingConsole");

        System.out.println(gameConsole.toString());


    }
}
