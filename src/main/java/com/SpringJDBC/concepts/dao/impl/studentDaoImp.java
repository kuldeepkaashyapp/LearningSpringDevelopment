package com.SpringJDBC.concepts.dao.impl;

import com.SpringJDBC.concepts.dao.StudentDao;
import com.SpringJDBC.concepts.entites.Student;
import com.SpringJDBC.concepts.mapper.impl.StudentRowMapper;
import lombok.*;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class studentDaoImp implements StudentDao {
    private JdbcTemplate jdbcTemplate;
    private final RowMapper<Student> rowMapper =
            new StudentRowMapper();


    @Override
    public int insert(Student student) {
        String query = "insert into Student(name,age,city) values(?,?,?)";

        return  jdbcTemplate.update(query, student.getName(), student.getAge(), student.getCity());
    }

    @Override
    public int change(Student student) {

        //update query

        String query = "update Student set name=?,age=?,city=? where stdid=?";
        return jdbcTemplate.update(query, student.getName(), student.getAge(), student.getCity(), student.getId());
    }
    @Override
    public int delete(Student student) {

        String query = "delete from Student where stdid=?";
        return jdbcTemplate.update(query, student.getId());
    }

    @Override
    public Student findById(Integer id) {
        String query = "select * from Student where stdid=?";
        RowMapper<Student> rowMapper = new StudentRowMapper();
        return jdbcTemplate.queryForObject(query,rowMapper,id);
    }

    @Override
    public List<Student> findAll() {

        //query
        String query = "select * from Student";


        return jdbcTemplate.query(query, rowMapper);
    }
}
