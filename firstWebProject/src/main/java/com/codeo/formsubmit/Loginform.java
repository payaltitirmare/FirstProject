package com.codeo.formsubmit;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Loginform
 */
@WebServlet("/Loginform")

public class Loginform extends HttpServlet {
	
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException {
		PrintWriter pw=null;
		pw=response.getWriter();
		String email=null;
		String password=null;
		int age=0;
		response.setContentType("text/html");
		email=request.getParameter("email");
		System.out.println(email);
		password=request.getParameter("password");
		System.out.println(password);
	}
}
