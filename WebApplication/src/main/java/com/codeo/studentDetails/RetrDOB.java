package com.codeo.studentDetails;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RetrDOB {

	
	String table_name=null;
	PrintWriter pw =null;
	
	
	public RetrDOB(String table_name, PrintWriter pw) {
		this.table_name=table_name;
		this.pw = pw;
	}


	public  void displayData() {
	
		 try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			  
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "");
			
			String query ="select * from "+table_name+"";
			
			System.out.println(query);
			
				Statement stmt = null;
		
				stmt = con.createStatement();
				
		ResultSet result = stmt.executeQuery(query);
		
		while(result.next())
		{
		pw.print("<h1>"+result.getInt(1)+"</h1>");		
		pw.print("<h1>"+result.getString(2)+"</h1>");
		pw.print("<h1>"+result.getString(3)+"</h1>");
		pw.print("<h1>"+result.getString(4)+"</h1>");
		
		}
		}
		 catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
}
