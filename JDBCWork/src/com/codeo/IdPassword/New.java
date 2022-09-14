package com.codeo.IdPassword;

import java.sql.*;
import java.util.Scanner;

public class New {

	public static void main(String[] args) {
		
		//prepared statement from user  update query
		
		/*Scanner sc = new Scanner(System.in);
	
		System.out.println("enter ename");
		String empname= sc.next();
		*/
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "");
			
			String query="update employee set empname='payal' where id=1";
			
			PreparedStatement psmt =null;
			
			psmt=con.prepareStatement(query);
		
			int result=0;
			
			result = psmt.executeUpdate();
			
			if(result!=0)
			{
				System.out.println("executed");
			}
		} catch (ClassNotFoundException e) {
			
		}
		catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
	}

}
