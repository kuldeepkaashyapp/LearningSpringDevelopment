package com.SpringJDBC.concepts.entites;


import lombok.*;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor

// making entity class in the code
// it is  had all the feilds like my database
public class Student {
    private int  id;
    private String name;
    private int age;
    private String city;



}
