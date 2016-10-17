package com.lara;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

public class Manager04 {
	public static void main(String[] args) {
		JdbcTemplate template=(JdbcTemplate)Util.getObject("template");
		template.execute("drop table emp_table");
		template.execute("create table person_p(sno int, name varchar(50), age int)");
		template.update("insert into person_p values(1, 'vinod', 20)");
		template.update("insert into person_p values(2, 'jain', 30)");
		template.update("insert into person_p values(3, 'vins', 40)");
		List list=template.queryForList("select * from person_p");
		System.out.println(list);
		
		System.out.println("done!!!");
	}
}
