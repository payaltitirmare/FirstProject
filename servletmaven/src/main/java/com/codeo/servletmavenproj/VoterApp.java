package com.codeo.servletmavenproj;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class VoterApp extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
	 
		String name=null;
		String gender=null;
		int age=0;
		
		name=request.getParameter("name");
		gender=request.getParameter("gender");
		age =Integer.parseInt( request.getParameter("age"));
		
		if(age>=18)
		{
			pw.println("<h1 style='color:blue'>congratulation "+name+" you are eligibale for voting </h1>");
		}
		else
		{
			int diff=0;
			diff = 18-age;
			pw.println("<h1 style='color:green'> hey "+name+"come after "+age+ "years</h1");
		}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
