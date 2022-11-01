package com.codeo.HiddenForm;

import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/HiddenForm")

public class HiddenForm extends HttpServlet{

	public void doPost(HttpServletRequest request , HttpServletResponse response)
	{
		
		try {
			
			PrintWriter pw = response.getWriter();
			response.setContentType("text/html");
			
			String name = request.getParameter("name");
			String email = request.getParameter("email");
		
			
			pw.println("<form action='hiddenForm2' method='post'>"
					+ "<label> Gender </label>"
					+ "<input type='radio' name='gender' value='male'>Male"
					+ "<input type='radio' name ='gender' value='female' >Female"
					+ "<input type='hidden' name='name'>"
					+ "<input type='hidden' name='email'>"
					+ "<input type='submit' value='next'>"
					+ ""
					+ "</form>");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
}
