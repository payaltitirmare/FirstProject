package com.codeo.jdbcbasics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateData {

	public static void main(String[] args) {
	
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "");
			String query ="update student set Name='krushna',clg_Name='smjc' where Id=2";
			
			Statement statement= con.createStatement();
			System.out.println("query");
			int result = statement.executeUpdate(query);
			
			if(result >0)
			{
				System.out.println("data updated succefully");
			}
			else
				System.out.println("data is not updated");
		} 
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
