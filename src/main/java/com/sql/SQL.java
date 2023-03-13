package com.sql;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

import com.tut.Student;

public class SQL {

	public static void main(String[] args) 
	{
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		
		Session session = factory.openSession();
		
		// creating sql query
		
		String query = ("select*from Student_details");
		
		NativeQuery nq = session.createSQLQuery(query);
		
		List<Object[]> list = nq.getResultList();
		
		for(Object[] student : list)
		{
			System.out.println(Arrays.toString(student));
			//System.out.println((student[0]+":"+student[6]+":"+student[3]));
		}
		
		
		
		
		
		
		
		
		session.close();
		factory.close();
		
	}

}
