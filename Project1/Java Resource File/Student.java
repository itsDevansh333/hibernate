package com.hiber.MyHibernate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
	
	@Id            //This annotation is used to make the following variable as primary key of the table
	private int sid;
	private String name;
	private String city;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int sid, String name, String city) {
		super();
		this.sid = sid;
		this.name = name;
		this.city = city;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", city=" + city + "]";
	}
}

