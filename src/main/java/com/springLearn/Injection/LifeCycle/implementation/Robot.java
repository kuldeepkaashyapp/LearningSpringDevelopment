package com.springLearn.Injection.LifeCycle.implementation;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
@Setter
@Getter
@ToString
public class Robot {

    private Long RobotId;
    private String RobotName;


    public Robot() {

        System.out.println("Bean Created");
    }

    public void start(){
        System.out.println("Starting Robot");
    }

    public void working(){
        System.out.println("Machine is working");
    }

    public void stop()
        {
        System.out.println("Stopping Robot");
        }

}
