package com.hiber.MyHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchDemo {
	public static void main(String[] args) {
		//get      and     load
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session session=factory.openSession();
		//get-student:101
		
		Student std1=(Student)session.get(Student.class, 102);
		System.out.println(std1);
		Address ad=(Address)session.get(Address.class, 1);
		System.out.println(ad);
		
		session.close();
		factory.close();
	}
}
