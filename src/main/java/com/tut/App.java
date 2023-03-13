package com.tut;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.sql.Date;

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
    public static void main( String[] args ) throws IOException
    {
        System.out.println( "Project Started-->" );
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
       /* System.out.println(factory);*/
        // add the studends
        
      Session session = (Session) factory.openSession();
     Transaction tx = session.beginTransaction();
        
        Student st = new Student();
        st.setName("Abhay Yadav");
        st.setLanguage("Hindi");
        st.setCity("Lucknow");
        st.setState("Uttar Pradesh");
        st.setCountry("India");
        // second student
        Student st1 = new Student();
        st1.setName("Aditya Yadav");
        st1.setLanguage("Hindi");
        st1.setCity("Kanpur");
        st1.setState("Uttar Pradesh");
        st1.setCountry("India");
        // third students
        Student st2 = new Student();
        st2.setName("Bhupesh Yadav");
        st2.setLanguage("Hindi");
        st2.setCity("Lucknow");
        st2.setState("Uttar Pradesh");
        st2.setCountry("India");
        
        session.save(st2);
        
        session.save(st1);
        
        session.save(st);
        
       // adding the address details
        Address ad = new Address();
        ad.setStreet("IIM");
        ad.setCity("Lucknow");
        ad.setOpen(true);
        ad.setAddedDate(new java.util.Date());
        
        Address ad1 = new Address();
        ad1.setStreet("IIM");
        ad1.setCity("Bhopal");
        ad1.setOpen(true);
        ad1.setAddedDate(new java.util.Date());
        
        // save the image
        
        FileInputStream fis = new FileInputStream("src/main/java/arun image.jpg");
        byte[] Data = new byte[fis.available()];
        fis.read(Data);
        ad.setImage(Data);
        
        session.save(ad);
        session.save(ad1);
        
        System.out.println(ad);
        System.out.println(ad1);
        
        System.out.println(st);
        System.out.println(st1);
        System.out.println(st2);
        
        tx.commit();
        
        session.close();
        
    }
}
