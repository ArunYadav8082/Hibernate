package com.pagination;


import java.util.List;
import java.util.Set;

import javax.persistence.Parameter;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.tut.Student;

public class HQLpagination {

	public static void main(String[] args)
	{
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		
		Session session = factory.openSession();
		
	    Query<Student> q =	session.createQuery("from Student");
	    
	    // implementing pagination
	    
	  //  q.setFirstResult(0);
	    
	    q.setFirstResult(8);
	    q.setMaxResults(1);
	    
     	List<Student> list = q.list();
     	
     	for(Student s:list)
     	{
     		System.out.println(s.getId()+" --> "+s.getName()+":"+s.getCity()+":"+s.getCountry());
     	}
     	System.out.println("<------------------------------------------->");
     	
     	// get all data in list using hql
     	
     	Query<Student> q1 = session.createQuery("from Student");
     	
     	List<Student> list1 = q1.getResultList();
     	
     	for(Student sa :list1)
     	{
     		System.out.println(sa.getId()+"-->"+sa.getName()+"-->"+sa.getCity());
     	}
     	
     
     	
     	
		
		
		
		session.close();
		factory.close();
		
	}

}
