package com.springLearn.concepts.Spel.project;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;


@Configuration
@ComponentScan(basePackages = "com.springLearn.concepts.Spel.project")

public class calc {

    public static void main(String[] args) {
   // ApplicationContext context = new Annotatiko(AppConfig.class);


   //Calculator calc=(Calculator) context.getBean(Calculator.class);

   // calc.toString();
    }


}
