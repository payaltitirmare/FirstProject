package com.codeo.webtemplate;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class WebTemplate extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter pw =resp.getWriter();
		resp.setContentType("text/html");
		
		String  name=null;
		String email=null;
		String password=null;
		String gender=null;
		String hobbies[]=null;
		int age=0;
		String education=null;
		
		name =req.getParameter("name");
		email=req.getParameter("email");
		password=req.getParameter("password");
		age = Integer.parseInt(req.getParameter("age"));
		gender=req.getParameter("gender");
		hobbies=req.getParameterValues("hobbies");
		education = req.getParameter("education");
		pw.println("<h1>welcome Dear "+name+"  <h1>");
		pw.println("welcome mr/miss : "+name);
		pw.print("<br/>");
		pw.println("your email is :"+email);
		pw.print("<br/>");
		pw.println("your age is :"+age);
		pw.print("<br/>");
		pw.println("your gender is :"+gender);
		pw.print("<br/>");
		pw.println("your education is :"+education);
		pw.print("<br/>");
		for(int i=0; i<hobbies.length; i++)
		{
			pw.println("hobbies :"+hobbies[i]);
		}
		
		
		pw.println("<h1>Thank You For Login<h1>");
		
	}

	
}
