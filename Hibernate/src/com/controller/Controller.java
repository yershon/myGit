package com.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.model.Student;

public class Controller {

	public static void main(String[] args) {
		
		Student student = new Student();
		
		student.setName("Vadym");

		Configuration con = new Configuration().addAnnotatedClass(Student.class);
		con.configure();
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		session.save(student);
		tx.commit();
	}

}
