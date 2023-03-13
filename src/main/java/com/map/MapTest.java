package com.map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapTest 
{
	public static void main(String[]args)
	{
		Configuration cnfg = new Configuration();
		cnfg.configure("hibernate.cfg.xml");
		 SessionFactory factory = cnfg.buildSessionFactory();
		 
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		Question qt = new Question();
		qt.setQuestionId(12);
		qt.setQuestion("What is java");
		//<------------------------------>
		Answer ar = new Answer();
		ar.setAnswerid(14);
		ar.setAnswer("Java is programming language");
		ar.setQuestion(qt);
		
		//<------------------------------------->
		Question qt1 = new Question();
		qt1.setQuestionId(15);
		qt1.setQuestion("What is Android");
		//<------------------------------>
		Answer ar1 = new Answer();
		ar1.setAnswerid(16);
		ar1.setAnswer("Android is fronted Technoogy language");
		ar1.setQuestion(qt1);
		
		qt.setAnswer(ar);
		qt1.setAnswer(ar1);
		
		
		session.save(qt);
		session.save(qt1);
		
		
		
		tx.commit();
		session.close();
		 
	}

}
