package com.SpringORMConcepts.SMS.daoImpl;

import com.SpringORMConcepts.SMS.dao.StudentDao;
import com.SpringORMConcepts.SMS.entity.Student;
import lombok.Getter;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Objects;

@Getter
@Repository("studentDao")
@Component
public class StudentDAOImpl implements StudentDao {
    @Autowired
    @Qualifier("sessionFactory")
    private  SessionFactory sessionFactory;
private  Transaction transaction =null;

private   boolean flag=false;


//// intilizing session for opration of database
//    {
//        try {
//            if (session == null)
//                session = sessionFactory.openSession();
//            System.out.println("created new session ");
//        }catch (Exception e){
//            System.out.println("Exception in StudentDAOImpl unable to create session");
//            e.printStackTrace();
//        }
//
//    }


    @Override
    public boolean saveStudent(Student student) {
         flag=false;
        Session session = sessionFactory.openSession();

        try {
           transaction=session.beginTransaction();
           session.persist(student);
           transaction.commit();
            System.out.println("student successfully saved");
            flag=true;

        }catch (Exception e){
            if(transaction!=null){
                flag=false;
                transaction.rollback();}

            e.printStackTrace();
        }finally {
            session.close();
        }
        return flag;
    }

    @Override
    public Student findById(int id) throws NullPointerException {
        Session session = sessionFactory.openSession();
        Student student=null;
        try{
            transaction=session.beginTransaction();

             student = (Student) session.find(Student.class, id);
            transaction.commit();
            System.out.println("student successfully found");

        }catch (Exception e){
            if(transaction!=null){
                flag=false;
                transaction.rollback();
                System.out.println("student not found"+e.getMessage());

            }
        }finally{
            session.close();
        }
        return student ;
    }

    @Override
    public List<Student> findAll() {
        return List.of();
    }

    @Override
    public  boolean updateStudent() {
        return false;
    }

    @Override
    public boolean deleteStudent(int id) {
        return false;
    }

    @Override
    public boolean deactivateStudent(int id) {

        Session session = sessionFactory.openSession();

        try{
            transaction= session.beginTransaction();

            transaction.commit();
                flag=true;
            System.out.println("student successfully deactivated");

        }catch(Exception e){
            e.printStackTrace();

            System.out.println("student failed to deactivate");

        }finally {
            session.close();
        }
        return false;
    }

    @Override
    public boolean activateStudent(int id) {
        Session session = sessionFactory.openSession();

        try{
            transaction= session.beginTransaction();
            System.out.println(session.merge(session.find(Student.class, id)).toString());
            transaction.commit();
            flag=true;
            System.out.println("student successfully activated");
        }   catch(Exception e){
            e.printStackTrace();
            System.out.println("student failed to activate");

        }finally {
            session.close();
        }

        return flag;
    }
}
