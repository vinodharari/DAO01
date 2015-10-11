package com.lara;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

public class StudentDAO {
	private JdbcTemplate template;
	public void setTemplate(JdbcTemplate template){
		this.template=template;
	}
	public void setUp(){
		String sql="create table student(std_id varchar(10),first_name varchar(90),last_name varchar(90).age int)";
		template.execute(sql);
	}
	public void insert(Student std){
		StringBuffer sql=new StringBuffer();
		sql.append("insert into student values(");
		sql.append(""+std.getStdId()+"',");
		sql.append(""+std.getFirstName()+"',");
		sql.append(""+std.getFirstName()+"',");
		sql.append(std.getAge()+")");
		template.update(sql.toString());
	}
	public void update(Student std){
		StringBuffer sql=new StringBuffer();
		sql.append("update student set ");
		sql.append("first_name='"+std.getFirstName()+"',");
		sql.append("last_name='"+std.getLastName()+"',");
		sql.append("age="+std.getAge());
		sql.append("where std_id='"+std.getStdId()+"'");
		template.update(sql.toString());
	}
	public void delete(Student std){
		String sql="delete from student where std_id='"+std.getStdId()+"'";
		template.update(sql);
	}
	public Student read(String stdId){
		String sql="select * from student where std_id='"+stdId+"'";
		List<Student> list=template.query(sql, new Student.StudentRowMapper());
		return list.get(0);
	}
	public List<Student> readAll(){
		String sql="select * from student";
		List<Student> list=template.query(sql, new Student.StudentRowMapper());
		return list;
	}
}
