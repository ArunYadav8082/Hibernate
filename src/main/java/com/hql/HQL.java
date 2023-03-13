package com.hql;

import java.util.Arrays;
import java.util.List;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.tut.Student;

public class HQL
{
	public static void main(String[] args)
	{
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		
		
		Session session = factory.openSession();
		
		
	//	String query = "from Student  as s where s.city = :x and  s.name = :n";
		//String query = "from Student as s where s.name = :x";
		String query = "from Student  s where s.id = :x";
	    Query q = session.createQuery(query);
	    q.setParameter("x", 1);
	   // q.setParameter("x","Abhay Yadav" );
	 //   q.setParameter("n", "Abhay Yadav");
	    
	   List<Student> list = q.list();
	  
	
	    
	    for(Student student : list)
	    {
	    	//System.out.println(student.getName());
	    	System.out.println(student.getName()+":"+student.getCity()+":"+student.getCountry()+":"+student.getLanguage());
	    }
	    System.out.println("<----------------------Deleate ------------------>");
	    // delete  query
	    
	   Transaction txt = session.beginTransaction();
	  /*  Query q2 = session.createQuery("delete from Student as s where s.city =:x");
	    
	    q2.setParameter("x", "Kanpur");
	    int r =  q2.executeUpdate();
	    System.out.println("Deleted");
	    System.out.println(r);*/
	 
//         update query
	   Query q3 = session.createQuery("update Student  set city =:c Where name = :n");
	   q3.setParameter("c", "Bhopal");
	  q3.setParameter("n", "Aditya Yadav");
       int r = q3.executeUpdate();
       System.out.println(r+":"+"Objects updated");
       
    
       
       // join query
   /*    
       String select = "FROM question1 q INNER JOIN answer a ON q.Id_answer1=a.Id_answer1";
       Query q4 = session.createQuery(select);
       List elist = q4.list(); 
       */
       
       
      Query q4 = session.createQuery("select q.question1 , q.questionid , a.answer1 from Question1 as q INNER JOIN q.answer1 as a");
       
       List<Object[]> List1 =  (q4).getResultList();
       
       System.out.println("<----------------------------->");
       
       System.out.println(List1);
       
      for(Object[] aa:List1)
       {
    	   System.out.println(Arrays.toString(aa));
       }
	   
	  
        txt.commit();
		session.close();
		factory.close();
	
	}

}
