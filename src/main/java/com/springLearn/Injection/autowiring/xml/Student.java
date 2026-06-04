package com.springLearn.Injection.autowiring.xml;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
@Setter
@Getter
@ToString
public class Student {

    private String name;
    private  Laptop laptop;

    public void study(){
        laptop.complieCode();
        System.out.println("Student study");
    }
}
