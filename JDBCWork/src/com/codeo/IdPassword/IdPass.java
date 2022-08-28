package com.codeo.IdPassword;

import java.sql.*;
import java.util.Scanner;

public class IdPass {

	public static void main(String[] args) {
		
		/* id password from user
		 * load and register driver class
		 * establish connection between database and java application
		 * create query
		 * create statement
		 * excute query and statement
		 * */
		String username=null;
		String password=null;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("enter your Username");
		username= sc.next();
		
		System.out.println("enter your password");
		password = sc.next();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=null;
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/LoginForm","root","");
			
			String query="insert into IdPassword(username,password) values(?,?)";
			
			PreparedStatement psmt= null;
			if(con!=null)
			{
				psmt = con.prepareStatement(query);
			}
			
			psmt.setString(1, username);
			psmt.setString(2, password);
			
			
			int result=0 ;
			if(psmt!=null)
			{
				result = psmt.executeUpdate();
			}
			
			
			System.out.println("your username is: "+username);
			System.out.println("your password is: "+password);
			
			
			if(result!=0)
			{
				System.out.println("congratulation you login succefully ");
			}
			else {
				System.out.println("sorry! something went wrong");
			}
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
