package com.codeo.servletmavenproj;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class FirstForm extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
		
		String name=null;
		String email=null;
		String password=null;
		String gender=null;
		int age=0;
		
		name= request.getParameter("name");
		email = request.getParameter("email");
		password = request.getParameter("password");
		gender = request.getParameter("gender");
		age = Integer.parseInt(request.getParameter("age"));
		
		pw.println(name+email+age+gender);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
