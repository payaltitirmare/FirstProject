package com.codeo.serverhandling;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/formcsession")
public class CookieServer extends HttpServlet {

	PrintWriter pw=null;
	String name=null;
	String email=null;
	String age=null;
	
	public void doPost(HttpServletRequest request , HttpServletResponse response) throws IOException
	{
		 name = request.getParameter("name");
		 email= request.getParameter("email");
		 age = request.getParameter("age");
		
		Cookie kk1 = new Cookie("name" , name);
		Cookie kk2 = new Cookie("email" , email);
		Cookie kk3 = new Cookie("age" , age);
		
		response.addCookie(kk1);
		response.addCookie(kk2);
		response.addCookie(kk3);
		
		System.out.println(name);
		
		pw = response.getWriter();
		
		pw.println("<body><form action='sscookie' method='post'/>"
				+ "<input type='text' name='firstnumber' />"
				+ "<input type='text' name='secondnumber'/>"
				+ "<input type='submit' value='add'/>"
				+ "</body></form>");
	}
	
}
