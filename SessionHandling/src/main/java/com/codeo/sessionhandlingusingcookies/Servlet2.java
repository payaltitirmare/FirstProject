package com.codeo.sessionhandlingusingcookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet1")

public class Servlet2 extends HttpServlet {
	
	String name=null;
	String email=null;
	String mobile =null;
	String education =null;
	PrintWriter pw = null;
	String subject1 =null;
	String subject2 =null;
	String subject3 = null;
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try
		{
		pw = response.getWriter();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		subject1 = request.getParameter("subject1");
		subject2 = request.getParameter("subject2");
		subject3 = request.getParameter("subject3");
		
		Cookie cks[] = request.getCookies();
		if(cks !=null)
		{
			name = cks[1].getValue();
			 email=cks[2].getValue();
			 mobile=cks[3].getValue();
		   education=cks[4].getValue();
		   
		}
		
		Cookie ckf1=new Cookie("name2", name);
		Cookie ckf2=new Cookie("email2", email);
		Cookie ckf3=new Cookie("mobileno2", mobile);
		Cookie ckf4=new Cookie("education2", education);
		Cookie ckf5=new Cookie("subject21", subject1);
		Cookie ckf6=new Cookie("subject22", subject2);
		Cookie ckf7=new Cookie("subject23", subject3);
		//add cookie to response
				response.addCookie(ckf1);
				response.addCookie(ckf2);
				response.addCookie(ckf3);
				response.addCookie(ckf4);
				response.addCookie(ckf5);
				response.addCookie(ckf6);
				response.addCookie(ckf7);

		pw.println("<h1>last page of registration<h1>"
				+ "<body> <form action='servlet3' method='post'>"
				+ "<label>date of birth </label>"
				+ "<input type='date' name='dob'>"
				+ "<label> age </label>"
				+ "<input type='number' name='age'>"
				+ "<input type='submit' value='submit'>"
				+ "</form>"
				+" </body>");		
		
		System.out.println(name);     //here education print
		pw.println("<h1>"+" "+email+" "+mobile+" "+name+"</h1>");
		
		
		pw.println();

	}

}
