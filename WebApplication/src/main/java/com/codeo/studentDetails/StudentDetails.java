package com.codeo.studentDetails;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@MultipartConfig

   public class StudentDetails extends HttpServlet {
	          private static final long serialVersionUID = 1L;
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getContentType();
		PrintWriter pw = response.getWriter();
		
		String name = null;
		String email = null;
		String password = null;
		
		name = request.getParameter("Firstname");
		email = request.getParameter("email");
		password = request.getParameter("password");
		
		Part file = request.getPart("profilepic");
		System.out.println(file);
		String imagefileimage = file.getSubmittedFileName();
		
		if(file != null)
		{
			System.out.println(file.getContentType());
		}
		
		InputStream ios = null;
		ios = file.getInputStream();
		System.out.println("select image"+ imagefileimage);
		
		StudentDetailsDao sdo = new StudentDetailsDao();
		sdo.addDetails(name, email, password, ios);
	}

}
