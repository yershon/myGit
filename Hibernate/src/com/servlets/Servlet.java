package com.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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


/**
 * Servlet implementation class Servlet
 */
@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter()
		.append("Served at: ")
		.append(request.getContextPath())
		.append("<br>")
		.append("sname: ")
		.append(request.getParameter("sname"));
		
		add(request);
		System.out.println("sname: " + request.getParameter("sname"));
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	
	private void add(HttpServletRequest request) {
		
		Student student = new Student();
		student.setId(1);
		StudentName sname = new StudentName();
		sname.setFName(request.getParameter("fname"));
		sname.setLName(request.getParameter("lname"));
		sname.setMName(request.getParameter("mname"));
		student.setSname(sname);
		
		Address address = new Address();
		address.setId(101);
		address.setStreet(request.getParameter("street1"));
		
		Address address1 = new Address();
		address1.setId(102);
		address1.setStreet(request.getParameter("street2"));
		
		List<Address> L_address = new ArrayList<>();
		student.setAddress(L_address);
		student.getAddress().add(address);
		student.getAddress().add(address1);
		
		Configuration con = new Configuration().addAnnotatedClass(Student.class).addAnnotatedClass(Address.class);
		con.configure();
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		session.save(student);
		session.save(address);
		session.save(address1);
		
		Student student_fetch = new Student();
		Address address_fetch = new Address();
		
		student_fetch = (Student)session.get(Student.class, 1);
		System.out.println("##### The student with ID = 1:   " + student_fetch.toString());
		
		address_fetch = (Address)session.get(Address.class, 101);
		System.out.println("***** The Address with ID = 101:   " + address_fetch.toString());
		tx.commit();
		session.close();

	}

}
