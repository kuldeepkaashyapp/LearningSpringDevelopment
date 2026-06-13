package com.springLearn.concepts.Stereotype;


import lombok.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("newStudent")
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Getter
@ToString

public class Student {
                    @Value("10001")
    private String studentId;
                    @Value("Kuldeep")
    private String  studentName;
                    @Value("#{@subjectName}")
    private List<String> subjects;


}
