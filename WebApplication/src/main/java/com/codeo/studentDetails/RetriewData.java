package com.codeo.studentDetails;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/FromSubmit")  // configure servlet

public class RetriewData extends HttpServlet {
	
	
     private String table_name = null;
     private PrintWriter pw =null;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		pw = response.getWriter();
		
		table_name= request.getParameter("table");
		
		System.out.println(table_name);
		
		RetriewDOB rr = new RetriewDOB( );
			rr.GetData();
			
		RetrDOB dd = new RetrDOB(table_name,pw );
		dd.displayData();
	}

public String gettable_name() {
		return table_name;
	}

	public void settable_name(String table_name) {
		this.table_name = table_name;
	}

	public PrintWriter  getpw()
	{
		return pw;
	}
	public void setpw(PrintWriter pw)
	{
		this.pw = pw;
	}
}
