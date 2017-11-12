package com.model;

import javax.persistence.Embeddable;

@Embeddable
public class StudentName {
	
	private String FName;
	private String LName;
	private String MName;
	public String getFName() {
		return FName;
	}
	public void setFName(String fName) {
		FName = fName;
	}
	public String getLName() {
		return LName;
	}
	public void setLName(String lName) {
		LName = lName;
	}
	public String getMName() {
		return MName;
	}
	public void setMName(String mName) {
		MName = mName;
	}
	@Override
	public String toString() {
		return "StudentName [FName=" + FName + ", LName=" + LName + ", MName=" + MName + "]";
	}

}
