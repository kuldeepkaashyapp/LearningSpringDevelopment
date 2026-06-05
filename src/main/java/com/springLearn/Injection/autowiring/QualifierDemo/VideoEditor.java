package com.springLearn.Injection.autowiring.QualifierDemo;


import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data

public class VideoEditor implements Editor {

    @Override
    public void edit() {
        System.out.println("Video Editor");
    }

}
