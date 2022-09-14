package com.codeo.preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

//excuting batch and inserting records multipal time 
public class PP {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "");
			String insert_query="insert into student(Name,clg_name,state) values(?,?,?)";
			
			PreparedStatement psmt =null;
			
			while(true) {
				
				
			psmt = con.prepareStatement(insert_query);
			
			psmt.setString(1, "payal");
			psmt.setString(2, "jnv");
			psmt.setString(3, "up");
			
			psmt.addBatch();
			
			psmt.setString(1, "usha");
			psmt.setString(2, "jnv");
			psmt.setString(3, "mp");
			
			psmt.addBatch();
		
			

			System.out.println("want to add more record: yes/no");
			String ans = sc.next();
			

			 if(ans.equals("no"))
				{
				break;
				}}	
				int[] res = psmt.executeBatch();
			
			System.out.println("record succefully saved to databse");
			con.close();
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
