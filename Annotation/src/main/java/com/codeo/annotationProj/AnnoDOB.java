package com.codeo.annotationProj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class AnnoDOB {

protected void isannotation (String name , String email){
		

	try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		  
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "");
		
		String query ="select * from form";
			
		Statement smt =con.prepareStatement(query);
		
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

	public AnnoDOB(String name, String email) {
		// TODO Auto-generated constructor stub
	}

	public AnnoDOB() {
		// TODO Auto-generated constructor stub
	}
}
