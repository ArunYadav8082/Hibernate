package com.many;


import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ManyMapping {

	public static void main(String[] args) 
	{
		Thread.currentThread().setName("Abhay");
		
		System.out.println("Project Started !!!!");

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
    	SessionFactory factory = cfg.buildSessionFactory();
    	
    	
		Question1 qt = new Question1();
		qt.setQuestionid(55);
		qt.setQuestion1("What is javatpoint");
//<------------------------------------------->
		Answer1 ar = new Answer1();
		ar.setAnswerid(63);
		ar.setAnswer1("Java is programming language");
		ar.setQuestion1(qt);
//<-------------------------------------------------->	
		Answer1 ar1 = new Answer1();
		ar1.setAnswerid(42);
		ar1.setAnswer1("Java has many Framwork");
		ar1.setQuestion1(qt);
// <---------------------------------------------------->
		Answer1 ar2 = new Answer1();
		ar2.setAnswerid(19);
		ar2.setAnswer1("Java has imporntant language for backend Developer");
		ar2.setQuestion1(qt);
		
	
		List<Answer1> list = new ArrayList<Answer1>();
		
		list.add(ar);
		list.add(ar1);
		list.add(ar2);
		
		qt.setAnswer1( list);
		
// <------------------------------------------------>
		
		
	
		
		
		
		
		
		
		 
	// save the question
		System.out.println("<------------------------------>");
		System.out.println(list);
		
		
		System.out.println("<----------------------------------->");
		System.out.println(qt);
		
		
		
	//	session.save(list);	
		
		Session session =(Session)factory.openSession();
		Transaction tx = session.beginTransaction();
		
		session.save(qt);
		
	   session.save(ar);
	   session.save(ar1);
	   session.save(ar2);
	   
	   System.out.println("<----------------------------->");
	   System.out.println(ar);
	   System.out.println(ar1);
	   System.out.println(ar2);
	   
	   
// <------------------------------->
	   // lazy loading concept
//
//	   Question q =(Question)session.get(Question.class, 344);
//	  System.out.println(q.getQuestionid());
//	  System.out.println(q.getQuestion());
	  
	  // Eagar loading concept 
	//  System.out.println(q.getAnswer().size());
	    
	
	   
	   
	   
	    tx.commit();
		session.close();
		factory.close();


	}

}
