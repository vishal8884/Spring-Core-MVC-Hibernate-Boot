package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class DeleteStudentDemo {

	public static void main(String[] args) {

		// create session factory

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
				.buildSessionFactory();

		// create session

		Session session = factory.getCurrentSession();

		try {

			int studentId = 1;

			// now get a new sesision and start transaction
			session = factory.getCurrentSession();
			session.beginTransaction();

			// retrive student based on id: primary key
			System.out.println("\nGetting student with id: " + studentId);

			Student myStudent = session.get(Student.class, studentId); // this gets the data from data base with id 1
            
//			//delete the student
//			System.out.println("Deleting student");
//			session.delete(myStudent);
			
			//delete the student alternate approach
			System.out.println("Deleting student");
			session.createQuery("delete from Student where id=2").executeUpdate();

			// commit the transaction

			session.getTransaction().commit();

			
		} finally {
			factory.close();
		}

	}

}
