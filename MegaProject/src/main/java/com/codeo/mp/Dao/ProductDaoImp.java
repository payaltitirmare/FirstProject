package com.codeo.mp.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.codeo.mp.connection.DbUtil;
import com.codeo.mp.entity.Product;

public class ProductDaoImp implements ProductDao {

	private String insert_Product ="insert into product_operation(prod_name, prod_description, prod_ price, prod_discount, prod_quantity, prod_imageName) values(?,?,?,?,?,?)";
	
	Connection con = null;
    PreparedStatement psmt = null;
    Statement statement = null;
    
    
	public boolean addProduct(Product product) {
		
		con=DbUtil.getconnection();
		
		boolean flag = false;
         if(con !=null) {
			try {
		
				psmt = con.prepareStatement(insert_Product);
				
				System.out.println(psmt);
				System.out.println(insert_Product);
				
				if(psmt!=null)
				{
					
					psmt.setString(1, product.getProd_name());
					psmt.setString(2, product.getProd_description());
					psmt.setString(3, product.getProd_price());
					psmt.setString(4, product.getProd_discount());
					psmt.setString(5, product.getProd_quantity());
					psmt.setString(6, product.getProd_imageName());
					
					System.out.println("prodct name "+product.getProd_name());
					System.out.println("prodct name "+product.getProd_price());
					System.out.println("prodct name "+product.getProd_discount());
					System.out.println("prodct name "+product.getProd_imageName());
					
				}
				
				int result = 0;
				
				if(psmt !=null)
				{
					result = psmt.executeUpdate();
				}
				
				System.out.println(result);
				flag = true;
				
				if(result !=0)
				{
					System.out.println("dta is insertde");
				}
				else
				{
					System.out.println("data is not inserted");
				}
			} 
         
			catch (SQLException e) {
				e.printStackTrace();
			}
         }
	      	return true;
	   }

	public List<Product> list() {
	
		
		return null;
	}

}
