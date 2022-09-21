package com.codeo.studentDetails;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;

public class StudentDetailsDao {

  public void addDetails(String name, String email, String password,InputStream file)
  {
	  try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			  
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "");
			
			String query ="insert into form(name, email, password, image) values(?,?,?,?)";
				PreparedStatement psmt =con.prepareStatement(query);
				
				if(psmt!=null)
				{
					psmt.setString(1, name);
					psmt.setString(2, email);
					psmt.setString(3, password);
					psmt.setBlob(4,file);
				}
				
		int result= 0;
				
		if(psmt!=null)
				{
					result = psmt.executeUpdate();
				}
		if(result !=0)
		{
			System.out.println("data is inserted");
		}
		else
		{
			System.out.println("data is not inserted");
		}
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
	} 
  }
	

