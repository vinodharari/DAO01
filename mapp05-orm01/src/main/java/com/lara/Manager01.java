package com.lara;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Manager01 {
	public static void main(String[] args) {
		SessionFactory sf=(SessionFactory) Util.getObject("sessionBean");
		Session s1=sf.openSession();
		
		Person p1=new Person();
		p1.setPersonId("108");
		p1.setFirstName("vinod");
		p1.setLastName("jain");
		
		s1.beginTransaction();
			s1.save(p1);
		s1.getTransaction().commit();
		
		System.out.println("done");
	}
}
