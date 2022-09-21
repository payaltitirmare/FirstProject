package com.codeo.mservlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@MultipartConfig
public class DbConnection extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Form f = new Form();
		
		f.setName("name");
		f.setEmail("email");
		f.setPassword("password");
		f.setFilename("filename");
		
		System.out.println(f.getName());
		String name = f.getName();
		String email=f.getEmail();
		String password=f.getPassword();
		String filename = f.getFilename();
		
		try {
			RequestDispatcher rd = request.getRequestDispatcher("Form");
			rd.forward(request, response);
			
			System.out.println("this is db class");
			
				Class.forName("com.mysql.cj.jdbc.Driver");
			  
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "");
			
			String query ="insert into form(name, email, password, image) values(?,?,?,?)";
				PreparedStatement psmt =con.prepareStatement(query);
				
				//creating object of form class
				
				
				if(psmt!=null)
				{
					psmt.setString(1,name);
					psmt.setString(2, email);
					psmt.setString(3, password);
					psmt.setString(4, filename);
				}
				
				
				int result= 0;
				result = psmt.executeUpdate();
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
