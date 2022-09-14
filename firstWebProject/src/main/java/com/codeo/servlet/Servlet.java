package com.codeo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servlet")

public class Servlet extends HttpServlet {
	
	
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("this is conso");
		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		
		PrintWriter pw= response.getWriter();
		
		pw.println("<h1> this is get method of my servlet </h1>");
	}

	

}
