package com.codeo.sessionhandlingusingcookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet3")

public class Servlet3 extends HttpServlet {
	
	String name=null;
	String email=null;
	String mobile =null;
	String education =null;
	PrintWriter pw = null;
	String subject1 =null;
	String subject2 =null;
	String subject3 = null;
	String dob =null;
	int age=0;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    pw= response.getWriter();
    dob = request.getParameter("dob");
    age = Integer.parseInt(request.getParameter("age"));
    
    Cookie ckk[] = request.getCookies();
    
    if(ckk !=null)
    {
    	name = ckk[1].getValue();
    	email = ckk[2].getValue();
    	mobile = ckk[3].getValue();
    	education=ckk[4].getValue();
    	subject1 = ckk[5].getValue();
    	subject2= ckk[6].getValue();
    	subject3 = ckk[7].getValue();
    	
    	
    }
    
    CookiesDAO sdo = new CookiesDAO();
    
    sdo.formconnection(name, email, education, subject1, subject2, subject3, dob, age);
	}

}
