package com.SpringORMConcepts.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class HibernateUtil {

    private static SessionFactory sessionFactory = null;

    static {

        try {
           if (sessionFactory == null) {
               sessionFactory= new Configuration().configure("ORM/hibernateConfig.xml").buildSessionFactory();
               System.out.println("Created SessionFactory");
        }
    }catch (Exception e){
            throw  new RuntimeException("Error in  creation of session factory "+e.getMessage());
        }
    }


    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }


}
