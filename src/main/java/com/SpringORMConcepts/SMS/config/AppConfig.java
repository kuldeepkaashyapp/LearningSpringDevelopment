package com.SpringORMConcepts.SMS.config;

import com.SpringJDBC.concepts.dao.StudentDao;
import com.SpringJDBC.concepts.dao.impl.studentDaoImp;
import com.SpringORMConcepts.SMS.daoImpl.StudentDAOImpl;
import lombok.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@ComponentScan("com.SpringORMConcepts.SMS")
public class AppConfig {

    public AppConfig() {
        super();
    }

//    @Bean
//    public StudentDao studentDao() {
//        return new studentDaoImp();
//    }


    @Bean("sessionFactory")
    public SessionFactory sessionFactory() {
        return HibernateUtil.getSessionFactory();
    }
}
