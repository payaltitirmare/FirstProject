package com.codeo.mp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.codeo.mp.Dao.UserDAO;
import com.codeo.mp.Dao.UserDAOImp;
import com.codeo.mp.entity.UserData;

@WebServlet("/Userservlet")

public class User extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  String uName= null;
  String uMobileno = null;
  String uAddress = null;
  String uEmail = null;
  String uPassword = null;
 
  PrintWriter pw = null;
   UserData  userdata = null;	
	RequestDispatcher dispatcher = null;
	UserDAO userdao=null;
	
	public User()
	{
		 userdao = new UserDAOImp();
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		uName = request.getParameter("name");
		uMobileno = request.getParameter("contact");
		uAddress = request.getParameter("Address");
		uEmail = request.getParameter("email");
		uPassword = request.getParameter("pass");
		
		userdata = new UserData(uName ,uMobileno, uAddress, uEmail, uPassword);
		
		
		
		boolean flag = false;
		
		flag = userdao.addData(userdata);
		System.out.println(flag);
		if(flag== true)
		{
			response.sendRedirect("UserList.jsp");
		}
	}

}
