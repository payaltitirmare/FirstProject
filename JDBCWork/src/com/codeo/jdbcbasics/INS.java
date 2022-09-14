package com.codeo.jdbcbasics;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.exceptions.RSAException;

//insert data into databse
public class INS  {

	//how to retireiw data from database
	
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");  
			
			Connection con = null;
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "");
		
			Statement statement = null;
			
			if(con!=null)
			{
				statement = con.createStatement();
			}
			
			String query= "select Name ,state,image from student where id=15 ";
			
			
				ResultSet rs =statement.executeQuery(query);
			
			
			while(rs.next())
			{
				System.out.println(rs.getString(1)+", "+rs.getString(2)+","+rs.getBlob(3));
			}
			statement.close();
			con.close();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
}

	