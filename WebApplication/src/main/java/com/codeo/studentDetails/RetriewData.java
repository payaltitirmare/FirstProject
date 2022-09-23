package com.codeo.studentDetails;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/FromSubmit")

public class RetriewData extends HttpServlet {
	
	
       String table_name = null;
       PrintWriter pw =null;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		pw = response.getWriter();
		
		table_name= request.getParameter("table");
		
		System.out.println(table_name);
		
		RetriewDOB dob = new RetriewDOB(table_name,pw);
		
		dob.GetData();
		
	}

}
