package com.controller;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.model.Address;
import com.model.Student;
import com.model.StudentName;

import antlr.collections.Enumerator;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 

public class Controller{

//@Override
//protected void doPost(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
//		System.out.println("I'm here");
//		
//		Student student = new Student();
//		student.setId(1);
//		StudentName sname = new StudentName();
//		sname.setFName(request.getParameter("sname"));
//		sname.setLName("Yershon");
//		sname.setMName("Grigorjevich");
//		student.setSname(sname);
//		
//		Address address = new Address();
//		address.setId(101);
//		address.setStreet("Görlitzer Str.");
//		
//		Address address1 = new Address();
//		address1.setId(102);
//		address1.setStreet("Freiburgeroberfeld Str.");
//		
//		List<Address> L_address = new ArrayList<>();
//		student.setAddress(L_address);
//		student.getAddress().add(address);
//		student.getAddress().add(address1);
//		
//		Configuration con = new Configuration().addAnnotatedClass(Student.class).addAnnotatedClass(Address.class);
//		con.configure();
//		SessionFactory sf = con.buildSessionFactory();
//		Session session = sf.openSession();
//		Transaction tx = session.beginTransaction();
//		
//		session.save(student);
//		session.save(address);
//		session.save(address1);
//		
//		Student student_fetch = new Student();
//		Address address_fetch = new Address();
//		
//		student_fetch = (Student)session.get(Student.class, 1);
//		System.out.println("##### The student with ID = 1:   " + student_fetch.toString());
//		
//		address_fetch = (Address)session.get(Address.class, 101);
//		System.out.println("***** The Address with ID = 101:   " + address_fetch.toString());
//		tx.commit();
//		session.close();
//	}
//    
//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//    	// TODO Auto-generated method stub
//    	super.doGet(req, resp);
//    }

}
