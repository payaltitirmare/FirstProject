package com.codeo.DatabaseConnection;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DbForm extends HttpServlet {
	private static final long serialVersionUID = 1L;
   String name= null;
   String email = null;
   String password = null;
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		PrintWriter pw = response.getWriter();
		
		response.setContentType("text/html");
		
		name = request.getParameter("name");
		email = request.getParameter("email");
		password = request.getParameter("password");
		
		pw.println("data is inserted");
		
		
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "");
		System.out.println(con);
		
		String query="insert into form(name, email, password) values(?,?,?)";
		System.out.println(query);
		 PreparedStatement psmt=null;
		 psmt = con.prepareStatement(query);
		
		if(psmt !=null)
		{
			psmt.setString(1, name);
			psmt.setString(2, email);
			psmt.setString(3, password);
		}
		int result=0;
		if(psmt !=null)
		{
			result = psmt.executeUpdate();
		}
		
		if(result!= 0)
		{
			System.out.println("data inserted succefully ");
		}
		else
		{
			System.out.println("data is not inserted ");
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
