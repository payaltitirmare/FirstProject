package com.codeo.ums.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.codeo.ums.Dao.UserDao;
import com.codeo.ums.entity.User;

@WebServlet("/Updatename")

public class Updatedata extends HttpServlet {
	private static final long serialVersionUID = 1L;

	UserDao udao = null;
	PrintWriter pw = null;
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		pw = response.getWriter();
		String name = request.getParameter("name");

		String email = request.getParameter("email");
		udao = new UserDao();
		
		User us = new User(name ,email);
         boolean updata =false;
	
			try {
				updata = udao.updateUser(us);
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
		System.out.println("it is :"+updata);
		
		pw.println("<h1>  record save succefully </h1>");
		pw.println("<h1> " + us.getName() + "</h1>");

		if (updata) {
			request.getRequestDispatcher("index.jsp").include(request, response);
		} else {
			request.getRequestDispatcher("UpdateName.jsp").include(request, response);
		}

	}

}
