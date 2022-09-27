package com.codeo.reportcard_generator;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.text.DecimalFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@MultipartConfig 
@WebServlet("/Registration")

public class ReportCard_Generator extends HttpServlet {
	
	String  firstname=null ;
	String lastname =null;
	String email =null;
	String password=null;
	String gender = null;
	String branch=null;
	int  age =0;
	String dob=null;
	String hobbies[]=null;
	int data_structure=0;
	int dbms =0;
	int os = 0;
	int total_marks;
	float percentage;
	float twoDigitsF;
	float average;
	String grade=null;
	String result;
	String wish;
	PrintWriter pw = null;
	
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		pw = response.getWriter();
		
		firstname = request.getParameter("firstname");
		lastname = request.getParameter("lastname");
		email = request.getParameter("email");
		password = request.getParameter("password");
		gender = request.getParameter("gender");
		branch = request.getParameter("branch");
		dob = request.getParameter("dob");
		age = Integer.parseInt(request.getParameter("age"));
		data_structure = Integer.parseInt(request.getParameter("DSA"));
		dbms = Integer.parseInt(request.getParameter("DBMS"));
		os = Integer.parseInt(request.getParameter("OS"));
		
		System.out.println(firstname+" "+lastname+" "+email);
	    
		hobbies = request.getParameterValues("hobbies");
		
		System.out.println(age+" "+dbms+" "+gender+" "+branch);
		
		
		Part file = request.getPart("profilepic");
		System.out.println(file);
		
		//String imagefileimage = file.getSubmittedFileName();
		
		if(file != null)
		{
			System.out.println(file.getContentType());
		}
		
		InputStream ios = null;
		ios = file.getInputStream();
		
		 total_marks = data_structure + dbms + os ;
		
		//logical part
	
		 percentage = total_marks/300.0f*100;
			
		//converting long decimal digits in only 2 digits
		 DecimalFormat decimalformat = new DecimalFormat("#.##");
			
			twoDigitsF = Float.valueOf(decimalformat.format(percentage));
		 
			average = total_marks/3.0f;
			
		if(percentage <= 100 && percentage >=60)
		{
			result ="pass";
			grade = "firstclass";
		}
		else if(percentage < 60 && percentage >= 40)
		{
			result="pass";
			grade = "second class";
		}
		else
		{
			result ="fail";
			grade = "third class";
		}
		if(result.equals("pass"))
		{
			wish="congratulations";
		}
		else {
			wish="Sorry You fail";
		}
		
		ReportCard_Generator rc = new ReportCard_Generator();
		
rc.Design(pw,firstname,lastname,gender,branch,age,dob,average,twoDigitsF,dbms,os,data_structure,total_marks,grade,result,hobbies,email,wish);
		
		RportCardDOB reportdob = new RportCardDOB(firstname, lastname, email, password, gender, branch, age,  data_structure, dbms, os, total_marks, twoDigitsF, average,ios,pw);
		reportdob.ReportConnection();
	
	}	
	
	public void Design(PrintWriter pw, String firstname, String lastname, String gender, String branch, int age,
			String dob, float average, float twoDigitsF, int dbms, int os, int data_structure, int total_marks,
			String grade, String result, String[] hobbies, String email, String wish) {
			
	pw.println("<h1 style='text-align:center; color:green;font-size: 50px'> Report generator </h1>");
	pw.println("<h1 style='text-align:center '> Student Name :" +firstname + " "+lastname +"</h1>");
	//pw.println("<h1 style='text-align:center ;color:#0000FF'> Student email : "+email+" </h1>");
	pw.println("<h1 style='text-align:center'>Roll no : 12</h1>");
	
	  pw.print("<h1 style='text-align:center;color:#D2691E'>hobbies : </h1>");
		for(int i=0 ; i< hobbies.length ; i++)
		{
			pw.print("<h2 style='text-align:center'>"+hobbies[i]+"</h2>");
		}
	  
      pw.println("<table align='center'>"
    		  +"       <tr >"
    		   +"     <th colspan = '7' style='border-style:solid; border-color:#96D4D4;border-collapse: collapse;color:#00FF00'><h1>Name :    "+firstname+ lastname+" </h1> </th>"
    		   +"       </tr>"
    		   + "      <tr >"
    		  +"      <th colspan = '7'style='border-style:solid; border-color: #96D4D4 ;color:#00FF00'><h1> gender:    "+gender+" </h1> </th> "
    		  +"     </tr>"
    		  + "      <tr >"
    		  + "      <tr >"
    		  +"      <th colspan = '7' style='border-style:solid; border-color: #96D4D4;color:#00FF00'><h1> Branch:    "+branch+" </h1> </th> "
    		  +"     </tr>"
    		  +"      <th colspan = '7' style='border-style:solid; border-color: #96D4D4;color:#00FF00'><h1> Age:    "+age+" </h1> </th> "
    		  +"     </tr>"
    		  + "      <tr >"
    		  +"      <th colspan = '7' style='border-style:solid; border-color: #96D4D4;color:#00FF00'><h1> DOB:    "+dob+" </h1> </th> "
    		  +"     </tr>"
    		  + "      <tr>" 
    		  +"      <th colspan = '3' style='border-style:solid; border-color: #96D4D4;color:#FA8072' ><h1>Marks </h1></th> "
    		  +"      <th colspan = '4' style='border-style:solid; border-color: #96D4D4' > </th> "
    		  +"     </tr>"
    		 
      		+ "      <tr style='color:blue'>"
      		+ "    <td style='border-style:solid; border-color: #96D4D4'><h1>data structure </h1></td>"
      		+"     <td style='border-style:solid; border-color: #96D4D4'><h1> dbms </h1></td>"  
      		+"      <td style='border-style:solid; border-color: #96D4D4'><h1> OS </h1></td>"
      		+"      <td style='border-style:solid; border-color: #96D4D4'><h1> total_marks </h1></td>"
      		+"     <td style='border-style:solid; border-color: #96D4D4'><h1> percentage </h1></td>"
      		+"     <td style='border-style:solid; border-color: #96D4D4'><h1> grade </h1></td>"
      		+"      <td style='border-style:solid; border-color: #96D4D4'><h1> result </h1></td>"
      		+ "  </tr> <br><br>"
      		
      		
      		+ "  <tr style= 'color: red ;font-size: 40px;border-style:solid; border-color: #96D4D4'>"
      		+ "    <td  style='border-style:solid; border-color: #96D4D4'>"+ data_structure+ "</td>"
      		+ "    <td style='border-style:solid; border-color: #96D4D4'>"+ dbms + "</td>"
      		+ "    <td style='border-style:solid; border-color: #96D4D4'>"+ os+ "</td>"
      		+ "    <td style='border-style:solid; border-color: #96D4D4'>"+ total_marks+ "</td>"
      		+ "    <td style='border-style:solid; border-color: #96D4D4'>"+twoDigitsF+ "</td>"
      		+ "    <td style='border-style:solid; border-color: #96D4D4; color:#800080'>"+ grade+ "</td>"
      		+ "    <td style='border-style:solid; border-color: #96D4D4;color: #FFFF00'>  "+ result + "</td>"
      		+"       </tr>"
      		+"        <tr>"
      		+"     <td colspan='7' style='color:#CD5C5C ;border-style:solid; border-color: #96D4D4;font-size: 40px'>  "+ wish + " </td>"
      		+"          </tr>"
      		+ "</table>");
	}
	
	
	
}
