package com.codeo.ums.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.codeo.ums.Dao.UserDao;
import com.codeo.ums.entity.User;

@WebServlet("/")

public class UserManagement extends HttpServlet {
	

	String name = null;
	String email = null;
	String country = null;
	UserDao userdao = null;
	PrintWriter pw = null;
	
	
	public void init()
	{
		this.userdao= new UserDao();
	}

	  public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

             this.doGet(request , response);
  
		//User user = new User(name, email, country);

		//userdao = new UserDao();

		//userdao.insertUser(user);

	}

	public void doGet(HttpServletRequest request , HttpServletResponse response )throws ServletException, IOException
	{
		String action = request.getServletPath();
		pw = response.getWriter();
		
		switch (action)
		{
		
          case "/insertdata" :
			insertUser(request , response);
			break;
		
          case "/updatedata" :
  			try {
				updateUser(request , response);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
  			break;
  			
  			default :
  				//listUser(request , response);
  				break;
		}
		}	
		

	   private void ShowRecords(HttpServletRequest request, HttpServletResponse response) {
		
		   pw.println("this is show records ");
		
	}

	public void insertUser(HttpServletRequest request, HttpServletResponse response) throws IOException {
			
			name = request.getParameter("name");
			email = request.getParameter("email");
			country = request.getParameter("country");
			User newuser = new User(name , email, country);
			userdao.insertUser(newuser);
			
			pw.println(name +" "+email+ " "+country +" ");
			
			
		}

	
	private void updateUser(HttpServletRequest request, HttpServletResponse response) throws SQLException {
		
		//int id = Integer.parseInt(request.getParameter("id"));
		name = request.getParameter("name");
		//email = request.getParameter("email");
		//country = request.getParameter("country");
		
		//User book = new User ( name);
		
		//userdao.updateUser(book);
		//userdao.updateUser(name);
		
		//response.sendRedirect(country);
	}


	

}
