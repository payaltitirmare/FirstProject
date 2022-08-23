package com.codeo.jdbcbasics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Insertdata {

	//how to insert data into databse
	
	public static void main(String[] args) {

		/* steps for insert data
		 * 
		 * 1) load and register driver class
		 * 2) establish connection between database and application-- It
            // takes url that points to your database,
            // username and password of MySQL connections as arguments
             * 
		 * 3) create statement--creates statement object
            // which is responsible for executing queries on table
             * 
		 * 4) prepare query 
		 * 5) send and execute query
		 * 6) process the result 
		 * 7) close 
		 *  
		 */
 
		 try {
			 
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "");
			Statement statement = con.createStatement();
			String query = "insert into student(Name,clg_Name,state) values('usha','miet','maharastra')";
			

            // executeUpdate() is used for INSERT, UPDATE, DELETE statements.It returns number of rows
            // affected by the execution of the statement 
			
			int result= statement.executeUpdate(query);
			System.out.println(query);
	     System.out.println(result);
	     
		 if(result >0)
		 {
			 System.out.println("successfully inserted");
		 }
		 
		 else
			 System.out.println("unsucessful insertion ");
		
		 statement.close();
			con.close();
		 
		 } 
		 catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 catch(SQLException e)
		 {
			 e.printStackTrace();
		 }
		 catch (Exception e) {
				
				e.printStackTrace();
			}
		
	}
}
