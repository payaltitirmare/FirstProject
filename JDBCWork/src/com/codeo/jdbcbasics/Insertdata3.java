package com.codeo.jdbcbasics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Insertdata3 {

	public static void main(String[] args) {
	//insert data from user
		
	Scanner sc = new Scanner(System.in);
	System.out.println("enter your name");
	String Name=sc.next();
	System.out.println("enter your college name");
	String clg_Name = sc.next();
	System.out.println("enter your state");
	String state = sc.next();
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		
		
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "");
		
		String query = "insert into student (Name ,clg_Name ,state) values('"+Name+"', '"+clg_Name+"', '"+state+"')";  //it gives exception thats why we write inside this ' '
		//bcz it is string and in databse string is write inside single inverted commas
	
		Statement stm = con.createStatement();
		
		int result = stm.executeUpdate(query);
		
		System.out.println(query);
		
		if(result >0)
		{
			System.out.println("data inserted successfully");
		}
		
		else 
			System.out.println("data is not inserted");
	} 
	
	catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	catch (SQLException e) {
	
		e.printStackTrace();
	}
	
	catch (Exception e) {
		
		e.printStackTrace();
	}
	
	
	
	
	
	
	}

}
