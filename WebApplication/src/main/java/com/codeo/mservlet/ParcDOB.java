package com.codeo.mservlet;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ParcDOB {

 static void display(String name, String email, String password, InputStream ios)
	{
		 try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			  
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "");
			
			String query ="select * from form";
				Statement stmt = null;
		
				stmt = con.createStatement();
				
		ResultSet result = stmt.executeQuery(query);
		
		while(result.next())
		{
			System.out.println(result.getInt(1)+" "+result.getString(2)+" "+result.getString(3)+" "+result.getString(4)+" "+result.getBlob(5));
		}
		
				
		}
		 catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
	
}
