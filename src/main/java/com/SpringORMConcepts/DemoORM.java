package com.SpringORMConcepts;

import com.SpringORMConcepts.enity.Employee;
import com.SpringORMConcepts.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class DemoORM {

    public static void main(String[] args) {
        SessionFactory sessionFactory= HibernateUtil.getSessionFactory();

        // create new Employee
        Employee employee =

                Employee.builder()
                .firstName("Kuldeep")
                .lastName("Kashyap")
                .email("kuldeep@gmail.com")
                .phone("9876543210")
                .address("Kanpur")
                .departmentID("IT001")
                .about("Java Full Stack Developer").build();


        // creating Session
        System.out.println("Session Factory Created");

        Session session = sessionFactory.openSession();

        System.out.println("Before Persist");




        Transaction transaction=null;
        try {
            transaction=session.beginTransaction();
            session.persist(employee);
            transaction.commit();
            System.out.println("Employee has been persisted successfully");
        }catch (Exception e){
            if(transaction!=null){
                transaction.rollback();
            }else {
                e.printStackTrace();
            }
        }finally {
            session.close();

        }


    }
}
