																																																																																	package com.codeo.mp.controller;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.codeo.mp.Dao.ProductDaoImp;
import com.codeo.mp.entity.Product;

@WebServlet("/Productoperation")
@MultipartConfig
public class ProductOperationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	String prod_name = null;
	String prod_description = null;
	String prod_price = null;
	String prod_discount = null;
	String prod_quantity = null;
	String prod_imageName = null;
	Product product =null;
	PrintWriter pw = null;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		prod_name = request.getParameter("p_name");
		prod_description = request.getParameter("p_desc");
		prod_price = request.getParameter("p_price");
		prod_discount = request.getParameter("p_discount");
		prod_quantity = request.getParameter("p_quntity");
		
		pw = response.getWriter();
		
		System.out.println(prod_name+" "+prod_price+" "+ prod_quantity);
		
		Part file = request.getPart("p_image");
		
		prod_imageName = file.getSubmittedFileName();
		
		String uploadFile ="D:/java program/MegaProject/src/main/webapp/app-assets/img/"+prod_imageName;
		
		//for writing into file 
		FileOutputStream fos = new FileOutputStream(uploadFile);
		//for reading
		InputStream is = file.getInputStream();

		System.out.println("image name is "+ prod_imageName);
		
		byte[] data = new byte[is.available()] ;
	
		is.read();
		fos.write(data);
		fos.close();
		
		System.out.println(uploadFile);
		
		//entity class
		 product = new Product(prod_name ,prod_description, prod_price, prod_discount, prod_quantity, prod_imageName);
		 
		 ProductDaoImp prodaoimp = new ProductDaoImp();
		 boolean flag = false;
		 // persistent 
		 
		flag= prodaoimp.addProduct(product);
		 
		System.out.println("flag in servlet :"+ flag);
		
		 if(flag==true)
		 {
			 response.sendRedirect("View_product.jsp");
		 }
	}

}
