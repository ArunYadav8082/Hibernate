package com.tut;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class FetchData {

	public static void main(String[] args)
	{
		// Get & Load
		
	    Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        
        Session session = (Session)factory.openSession();
        
        Student student = (Student)session.load(Student.class, 3);
        Student student1 = (Student)session.load(Student.class, 3);
        System.out.println(student1.getName());
        
    //    System.out.println(student);
        System.out.println("<----------------------->");
        
        Student ad =  (Student)session.get(Student.class, 2);
      // System.out.println(ad);
        System.out.println(ad.getState()+" "+ad.getCity());
        
        
        session.close();
        factory.close();
	}

}
