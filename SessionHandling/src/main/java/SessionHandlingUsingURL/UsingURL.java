package SessionHandlingUsingURL;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 @WebServlet("/URLFORM")

public class UsingURL extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
	
		PrintWriter pw = response.getWriter();
		
		String name = request.getParameter("name");
		String hobbies [] = request.getParameterValues("hobby");
		String email = request.getParameter("email");
		int age = Integer.parseInt(request.getParameter("age"));
		String shopping = request.getParameter("shopping");
		
		for(int i=0 ;i<hobbies.length ; i++)
		{
			pw.println(hobbies[i]+" ,");
			System.out.println(hobbies[i]);
		}
		
	
	pw.print("<h1 style= align:'center' >Welcome  "+ name+"<h1>" );
	
	pw.println("<a href='servleturl?uname="+name+"&uemail="+email+"&age="+age+"&shopping="+shopping+"'> visit here </a>");
	
	}

	
}
