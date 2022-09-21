package com.codeo.mservlet;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;


@MultipartConfig(maxFileSize = 16177215)
public class Prac extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  String name;
  String email;
  String password;
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		name = request.getParameter("Firstname");
		email = request.getParameter("email");
        password = request.getParameter("password");
       
        Part file = request.getPart("profilepic");
        
        String imgfile = file.getSubmittedFileName();
        
        InputStream ios = file.getInputStream();
        
        //ParcDOB pcb = new ParcDOB();
       //pcb.display(name, email, password, ios);
        ParcDOB.display(name, email, password, ios);
        
        
}}