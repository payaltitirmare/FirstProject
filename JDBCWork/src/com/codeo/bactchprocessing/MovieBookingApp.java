package com.codeo.bactchprocessing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class MovieBookingApp {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

		String movie_name=null;
		String person_name=null;
		String age=null;
		double movie_rate=0.0;
		int result[];
		int viewers;
		int seat_no =3;
		
		System.out.println("enter no of viwers");
		viewers=sc.nextInt();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Establish the connection between database software and app
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/tiket_booking","root","");
	
			String insert_query="insert into booking(viwer_name, age, seat_no, movie_name, movie_rate) values(?,?,?,?,?)";
			System.out.println(insert_query);
		PreparedStatement psmt=null;
			if(con!=null)
			{
				psmt = con.prepareStatement(insert_query);
			}
		
			//depending on user value;
			for(int i=0;i<viewers;i++)
			{
				System.out.println("Enter Movie Name");
				movie_name=sc.next();
				System.out.println("Enter Person Name");
				person_name=sc.next();
				System.out.println("Enter Person Age");
				age=sc.next();
			
		
		try {
		psmt.setString(1, person_name);
		psmt.setNString(2, age );
		psmt.setInt(3, seat_no);
		psmt.setString(4, movie_name);
		
		if(movie_name.equals("LalSinghChada")) {
			movie_rate=200.34;
			psmt.setDouble(5, movie_rate);
			seat_no++;
		}
		else if(movie_name.equals("RakshaBandhan")) {
			movie_rate=234.32;
			psmt.setDouble(5, movie_rate);
			seat_no++;
		}
		else {
			System.out.println("Enter Proper input");
		}
		
		psmt.addBatch();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
			}
		result=psmt.executeBatch();
			
		if(result!=null) {
			System.out.println("Movie group booking done successfully");
		}
		else {
			System.out.println("Faliure in group booking");
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
