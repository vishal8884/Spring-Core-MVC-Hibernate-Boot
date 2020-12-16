package com.luv2code.hibernate.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;


public class QueryStudentDemo {

	public static void main(String[] args) {

	// create session factory
		
		SessionFactory factory = new Configuration()
				                 .configure("hibernate.cfg.xml")
				                 .addAnnotatedClass(Student.class)
				                 .buildSessionFactory();
		
		// create session
		
		Session session = factory.getCurrentSession();
		
		try {
			
			//start a transaction
			session.beginTransaction();
			
			//query students
			List<Student> theStudents = session.createQuery("from Student").getResultList();
			
			//display the students
            displayStudents(theStudents);
            
            // query students last name uchiha
            theStudents = session.createQuery("from Student s where s.lastName='waters'").getResultList();
			
            System.out.println("\n students who have last name waters");
            displayStudents(theStudents);
            
            // query students lastname = uchiha or first name=vishal
            theStudents = session.createQuery("from Student s where s.lastName='waters' OR s.firstName='lee'").getResultList();
            
            System.out.println("\n students who have last name waters or firstname lee");
            displayStudents(theStudents);
            
         // query students which have email @anime.com
            theStudents = session.createQuery("from Student s where s.email LIKE '%anime.com'").getResultList();
            
            System.out.println("\n students who have email address ends with anime.com");
            displayStudents(theStudents);
            
			//commit transaction
			session.getTransaction().commit();
			System.out.println("Done");
			
		} finally {
			factory.close();
		}

	}

	private static void displayStudents(List<Student> theStudents) {
		for(Student tempStudent : theStudents)
		{
			System.out.println(tempStudent);
		}
	}
	}


