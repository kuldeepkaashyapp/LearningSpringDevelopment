package com.springLearn.concepts.autowiring.QualifierDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class YoutubeUser {

    public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("autowiring/autowiringAnnotaionQualifier.xml");


    YouTubeChannel channel=(YouTubeChannel) context.getBean("channel");
       // System.out.println(channel.toString());

        channel.uploadVideo();
    }
}
