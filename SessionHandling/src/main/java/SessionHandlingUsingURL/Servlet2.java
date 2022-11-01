package SessionHandlingUsingURL;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servleturl")
public class Servlet2 extends HttpServlet {
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		PrintWriter pw = response.getWriter();
		
		String name = request.getParameter("uname");
		String email = request.getParameter("uemail");
		int age = Integer.parseInt(request.getParameter("age"));
		
		pw.println("<h1> you are rdirected to this </h1>");
		
		String shopping = request.getParameter("shopping");
		
		pw.println("<h1>"+name+" "+email+ " "+ age + " "+shopping+" </h1>");
		
	
	}

	
}
