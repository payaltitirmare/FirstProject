package com.codeo.Cookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cookiestech")

public class UsingCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	String name = null;
	String rollno = null;
	PrintWriter pw =null;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		name = request.getParameter("name");
		rollno = request.getParameter("rollno");
		pw = response.getWriter();
		
		Cookie ck1 = new Cookie("name", name);
		Cookie ck2 = new Cookie("rollno" , rollno);
		
		response.addCookie(ck1);
		response.addCookie(ck2);
	
		pw.println("<body><form action='cookiedata' method='post'>"
				+ "<label>Personal data</label>"
				+ "<label>Adhar no</label>"
				+ "<input type='number' name='adhar' />"
				+ "<label> Contact no</label>"
				+ "<input type='number' name='adhar' />"
				+ "<input type='submit' value='next'/"
				+ "</form></body>");
		
	}

}
