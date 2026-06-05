package com.springLearn.Injection.autowiring.annotation;


import lombok.*;
import org.springframework.stereotype.Component;
@Data
@Setter
@Getter
@ToString


@Component

public class Editor {

    public void editVideo()
    {
        System.out.println("edit Video....");
    }
}
