package com.codeo.ums.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.codeo.ums.Dao.UserDao;
import com.codeo.ums.entity.User;

@WebServlet("/Showrecord")
public class Showrecord extends HttpServlet {
	
	UserDao udao =null;
	User user =null;
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		PrintWriter pw = response.getWriter();
		
		udao = new UserDao();
		user = new User();
		List<User> listUser = udao.selectAllUsers();
		
		listUser=udao.selectAllUsers();

	   Iterator itr = listUser.iterator();
		
	  
		while(itr.hasNext())
		{
			pw.println("<center><table><thead><tr style=' border: 1px solid; border-collapse: collapse;'><td>"+itr.next()+"</td></tr><br></thead></table></center>");
		}
		
		System.out.println("=====================================");
		for(int i=0 ; i<listUser.size() ;i++)
		{
			pw.println("<center><table><thead><tr style=' border: 1px solid; border-collapse: collapse;'><td>"+listUser.get(i)+"</td></tr><br></thead></table></center>");
			System.out.println(listUser.get(i));
		}
		
	}
  
}
