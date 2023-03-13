package com.tut;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Embeded {

	public static void main(String[] args)
	{
		
		 Configuration cfg = new Configuration();
	        cfg.configure("hibernate.cfg.xml");
	        SessionFactory factory = cfg.buildSessionFactory();
	        
	        Session session = (Session)factory.openSession();
	        Transaction tx  = session.beginTransaction();
	       // student 1 
	        Student st = new Student();
	        st.setName("Abhay Yadav");
	        st.setLanguage("English");
	        st.setCity("Maholi");
	        st.setState("Uttar Pradesh");
	        st.setCountry("India");
	       
	        // student  2
	        Student st1 = new Student();
	        st1.setName("Arun Yadav");
	        st1.setLanguage("English");
	        st1.setCity("Lucknow");
	        st1.setState("Uttar Pradesh");
	        st1.setCountry("India");
	       
	        
	        Certificate certi = new Certificate();
	        certi.setCourse("Mechanical Engg.");
	        certi.setDuration("4 Year");
	        st.setCerti(certi);
	        //----------------------------------
	        Certificate certi1 = new Certificate();
	        certi1.setCourse("Chemical Engg.");
	        certi1.setDuration("4 Year");
	        st1.setCerti(certi1);
	        
	        session.save(st);
	        session.save(st1);
	        System.out.println(st);
	        System.out.println(st1);
	        
	        tx.commit();
	        session.close();
	        factory.close();

	}

}
