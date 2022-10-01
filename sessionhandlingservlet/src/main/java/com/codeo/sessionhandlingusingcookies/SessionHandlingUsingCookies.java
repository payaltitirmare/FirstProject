package com.codeo.sessionhandlingusingcookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cookies")

public class SessionHandlingUsingCookies extends HttpServlet {

	String name=null;
	String email=null;
	String mobile =null;
	String education =null;
	PrintWriter pw = null;
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		pw =resp.getWriter();
		
		name = req.getParameter("name");
		email = req.getParameter("email");
		mobile = req.getParameter("mobileno");
		education = req.getParameter("education");
		
		System.out.println("1"+name);
		
		Cookie ck1 = new Cookie("name1" ,name);
		Cookie ck2 =new  Cookie("email1" ,email);
		Cookie ck3 = new Cookie("mobile1" , mobile);
		Cookie ck4 = new Cookie("education1" ,education);
		
		resp.addCookie(ck1);
		resp.addCookie(ck2);
		resp.addCookie(ck3);
		resp.addCookie(ck4);
		
		if (education.equals("science"))
		{
			
		pw.println("<body> <form  action='servlet1' method='post'>"
				+ "<label>welcome in science stream</label> "
				+ "<label> chemistry</label>"
				+ "<input type='text' name='subject1'>"
				+ "<label> physics</label>"
				+ "<input type='text' name='subject2'>"
				+ "<label> biology</label>"
				+ "<input type='text' name='subject3'>"
				+ "<input type='submit' value='next'>"
				+ "</form>"
				+" </body>");
		}
		else if(education.equals("art"))
		{
			pw.println("<body> <form  action='servlet1' method='post'>"
					+ "<label>welcome in arts stream</label> "
					+ "<label> english</label>"
					+ "<input type='text' name='subject1'>"
					+ "<label> marathi</label>"
					+ "<input type='text' name='subject2'>"
					+ "<label>history</label>"
					+ "<input type='text' name='subject3'>"
					+ "<input type='submit' value='next'>"
					+ "</form>"
					+" </body>");
		}
		else
		{
			pw.println("write proper input");
		}
		pw.close();
	}

	
	
	
}
