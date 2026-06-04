package com.springLearn.Injection.collectionInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {
        ApplicationContext context= new ClassPathXmlApplicationContext("collectionInjection.xml");
        BulidingCapacity building=(BulidingCapacity) context.getBean("building");

        System.out.println("building:"+building.toString());

        //output : building:BulidingCapacity{roomList=[Hall, Office, Library], RoomNumbers=[1001, 1002, 1003], Staff={A=Manager, B=employee, c=Security}}

    }
}
