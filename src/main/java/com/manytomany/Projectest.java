package com.manytomany;


import java.util.*;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Projectest
{

	public static void main(String[] args)
	{
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
//<------------------------------------>		
		Emp e1 = new Emp();
		e1.setEmpid(121);
		e1.setName("Abhay Yadav");
//<-------------------------------------->		
		Emp e2 = new Emp();
		e2.setEmpid(131);
		e2.setName("Aditya Yadav");
//<--------------------------------------->
		Project p1 = new Project();
		p1.setProjectid(12);
		p1.setName("Weather App");
		
//<------------------------------------------>
		Project p2 = new Project();
		p2.setProjectid(15);
		p2.setName("Manage Server");
		
		
//<-------------------------------------------->
		List<Project> list1 = new ArrayList<Project>();
		list1.add(p1);
		list1.add(p2);
//<--------------------------------------------->
		List<Emp> list2 = new ArrayList<Emp>();
		list2.add(e1);
		list2.add(e1);
		
		e1.setProject(list1);
		e2.setProject(list1);
		p1.setEmp(list2);
		p1.setEmp(list2);
//<------------------------------------------------>		
		Session session = factory.openSession();
		
		Transaction txt = session.beginTransaction();
		
		session.save(e1);
		session.save(e2);
		session.save(p1);
		session.save(p2);
//<---------------------------------------------->
		txt.commit();
		session.close();
		factory.close();
	}

}
