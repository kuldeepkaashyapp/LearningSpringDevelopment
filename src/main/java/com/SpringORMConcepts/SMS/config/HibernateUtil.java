package com.SpringORMConcepts.SMS.config;

import lombok.Getter;
import org.hibernate.SessionFactory;
import  org.hibernate.cfg.Configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;


@Component

class HibernateUtil {
    // createing instance of the session factory
  private  static SessionFactory factory=null;

  static{
      try{
          if(factory == null){
            factory=  new Configuration().configure("ORM/hibernateConfig.xml").buildSessionFactory();
              System.out.println("Created SessionFactory");


          }
      }catch (Exception e){
          System.out.println(" could not create session factory");
          e.printStackTrace();
      }




  }

  // returning the object of the Session Factory
    @Bean("sessionFactory")
    public static SessionFactory  getSessionFactory(){
        return factory;

    }
}
