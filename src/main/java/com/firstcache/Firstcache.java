package com.firstcache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tut.Student;


public class Firstcache {

	public static void main(String[] args)
	{
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		
		Session session = factory.openSession();
		
		// by default first level cache
		
       Student st = session.get(Student.class, 2);
		
	   System.out.println(st);
	   
	   System.out.println("<------------------------------------->");
		
	  Student st1 = session.get(Student.class, 2);
	  System.out.println(st1);
	  
	  System.out.println(session.contains(st));
		
	  session.close();
	  
	// System.out.println(session.contains(st));
		
		
		
		
		
		factory.close();
		

	}

}
