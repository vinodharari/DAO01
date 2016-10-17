package com.lara;

import org.springframework.orm.hibernate4.HibernateTemplate;

public class Manager02 {
	public static void main(String[] args) {
		HibernateTemplate template=(HibernateTemplate) Util.getObject("template");
		final Person p1=new Person();
		p1.setId(109);
		p1.setFirstName("vins");
		p1.setLastName("jains");
		p1.setAge(26);
		Object obj=template.save(p1);
		System.out.println("done with "+obj);
		System.out.println("done");
	}
}
