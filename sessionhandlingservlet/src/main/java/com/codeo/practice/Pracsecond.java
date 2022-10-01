package com.codeo.practice;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/form_data_of")

public class Pracsecond extends HttpServlet {
	String name=null;
	String email=null;
	String education =null;
	PrintWriter pw = null;
	String subject1 =null;
	String subject2 = null;
	String subject3 = null;
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		pw = response.getWriter();
		
		subject1 = request.getParameter("subject1");
		subject2 = request.getParameter("subject2");
		subject3 = request.getParameter("subject3");
		
		Cookie cks[] = request.getCookies();
		
		if(cks!=null) 
		{
		
				 name = cks[0].getValue();
					email = cks[1].getValue();
		            education= cks[2].getValue();
			
		}
		
		pw.print(name+" "+email+" "+education+" ");
		
		System.out.println(name+" "+education);
		
		
		
	}

}
