package com.lara;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Util {
	private static ClassPathXmlApplicationContext context;
	static {
		context=new ClassPathXmlApplicationContext("config.xml");
	}
	
	public static Object getObject(String id) {
		return context.getBean(id);
	}
}
