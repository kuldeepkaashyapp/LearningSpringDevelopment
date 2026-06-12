package com.springLearn.concepts.autowiring.QualifierDemo;

public class ReelEditor implements Editor {


    @Override
    public void edit() {
        System.out.println("Reel Editor");
    }
}
