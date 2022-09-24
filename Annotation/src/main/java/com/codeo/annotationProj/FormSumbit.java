package com.codeo.annotationProj;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Form")

public class FormSumbit extends  HttpServlet{

	String name =null;
	String email= null;
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		
		PrintWriter pw = resp.getWriter();
		
		name = req.getParameter("name");
		email= req.getParameter("email");
		
		System.out.println(name);
		
		AnnoDOB aob = new AnnoDOB();
		aob.isannotation(name, email);
	}
	
	
	
}
