package com.SpringORMConcepts.enity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table( name="EmployeeMaster")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder

public class Employee {
    @Id
    @GeneratedValue( strategy=GenerationType.IDENTITY)

    private long empId;
    private  String firstName;
    private  String lastName;
    private  String email;
    private  String phone;
    private  String address;

    private  String departmentID;
    private boolean isActive=true;
    @Lob
    private String about;


}
