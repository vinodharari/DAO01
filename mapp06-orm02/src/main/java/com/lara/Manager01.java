package com.lara;

import java.util.Properties;

import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;

public class Manager01 {
	public static void main(String[] args)throws Exception {
		DriverManagerDataSource ds=new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/01_ORM");
		ds.setUsername("root");
		ds.setPassword("");
		
		LocalSessionFactoryBean bean=new LocalSessionFactoryBean();
		bean.setDataSource(ds);
		Properties hibernateProperties=new Properties();
		hibernateProperties.put("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
		hibernateProperties.put("hibernate.hbm2ddl.auto", "create");
		hibernateProperties.put("hibernate.show_sql", "true");
		hibernateProperties.put("hibernate.connection.autocommit", "true");
		bean.setHibernateProperties(hibernateProperties);
		bean.setMappingResources("com/lara/Person.hbm.xml");
		bean.afterPropertiesSet();
		
		HibernateTemplate template=new HibernateTemplate();
		template.setSessionFactory(bean.getObject());
		template.setCheckWriteOperations(false);
		template.afterPropertiesSet();
		
		Person p1=new Person();
		p1.setId(102);
		p1.setFirstName("vinod");
		p1.setLastName("jain");
		p1.setAge(26);
		template.save(p1);
		System.out.println("done");
	}
}
