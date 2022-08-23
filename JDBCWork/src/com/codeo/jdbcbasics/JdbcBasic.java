package com.codeo.jdbcbasics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcBasic {

	//how to read data from databse 
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
	//how to connect with database
	/*
	 * 1 load and register driver class
	 * 2 establish connection between application and databse
	 * 3 wite query 
	 * 4 create statement
	 * 4 retrieve the data from particular table
	 * 5 close
	 * 
	 */
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "") ;
		
		String query = "select * from employee";
		
		Statement statement = con.createStatement();
		
		ResultSet  resultset = statement.executeQuery(query);
		
		while(resultset.next())
		{
			System.out.println(resultset.getInt(1)+",  "+resultset.getString(2)+",  "+resultset.getString(3)+",  "+resultset.getString(4));
		}
		
		resultset.close();
		 statement.close();
		 con .close();
	
	}
	
	}




