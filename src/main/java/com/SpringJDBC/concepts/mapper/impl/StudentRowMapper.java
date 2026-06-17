package com.SpringJDBC.concepts.mapper.impl;

import com.SpringJDBC.concepts.entites.Student;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;



public class StudentRowMapper implements RowMapper<Student> {

    @Override
    public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
        return Student.builder()
                .id(rs.getInt("stdid"))
                .name(rs.getString("name"))
                .age(rs.getInt("age"))
                .city(rs.getString("city"))

                .build();
    }
}
