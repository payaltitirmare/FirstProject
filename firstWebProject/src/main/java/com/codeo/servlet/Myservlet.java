package com.codeo.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Myservlet
 */
@WebServlet("/Myservlet")


public class Myservlet extends HttpServlet {
	

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("this is conso");
		
		
		response.setContentType("text/html");
		
		PrintWriter pw= response.getWriter();
		
		pw.println("<h1> this is get method of my servlet </h1>");
	
		
		Date dt =new Date();
	
		pw.println(dt);
}
	
}
