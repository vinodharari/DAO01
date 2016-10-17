package com.lara;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Manager01 {
	public static void main(String[] args) throws Exception{
		Class.forName("com.mysql.jdbc.Driver");  
		  
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/01_DAO","root","");  
		  
		//here sonoo is database name, root is username and password  
		  
		Statement stmt=con.createStatement();  

		String sql = "CREATE table test(sno int) " ; 
		  
		stmt.execute(sql); 
		System.out.println("successfull!!!");
	}
}
