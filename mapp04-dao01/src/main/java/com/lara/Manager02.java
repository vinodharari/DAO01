package com.lara;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Manager02 {
	public static void main(String[] args) throws Exception{
		DriverManagerDataSource ds=new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/01_DAO");
		ds.setUsername("root");
		ds.setPassword("");
		
		JdbcTemplate template=new JdbcTemplate();
		template.setDataSource(ds);
		
		template.update("insert into test values(101)");
		System.out.println("successfull!!!");
	}
}
