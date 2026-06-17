package com.SpringJDBC.concepts.dao.impl;

import com.SpringJDBC.concepts.dao.StudentDao;
import com.SpringJDBC.concepts.entites.Student;
import lombok.*;
import org.springframework.jdbc.core.JdbcTemplate;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class studentDaoImp implements StudentDao {
    private JdbcTemplate jdbcTemplate;


    @Override
    public int insert(Student student) {
        String query = "insert into Student(name,age,city) values(?,?,?)";

        return  jdbcTemplate.update(query, student.getName(), student.getAge(), student.getCity());
    }
}
