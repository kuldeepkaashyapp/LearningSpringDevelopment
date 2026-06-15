package com.springLearn.concepts.Spel.project;

import lombok.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Calculator {
    private String y;
    private String x;
    @Value("#{(com.springLearn.concepts.Spel.project.sum(#root.x,root.y))}")
    private int sum;

    @Value("#{com.springLearn.concepts.Spel.project.subtract(#root.x,#root.y)}")
    private int sub;

    @Value("#{com.springLearn.concepts.Spel.project.divide(#root.x,#root.y)}")
    private double divdeNumber;

    @Value("#{com.springLearn.concepts.Spel.project.multiply(#root.x,#root.y)}")
    private double multiplyNumber;



}
