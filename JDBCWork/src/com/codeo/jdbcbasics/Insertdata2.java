package com.codeo.jdbcbasics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Insertdata2 {

	public static void main(String[] args) {
		
		 try {
				//Register JDBC Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//establish the connection
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","");
			//create Statement object
			Statement statement=null;
			if(con!=null) {
				statement=con.createStatement();
			}
			//prepare the query
			String query="insert into employee(empname, empsallary , age, state) values('durga','1200','22','maharstra')";
			
			System.out.println(query);
			
			int result=0;
			//send and execute the query 
			if(statement!=null) {
				result=statement.executeUpdate(query);
			}
			//process the result
			if(result==0) {
				System.out.println("Data is not inserted");
			}
			else {
				System.out.println("Data is inserted");
			}
		      statement.close();
			con.close();
			 }
			 catch(ClassNotFoundException e) {
				 e.printStackTrace();
			 }
			 catch(SQLException e) {
				 e.printStackTrace();
			 }
			 catch(Exception e) {
				 e.printStackTrace();
			 }
		
		
		
		
		
		
		
		
		
			
	}
}

