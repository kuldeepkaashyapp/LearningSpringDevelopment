package com.springLearn.concepts.autowiring.QualifierDemo;


import lombok.Data;

@Data

public class VideoEditor implements Editor {

    @Override
    public void edit() {
        System.out.println("Video Editor");
    }

}
