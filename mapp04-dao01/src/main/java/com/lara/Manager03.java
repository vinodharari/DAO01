package com.lara;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

public class Manager03 {
	public static void main(String[] args) {
		JdbcTemplate template=(JdbcTemplate)Util.getObject("template");
		//template.execute("drop table emp_table");
		template.execute("create table emp_table(sno int, id int)");
		template.update("insert into emp_table values(1, 20)");
		template.update("insert into emp_table values(2, 30)");
		List list=template.queryForList("select * from emp_table");
		System.out.println(list);
		
		System.out.println("done!!!");
	}
}
