package com.codeo.serverhandling;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/sscookie")

public class secondsession extends HttpServlet {

	String name;
	String email;
	String age;
	
	public void doPost(HttpServletRequest request , HttpServletResponse response)
	{
		
		int firstnumber = Integer.parseInt(request.getParameter("firstnumber"));
		int secondnumber = Integer.parseInt(request.getParameter("secondnumber"));
		
		Cookie ck[] = request.getCookies();
		
		if(ck !=null)
		{
			name=ck[1].getValue();
			email=ck[2].getValue();
			age=ck[3].getValue();
	
		}
		
		System.out.println(name +" "+email+" "+age);
		
		System.out.println(firstnumber+ " "+secondnumber);
	}
	
}
