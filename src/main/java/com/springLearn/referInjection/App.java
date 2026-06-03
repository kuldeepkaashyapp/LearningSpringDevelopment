package com.springLearn.referInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {
        //loading XMl
        ApplicationContext context=new ClassPathXmlApplicationContext("referInjection.xml");


        //Get Bean

       Hospital hospital=(Hospital) context.getBean("Hospital");

        System.out.println(hospital);

    }
}
