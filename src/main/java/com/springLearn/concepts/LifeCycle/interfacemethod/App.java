package com.springLearn.concepts.LifeCycle.interfacemethod;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
public static void main(String[] args) {
    AbstractApplicationContext context = new ClassPathXmlApplicationContext("LifeCycle/BeanLifeCycleInterfaces.xml");
        context.registerShutdownHook();

        //smart speeker for  Bean Get
        SmartSpeaker smartSpeaker=(SmartSpeaker) context.getBean("speeker");

        System.out.println(smartSpeaker.toString());

  /*
    output:
    -------
    Smart Speaker Created
    AlexaConnected to wifi
    SmartSpeaker(speakerName=Alexa)
    SmartSpeaker destroy
    */
}

}
