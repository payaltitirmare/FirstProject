package com.codeo.studentDetails;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RetriewDOB {

	String table_name=null;
	PrintWriter pw =null;
	
	public  void GetData() {
		
		RetriewData rd = new RetriewData();
		 table_name = rd.gettable_name();
	     pw = rd.getpw();
		
		
	System.out.println(rd.gettable_name());
	System.out.println(rd.getpw());
	
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
