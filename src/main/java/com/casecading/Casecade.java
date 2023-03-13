package com.casecading;

import java.util.ArrayList;
import java.util.List;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.many.Answer1;
import com.many.Question1;

public class Casecade {

	public static void main(String[] args)
	{
		System.out.println("Project Started");
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		
		Session session = factory.openSession();
		
		Question1 q = new Question1();
		q.setQuestionid(455);
		q.setQuestion1("Whats is Submergrd arched Welding");
		
		
		Answer1 a = new Answer1();
		a.setAnswerid(198);
		a.setAnswer1("Welding is done AnyWhere");
		
		Answer1 a1 = new Answer1();
		a1.setAnswerid(200);
		a1.setAnswer1("Welding is pemanent joint");
		
		Answer1 a2 = new Answer1();
		a2.setAnswerid(195);
		a2.setAnswer1("Welding is done most important part of engg.");
		
		List<Answer1> list = new ArrayList<Answer1>();
		list.add(a);
		list.add(a1);
		list.add(a2);
		
		q.setAnswer1(list);
		
		Transaction txt = (Transaction) session.beginTransaction();
		
		
		// using casecading not recommdedd to sepratly answer is saved used in  entity class 
		
		session.save(q);
		
		
		
		txt.commit();
		session.close();
		factory.close();
		
	
	}

}
