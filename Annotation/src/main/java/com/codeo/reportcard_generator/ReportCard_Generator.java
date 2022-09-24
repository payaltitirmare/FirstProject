package com.codeo.reportcard_generator;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@WebServlet("/Registration")
@MultipartConfig
public class ReportCard_Generator extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	String  firstname =null;
	String lastname=null;
	String email=null;
	String password=null;
	String gender = null;
	String branch=null;
	int  age =0;
	String dob=null;
	String hobbies[]=null;
	int data_structure=0;
	int dbms =0;
	int os = 0;
	int total_marks;
	float percentages;
	float average;
	PrintWriter pw = null;
	
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		pw = response.getWriter();
		
		firstname = request.getParameter("firstname");
		lastname = request.getParameter("lastname");
		email = request.getParameter("email");
		password = request.getParameter("password");
		gender = request.getParameter("gender");
		branch = request.getParameter("branch");
		dob = request.getParameter("dob");
		age = Integer.parseInt(request.getParameter("age"));
		data_structure = Integer.parseInt(request.getParameter("DSA"));
		dbms = Integer.parseInt(request.getParameter("DBMS"));
		os = Integer.parseInt(request.getParameter("OS"));
		
		System.out.println(firstname+" "+lastname+" "+email);
	    
		hobbies = request.getParameterValues("hobbies");
		
		pw.println("hobbies :");
		
		for(int i=0 ; i< hobbies.length ; i++)
		{
			pw.print(hobbies[i]);
		}
		
		Part file = request.getPart("profile-pic");
		String profile_pic = file.getSubmittedFileName();
		
		InputStream ios = null;
		ios = file.getInputStream();
		
		System.out.println(profile_pic);
	}

}
