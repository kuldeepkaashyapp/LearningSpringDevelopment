package com.SpringORMConcepts.SMS.entity;


import jakarta.persistence.*;
import lombok.*;
import org.springframework.stereotype.Component;
@Builder
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Component("student")
@Entity
@Table(name = "StudentDetailsMaster")
public class Student extends BaseEntity   {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name="rollNumber")
    private  int studentId;
    private  String studentName;
    private  String studentEmail;
    private  String studentPhone;
   private  String course;
   private double fees;
   private boolean isActive;

}
