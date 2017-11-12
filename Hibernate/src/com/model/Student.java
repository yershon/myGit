package com.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Generated;

@Entity
public class Student {
	
	@Id
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name="Name_Column")
	private StudentName sname;
	@OneToMany(mappedBy = "student")
	private List<Address> address;
	

	public List<Address> getAddress() {
		return address;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}

	public StudentName getSname() {
		return sname;
	}

	public void setSname(StudentName sname) {
		this.sname = sname;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
//	public String getName() {
//		return Name;
//	}
//	
//	public void setName(String name) {
//		Name = name;
//	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", Name=" + sname.getFName()+","+ sname.getMName() +","+ sname.getLName() + "]";
	}

}
