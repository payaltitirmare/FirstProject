package com.codeo.reportcard_generator;

import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class RportCardDOB {

	String  firstname=null ;
	String lastname =null;
	String email =null;
	String password=null;
	String gender = null;
	String branch=null;
	int  age =0;
	String dob=null;
	int data_structure=0;
	int dbms =0;
	int os = 0;
	int total_marks;
	float twoDigitsF;
	float average;
	InputStream ios;
	PrintWriter pw = null;
	
	
	
	public RportCardDOB(String firstname, String lastname, String email, String password, String gender,
			String branch, int age, int data_structure, int dbms, int os, int total_marks,
			float twoDigitsF,float average, InputStream ios, PrintWriter pw) {
		
		this.firstname=firstname;
		this.lastname= lastname;
		this.email =email;
		this.password = password;
		this.gender = gender;
		this.branch = branch;
		this.age = age;
		this.data_structure = data_structure;
		this.dbms=dbms;
		this.os = os;
		this.total_marks=total_marks;
		this.twoDigitsF=twoDigitsF;
		this.average = average;
		this.ios = ios;
		this.pw =pw;
		
	}

	public void ReportConnection() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		  
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/report_generator", "root", "");
		
		String query ="insert into reportcard( firstname, lastname, email, password, gender, branch, age,  data_structure, dbms, os, total_marks, percentage, average,profile_pic) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		
		System.out.println(query);
		PreparedStatement psmt =null;
		
		if(con!=null) {
		    psmt = con.prepareStatement(query);
		}
		
		if(psmt!=null)
		{
			psmt.setString(1,firstname);
			psmt.setString( 2, lastname);
			psmt.setString(3, email);
			psmt.setString(4, password);
			psmt.setString(5, gender);
			psmt.setString(6, branch);
			psmt.setInt(7, age);
			psmt.setInt(8, data_structure);
			psmt.setInt(9, dbms);
			psmt.setInt(10, os);
			psmt.setInt(11, total_marks);
			psmt.setFloat(12, twoDigitsF);
			psmt.setFloat(13, average);
			psmt.setBlob(14 ,ios);
			
		}
		
		System.out.println("percentage  in db :"+twoDigitsF);
		System.out.println("image are in db : "+ios);
		System.out.println("total marks in db :"+total_marks);
		
		int result =0;
		
		if(psmt!= null)
		{
			result = psmt.executeUpdate();
		}
		
		if(result!=0)
		{
			pw.println("data is inserted");
		}
		else
		{
			pw.println("data is not inserted");
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
