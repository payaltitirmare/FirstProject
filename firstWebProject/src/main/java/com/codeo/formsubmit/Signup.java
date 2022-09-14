package com.codeo.formsubmit;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Signup extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter pw =resp.getWriter();
		
		resp.getContentType();
		
		String email =null;
		String password=null;
		
		email=req.getParameter("email");
		password = req.getParameter("password");
		
		System.out.println(email);
		System.out.println(password);
		
		pw.println("welcome mr/miss :"+email +" "+password);
		
	}

	
	
}
