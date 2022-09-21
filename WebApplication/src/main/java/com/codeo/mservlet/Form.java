package com.codeo.mservlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@MultipartConfig
public class Form extends HttpServlet {
	private static final long serialVersionUID = 1L;


	private String name;
	private String email;
	private String password;
	private String filename;
	
	
	
	public Form()
	{
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		
		 name =request.getParameter("Firstname");
		email = request.getParameter("email");
		 password= request.getParameter("password");
		
		Part part = request.getPart("profil");
		
		filename = part.getSubmittedFileName();
		System.out.println(name);
        System.out.println(filename);
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}
}
