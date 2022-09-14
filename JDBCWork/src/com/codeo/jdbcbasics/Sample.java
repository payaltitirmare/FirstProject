package com.codeo.jdbcbasics;

import java.sql.*;
import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		
		/*how to create connection with databse
		 * 
		 * 1 load and register file 
		 * 2 establish connection between jdbc(java databse connectivity) and database
		 *3 create a query 
		 *4 create statement or postpreparedstatement
		 *5 excute query
		 */
		
	//insert data from user
		//update data fromuser
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter name");
		String Name=sc.next();
		
		System.out.println("enter clg_name");
		String clg_name= sc.next();
		
		System.out.println("enter state");
		String state = sc.next();
		
		
		try {
			
            Class.forName("com.mysql.cj.jdbc.Driver");  
			
			Connection con = null;
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "");
		
			String insert_query="insert into student (Name,clg_name,state) values(?,?,?)";
			System.out.println(insert_query);
			PreparedStatement psmt=null;
			
			if(con!=null)
			{
				psmt = con.prepareStatement(insert_query);
			}
			
			if(psmt!=null) {
			psmt.setString(1, Name);
			psmt.setString(2, clg_name);
			psmt.setString(3, state);
			}
			//String update_query="update student set Name='"+Name+"' where id=9";
			//String delete_query="delete from student where Name='payal'";
			
			int res=0;
			
			if(psmt!=null)
			{
			 res=psmt.executeUpdate();
			
			}
			
			psmt.close();
			con.close();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}}