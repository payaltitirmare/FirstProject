package com.codeo.datetime;

import java.util.Date;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Datetimemonth extends HttpServlet{

	public void doPost(HttpServletRequest request , HttpServletResponse response)
	{
		
		Date d = new Date() ;
		
		d.getDate();
		
	}
	
	
}
