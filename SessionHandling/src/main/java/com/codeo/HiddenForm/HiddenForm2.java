package com.codeo.HiddenForm;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hiddenForm2")
public class HiddenForm2  extends HttpServlet{

	
	public void doPost(HttpServletRequest request , HttpServletResponse response)
	
	{
		try {
			PrintWriter pw = response.getWriter();
			response.setContentType("text/html");
			String name = request.getParameter("name");
			String email = request.getParameter("email");
			String gender = request.getParameter("gender");
			
			pw.println(name +" "+email+ " "+gender);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
