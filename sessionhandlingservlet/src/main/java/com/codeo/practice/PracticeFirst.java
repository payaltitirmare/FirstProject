package com.codeo.practice;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/formsubmit")
public class PracticeFirst extends HttpServlet {

	 PrintWriter pw =null;
	 String name =null;
	 String email=null;
	 String education = null;
	 
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		pw = resp.getWriter();
		
		name = req.getParameter("personname");
		email= req.getParameter("personemail");
		education = req.getParameter("personeducation");
	
		Cookie ck1 = new Cookie("name", name);
		Cookie ck2 = new Cookie("email" , email);
		Cookie ck3 = new Cookie ("Education", education);
		;
		
		resp.addCookie(ck1);
		resp.addCookie(ck2);
		resp.addCookie(ck3);
		
		
		
		if (education.equals("12th"))
		{
			
		pw.println("<body> <form  action='form_data_of' method='post'>"
				+ "<label>welcome in science stream</label> "
				+ "<label> chemistry</label>"
				+ "<input type='text' name='subject1'>"
				+ "<label> physics</label>"
				+ "<input type='text' name='subject2'>"
				+ "<label> biology</label>"
				+ "<input type='text' name='subject3'>"
				+ "<input type='submit' value='submit'>"
				+ "</form>"
				+" </body>");
		}
		else if(education.equals("poly"))
		{
			pw.println("<body> <form  action='form_data_of' method='post'>"
					+ "<label>welcome in arts stream</label> "
					+ "<label> english</label>"
					+ "<input type='text' name='subject1'>"
					+ "<label> marathi</label>"
					+ "<input type='text' name='subject2'>"
					+ "<label>history</label>"
					+ "<input type='text' name='subject3'>"
					+ "<input type='submit' value='submit'>"
					+ "</form>"
					+" </body>");
		}
		else
		{
			pw.println("write proper input");
		}
		pw.close();
		
	}

	
	
	
}
