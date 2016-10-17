package com.lara;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

public class PersonDAO {
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public void setUp() {
		String sql="create table person(sno int, name varchar(90), age int)";
		jdbcTemplate.execute(sql);
	}
	
	public void save(int sno, String name, int age) {
		String sql="insert into person values("+sno+",'"+name+"',"+age+")";
		jdbcTemplate.update(sql);
	}
	
	public void update(int sno, String name, int age) {
		String sql="update person set name='"+name+"', age="+age+" where sno=" +sno;
		jdbcTemplate.update(sql);
	}
	
	public void delete(int sno) {
		String sql="delete from person where sno=" + sno;
		jdbcTemplate.update(sql);
	}
	
	public List<Map<String, Object>> read(int sno){
		String sql="select * from person where sno= "+sno;
		List<Map<String, Object>> list=jdbcTemplate.queryForList(sql);
		return list;
	}
	
	public List<Map<String, Object>> readAll(){
		String sql="select * from person";
		List<Map<String, Object>> list=jdbcTemplate.queryForList(sql);
		return list;
	}
}
