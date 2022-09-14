package com.codeo.preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Practice {

	public static void main(String[] args)  {
		
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con =null;
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "");
			
			String query= "insert into student(Name,clg_name,state,image) values('saurabh','jnv','mp','C:/Users/cw/Pictures/Screenshots/1.jpg')";
			System.out.println(query);
			PreparedStatement psmt = null;
			
			if(con!=null)
			{
				psmt= con.prepareStatement(query);
			}
			
			
			int result =0;
			
			if(psmt!=null)
			{
				result = psmt.executeUpdate();
			}
			
			if(result==0)
			{
				System.out.println("data is not inserted");
			}
			else
			{
				System.out.println("data is inserted");
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
