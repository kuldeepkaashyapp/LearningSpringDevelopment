package com.SpringJDBC.concepts.config;

import com.SpringJDBC.concepts.dao.StudentDao;
import com.SpringJDBC.concepts.dao.impl.studentDaoImp;
import com.SpringJDBC.concepts.entites.Student;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class DatabaseConfiguration {
    @Bean("HikariCpDataSource")
    public DataSource dataSourceHikariCp() {
        HikariConfig config = new HikariConfig();

        config.setDriverClassName("org.postgresql.Driver");
        config.setJdbcUrl("jdbc:postgresql://localhost:5432/social_db");
        config.setUsername("postgres");
        config.setPassword("123");
        return new HikariDataSource(config);
    }




    @Bean("ds")
    public DriverManagerDataSource getDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();

        dataSource.setDriverClassName("org.postgresql.Driver");
        dataSource.setUrl("jdbc:postgresql://localhost:5432/social_db");
        dataSource.setUsername("postgres");
        dataSource.setPassword("123");

        return  dataSource ;
    }

   @Bean("jdbcTemplate")
    public JdbcTemplate getJdbcTemplate() {
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSourceHikariCp());
        return jdbcTemplate;
    }
    @Bean("studentDao")
    public StudentDao getStudentDao() {
        studentDaoImp studentDaoImp = new studentDaoImp();
        studentDaoImp.setJdbcTemplate(getJdbcTemplate());
return  studentDaoImp;
    }
}
