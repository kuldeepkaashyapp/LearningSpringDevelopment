package com.springLearn.Injection.LifeCycle.implementation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RobotRunner {

    public static void main(String[] args) {


        AbstractApplicationContext context = new ClassPathXmlApplicationContext("SpringLifeCylce.xml");

        Robot runner = (Robot) context.getBean("robot");

        System.out.println(runner);
       //calling Destroy mathod with the help of hook this hook
        context.registerShutdownHook();

     /*
        output:
        -------
        Bean Created
        Starting Robot
        Robot(RobotId=10220, RobotName=chitiBabu)
        Stopping Robot
     */
    }
}
