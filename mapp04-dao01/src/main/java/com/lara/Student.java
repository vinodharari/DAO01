package com.lara;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;


public class Student {
	private String stdId;
	private String firstName;
	private String lastName;
	private int age;
	public String getStdId() {
		return stdId;
	}
	public void setStdId(String stdId) {
		this.stdId = stdId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String toString(){
		StringBuffer sb=new StringBuffer();
		sb.append("std id : "+stdId+",");
		sb.append("first Name : "+firstName+",");
		sb.append("last Name : "+lastName+",");
		sb.append("age : "+age);
		return sb.toString();
	}
	static class StudentRowMapper implements RowMapper<Student>{
		public Student mapRow(ResultSet arg0,int arg1) throws SQLException{
			Student std=new Student();
			std.setStdId(arg0.getString("std_id"));
			std.setFirstName(arg0.getString("first_name"));
			std.setLastName(arg0.getString("last_name"));
			std.setAge(arg0.getInt("age"));
			return std;
		}
	}
}
