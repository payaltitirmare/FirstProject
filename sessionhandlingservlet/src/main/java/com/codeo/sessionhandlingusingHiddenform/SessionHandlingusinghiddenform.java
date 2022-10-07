package com.codeo.sessionhandlingusingHiddenform;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Hiddenformsubmit")

public class SessionHandlingusinghiddenform extends HttpServlet {
	
	String name = null;
	String email = null;
	int age = 0;
	PrintWriter pw =null;
	String branch =null;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	pw = response.getWriter();
	
	response.setContentType("text/html");
	
	name = request.getParameter("name");
	
	email = request.getParameter("email");
	
	age = Integer.parseInt( request.getParameter("age"));
	
	branch = request.getParameter("branch");
	
	pw.println("<h1>"+name+" "+email+" "+" "+age+" "+branch+"</h1>");
	
	pw.println(branch);
	
	if(branch.equals("Computer"))
	{
		pw.println("<body><form action='hiddenform2' method='post'>"
				+ "<label> welcome computer branch </label>"
				+ "<label> C language</label>"
				+ "<input type='text' name='subject1'>"
				+ "<label> C++ language</label>"
				+ "<input type='text' name='subject2'>"
				+ "<label> java language</label>"
				+ "<input type='text' name='subject3'>"
				+ "<input type='hidden' name='name1' value='"+name+"'>"
				+ "<input type='hidden' name='email1'  value='"+email+"'>"
				+ "<input type='hidden' name='age11'  value='"+age+"'>"
				+ "<input type='hidden' name='branch1'  value='"+branch+"'>"
				+ "<input type='submit' value='next'>"
				+ "</form></body>");
	}
	
	else if(branch.equals("Civil"))
	{
		pw.println("<body><form action='hiddenform2' method='post'>"
				+ "<label> welcome civil branch </label>"
				+ "<label> maths </label>"
				+ "<input type='text' name='subject1'>"
				+ "<label> Designing</label>"
				+ "<input type='text' name='subject2'>"
				+ "<label> Concrete </label>"
				+ "<input type='text' name='subject3'>"
				+ "<input type='hidden' name='name1'  value='"+name+"'>"
				+ "<input type='hidden' name='email1'  value='"+email+"'>"
				+ "<input type='hidden' name='age1'  value='"+age+"'>"
				+ "<input type='hidden' name='branch1' value='"+branch+"'>"
				+ "<input type='submit' value='next'>"
				+ "</form></body>");
	}
	else {
		pw.println("<h1>enter proper input</h1>");
	}
	
	}

}
