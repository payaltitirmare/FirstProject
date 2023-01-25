package com.codeo.shop.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.codeo.shop.Dao.LoginDao;
import com.codeo.shop.Dao.LoginDaoImpl;
import com.codeo.shop.entity.Login;

@WebServlet("/Logincont")

public class LoginServlet extends HttpServlet {
	
	//LoginDao logindao = null;
	   //Login login = null;
	    public LoginServlet() {
	       
	    	//logindao = new LoginDaoImpl();
	    }

		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			//HttpSession session = request.getSession();
		 
		/*	login = new Login();
			login.setEmail(request.getParameter("Email"));
			login.setPassword(request.getParameter("password"));
				System.out.println(login.getEmail());
			System.out.println(login.getPassword());
				String result = logindao.loginCheck(login);
				if(result.equals("true")){
				session.setAttribute("email",login.getEmail());
				response.sendRedirect("index.jsp");
			}
			if(result.equals("false")){
				response.sendRedirect("loginfrom.jsp?status=false");
			}
			 if(result.equals("error")){
			    response.sendRedirect("loginfrom.jsp?status=error");
			}
			  
			*/
			// from here testing 
			
			String username = request.getParameter("Email");
			String password = request.getParameter("password");
			
			Login login = new Login();
			login.setEmail(username);
			login.setPassword(password);
			LoginDaoImpl logindao = new LoginDaoImpl();
			  try {
				 
				 String userValidate = logindao.loginCheck(login);
				 
				 if(userValidate.equals("Admin"))
				 {
				    HttpSession session = request.getSession();
				    session.setAttribute("Admin", username);
				    request.setAttribute(username, username);
				   request.getRequestDispatcher("dashbord.jsp").forward(request, response);
				 
				 }
				  else if (userValidate.equals("User"))
				{
					 HttpSession session = request.getSession();
					 session.setAttribute("User", username);
					 session.setAttribute("username", username);
					 request.getRequestDispatcher("index.jsp").forward(request, response);
					  
			   }
				  else {
					  
					  request.setAttribute("errorMessage", userValidate);
					  
					  request.getRequestDispatcher("Login.jsp").forward(request, response);
				  }
				 
				  }
			 catch(IOException e)
			 {
				e.printStackTrace(); 
			 }
			 catch(Exception e1)
			 {
				 e1.printStackTrace();
			 }
			 
		}

}
