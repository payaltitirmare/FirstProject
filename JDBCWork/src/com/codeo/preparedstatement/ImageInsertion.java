package com.codeo.preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ImageInsertion {

	public static void main(String[] args) {
		

		Scanner sc= new Scanner(System.in);
         
		System.out.println("enter  name");
		String Name=sc.next();
		
		System.out.println("enter college name");
		String clg_name=sc.next();
		
		System.out.println("enter state");
		String state= sc.next();
		
		System.out.println("enter student pic");
		String image=sc.next();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con=null;
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","");
		
		PreparedStatement psmt= null;
		String insert_query = "insert into student (Name,clg_name,state,image) values(?,?,?,?) ";
		System.out.println(insert_query);
		if(con!=null)
		{
			psmt=con.prepareStatement(insert_query);
		}
		if(psmt!=null)
		{
			psmt.setString(1, Name);
			psmt.setString(2, clg_name);
			psmt.setString(3, state );
			psmt.setString(4, image);
			
		}
		
		int result=0;
		
		if(psmt!=null)
		{
			result = psmt.executeUpdate();
		}
		
		if(result!=0)
		{
			System.out.println("data is inserted");
		}
		else {
			System.out.println("data is not inserted");
		}
		
		psmt.close();
		con.close();
		}
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (Exception e){
			e.printStackTrace();
		}
	}

}
