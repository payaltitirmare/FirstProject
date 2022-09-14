package com.codeo.bactchprocessing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class MovieBookingApp2 {
//here movie_rate sum....
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String person_name =null;
		String movie_name =null;
		String age =null;
		double movie_rate=0.0;
		int seat_no =3;
		int viewers;
		int result[];
		double sum=0;
		System.out.println("enter number of viewers");
		viewers=sc.nextInt();
		
		try {
          Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Establish the connection between database software and app
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/tiket_booking","root","");
	
	   		String query = "insert into booking (viwer_name,age,seat_no,movie_name,movie_rate) values(?,?,?,?,?)";
	
	   		PreparedStatement psmt =null;
	   		if(con!=null)
	   		{
	   			psmt=con.prepareStatement(query);
	   		}
	   		for(int i=0; i<viewers;i++)
	   		{
	   			System.out.println("enter movie name");
	   			movie_name=sc.next();
	   			
	   			System.out.println("enter person name");
	   			person_name =sc.next();
	   			
	   			System.out.println("enter person age");
	   			age= sc.next();
	   			
	   		
	   		psmt.setString(1, person_name);
	   		psmt.setString(2, age);
	   		psmt.setInt(3,seat_no);
	   		psmt.setString(4, movie_name);
	   		
	   		if(movie_name.equals("LalSinghChada")) {
	   			movie_rate=200.34;
	   			psmt.setDouble(5, movie_rate);
	   			seat_no++;
	   			sum=sum+ movie_rate;
	   			
	   		}
	   		else if(movie_name.equals("RakshaBandhan")) {
				movie_rate=234.32;
				psmt.setDouble(5, movie_rate);
				seat_no++;
				sum=sum+ movie_rate;
			}
	   		else {
	   			System.out.println("enter valid input");
	   		}
	   		
	   		psmt.addBatch();
	   		
	   		}
	   		
	   		result = psmt.executeBatch();
	   		
	   		System.out.println("total movie_rate ="+sum);
	   		if(result!=null)
	   		{
	   			System.out.println("succefully");
	   		}
	   		else {
	   			System.out.println("failure");
	   		}
	   		
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
