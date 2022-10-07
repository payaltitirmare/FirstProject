package com.codeo.sessionhandlingusingHiddenform;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hiddenform2")

public class HiddenForm2 extends HttpServlet {
	
	String name=null;
	String email = null;
	//int age = 0;
	PrintWriter pw =null;
	String branch =null;
	String subject1=null;
	String subject2 =null;
	String subject3=null;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 
		pw = response.getWriter();
		response.setContentType("text/html");
		response.setContentType("text/html");
		
		name = request.getParameter("name1");
		
		email = request.getParameter("email1");
		
		//age = Integer.parseInt(request.getParameter("age"));
		
		branch = request.getParameter("branch1");                 
		
		subject1 = request.getParameter("subject1");
		subject2 = request.getParameter("subject2");
		subject3 = request.getParameter("subject3");
		
		System.out.println(name+" "+email+" "+subject1+" "+subject2+" "+branch);

		pw.println(name+"  "+email+" branch"+" "+branch);
		
		BoneCpDataSource dd = new BoneCpDataSource();
		
		dd.getcon();
	}

}
