package com.codeo.servletmavenproj;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RetriewData extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	//established connection between application and databse
	
	String name=null;
	String email=null;
	String password = null;
	int age=0;
	
	
	public void dbconnection()
	{
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "");
			
			String query = "insert into serverdata(name,email,password,age) values('"+name+"','"+email+"' , '"+password+"' ,'"+age+"')";
			
			System.out.println(query);
			Statement stmt = con.createStatement();
			
			int result=0;
			if(stmt!=null)
			{
				result=stmt.executeUpdate(query);
			}
			
			if(result!=0)
			{
				System.out.println("succefull");
			}
			else
			{
				System.out.println("not exceute");
			}
			
			con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 catch (SQLException e) {
				
				e.printStackTrace();
			}
			
		
	}
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		this.dbconnection();
		
		response.setContentType("text/html");
		
		
		name = request.getParameter("name");
		email = request.getParameter("email");
		password = request.getParameter("password");
		age = Integer.parseInt(request.getParameter("age"));
		
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
