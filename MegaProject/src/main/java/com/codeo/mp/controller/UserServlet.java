package com.codeo.mp.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.codeo.mp.Dao.UserDAO;
import com.codeo.mp.Dao.UserDAOImp;
import com.codeo.mp.entity.User;

@WebServlet("/")

public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  String uName= null;
  String uMobileno = null;
  String uAddress = null;
  String uEmail = null;
  String uPassword = null;
  PrintWriter pw = null;
  
	RequestDispatcher dispatcher = null;
	UserDAO userDAO = null;
	
	public void init()
	{
		 userDAO = new UserDAOImp();
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String action = request.getServletPath();
		
		switch(action)
		{
		
		case "/new" :
			showNewForm(request,response);
			break;
		case "/insert":
		   insertUser(request, response);
		   break;
		case "/update" :
			updateUser(request, response);
			break;
		case "/edit":	
		    showEditForm(request, response);
		    break;
		case "/delete" :
			try {
				deleteUser(request, response);
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			break;
			
		default :
			listUser(request , response);
			break;
     }
		}
	private void listUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		List<User> list = userDAO.selectAllUsers();
		request.setAttribute("list", list);
		RequestDispatcher dispatcher = request.getRequestDispatcher("UserList.jsp");
		dispatcher.forward(request, response);
		
	}
	private void deleteUser(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
		
		int id = Integer.parseInt(request.getParameter("id"));
		userDAO.deleteUser(id);
		response.sendRedirect("list");
		}
	private void showEditForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id = Integer.parseInt(request.getParameter("id"));
		User existingdata = userDAO.editUser (id);
		RequestDispatcher dispatcher = request.getRequestDispatcher("UserList.jsp");
		request.setAttribute("user", existingdata);
		dispatcher.forward(request, response);
	}
	private void updateUser(HttpServletRequest request, HttpServletResponse response) {
	
		int id = Integer.parseInt(request.getParameter("id"));
		 uName = request.getParameter("name");
		uMobileno = request.getParameter("contact");
		uAddress = request.getParameter("Address");
		uEmail = request.getParameter("email");
		uPassword = request.getParameter("pass");
			
		User user =new User(id ,uName , uMobileno, uAddress,uEmail, uPassword);
		userDAO.updateUser(user);
	
	}
	private void insertUser(HttpServletRequest request, HttpServletResponse response) {
		
		        uName = request.getParameter("name");
				uMobileno = request.getParameter("contact");
				uAddress = request.getParameter("Address");
				uEmail = request.getParameter("email");
				uPassword = request.getParameter("pass");
				
		User user = new User(uName , uMobileno, uAddress,uEmail, uPassword);
		userDAO.insertUser(user);
		try {
			response.sendRedirect("list");
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	private void showNewForm(HttpServletRequest request, HttpServletResponse response) {
	
	}
	
	
}
