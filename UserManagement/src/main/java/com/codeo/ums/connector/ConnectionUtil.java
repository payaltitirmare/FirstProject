package com.codeo.ums.connector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {

	
	private static final String Driver_class = "com.mysql.cj.jdbc.Driver" ;
	private static final String Url = "jdbc:mysql://localhost:3306/usermanagementsystem";
	private static final String User_name="root";
	private static final String password ="";
	
	
	public static Connection getconnection() {
	
		 Connection con =null;
		try {
			Class.forName(Driver_class);
			
			con = DriverManager.getConnection(Url, User_name, password);
			
		} 
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		
		return con;
	}
	
	
	
}
