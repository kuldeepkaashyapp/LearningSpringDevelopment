package com.springLearn.concepts.LifeCycle.interfacemethod;

import lombok.*;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

@Data
@Setter
@Getter
@ToString


public class SmartSpeaker implements InitializingBean, DisposableBean {
    private String speakerName;
//connnstructor
   public SmartSpeaker() {
       System.out.println("Smart Speaker Created");
   }
    //playMusic Method
    public void playMusic() {
        System.out.println(speakerName+" Playing music");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("SmartSpeaker destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(speakerName +"Connected to wifi");
    }
}
