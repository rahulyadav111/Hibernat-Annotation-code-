package com.Hibernate.hibernateAnnotation2;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Configuration con=new Configuration().configure("hibernate.cfg.xml");
        SessionFactory factory=con.buildSessionFactory();
        Session session=factory.openSession();
        Transaction t=session.beginTransaction();
      /*  Student s=new Student(); insert code in database....
        s.setRoll(100);
        s.setSname("Rahul yadav");
        s.setCourse("MCA");
        session.save(s);
        t.commit();
        System.out.println("Done........");*/
        
 /*     Student obj1=session.get(Student.class, 1);   // update code  start from here!....
       obj1.setSname("Mo Anwar");
       session.update(obj1);
       t.commit();
       System.out.println("update successfully.....");    //update code from here!
   */     
       //delete code start from here!
       
       	Student obj2=session.get(Student.class, 3); 
       	obj2.setSname("Rahul yadav"); //delete code from here!
        session.delete(obj2);
       t.commit();
        System.out.println("your record is successfully deleted.....");  
        
        //delete code end from here!
        
        
     /*   System.out.println("Display your recorde...");    //display code start from here
        List list=session.createQuery("from Student ").list();
        Iterator it=list.iterator();
        while(it.hasNext())
        {
        	Student obj=(Student)it.next();
        	System.out.println("roll num is :"+obj.getRoll());
        	System.out.println("student name is  :"+obj.getSname());
        	System.out.println("student course is :"+obj.getCourse());
        }
        */  //display code end from here!
        
        Query query= session.createQuery("from Student");
        List list=query.list();
        Iterator it=list.iterator();
        while(it.hasNext())
        {
        	Student obj=(Student)it.next();
        	System.out.println("student Roll no is: "+obj.getRoll());
        	System.out.println("student name is : "+obj.getSname());
        	System.out.println("student course is : "+obj.getCourse());
        }
        
        
        
    }
}
