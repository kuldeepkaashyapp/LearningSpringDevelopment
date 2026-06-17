package com.SpringJDBC.concepts.dao;

import com.SpringJDBC.concepts.entites.Student;

import java.util.List;

public interface StudentDao {
   //inserting the data into the database

   public int insert(Student student);

   //updating the database
   public int change(Student student);

   //deleting the data from database

   public int delete(Student student);

   //Returing Single object

   public Student findById(Integer id);

   // Returing List of Objects

   public List<Student> findAll();
}
