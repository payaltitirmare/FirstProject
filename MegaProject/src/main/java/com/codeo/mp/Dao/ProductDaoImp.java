package com.codeo.mp.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.codeo.mp.connection.DbUtil;
import com.codeo.mp.entity.Product;

public class ProductDaoImp implements ProductDao {

	
	private String insert_Product ="insert into product_operation(prod_name, prod_description, prod_price, prod_discount, prod_quantity,prod_imageName) values(?,?,?,?,?,?)";
	private String selct_product ="SELECT * FROM product_operation ";
	
	
	Connection con = null;
  PreparedStatement preparedStatement  =null;
    Statement statement = null;
    
    //insert product ----------------
	public boolean addProduct(Product product) {
		  PreparedStatement psmt = null;
		  con=DbUtil.getconnection();
		  boolean flag = false;
		
         if(con !=null) {
			try {
			psmt = con.prepareStatement(insert_Product);
			
				if(psmt!=null)
				{
					
					psmt.setString(1, product.getProd_name());
					psmt.setString(2, product.getProd_description());
					psmt.setString(3, product.getProd_price());
					psmt.setString(4, product.getProd_discount());
					psmt.setString(5, product.getProd_quantity());
					psmt.setString(6, product.getProd_imageName());
					
				}
				System.out.println(psmt);
			
					int result = psmt.executeUpdate(); 
				
				System.out.println("result is "+result);
				
				flag = true;
			} 
         
			catch (SQLException e) {
				e.printStackTrace();
			}
         }
	      	return true;
	   }

	//updating product -----------
	public boolean update(Product product) {
		boolean flag = false;
		try {
			String sql = "UPDATE product_operation SET name = '"+product.getProd_name()+"', "
					+ "description = '"+product.getProd_description()+"',  price = '"+product.getProd_price()+"', discount = '"+product.getProd_discount()+"',quantity = '"+product.getProd_quantity()+"',image = '"+product.getProd_imageName()+"' where id="+product.getId();
			con = DbUtil.getconnection();
			preparedStatement = con.prepareStatement(sql);
			preparedStatement.executeUpdate();
			flag = true;
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return flag;
	}

	@Override         //insert product ----------------
	
	public List<Product> getlist(){
	
		List<Product> list = new ArrayList<Product>();
				Product product = null;
		con = DbUtil.getconnection();
		try {
			statement = con.createStatement();
			ResultSet resultset =null;
			
			resultset =statement.executeQuery(selct_product);
			while(resultset.next())
			{
				product = new Product();
				product.setId(resultset.getInt(1));
				product.setProd_name(resultset.getString(2));
				product.setProd_description(resultset.getString(3));
				product.setProd_description(resultset.getString(4));
				product.setProd_discount(resultset.getString(5));
				product.setProd_imageName(resultset.getString(6));
			
				list.add(product);
			}
			
	
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
			return list;
	}
//delete query--------------
	@Override
	public boolean delete(int id) {
	 boolean status=false;
		String delete_query="DELETE  FROM product_operation where prod_id="+id;
		con = DbUtil.getconnection();
		try {
			preparedStatement = con.prepareStatement(delete_query);
			
			preparedStatement.executeUpdate();
			status =true;
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	
		return true;
	}

	@Override
	public Product editProd(int id) {
		
		Product product = new Product();
		String edit_query ="SELECT * FROM product_operation where id ="+id;
		ResultSet resultset= null;
		
		con= DbUtil.getconnection();
		try {
			statement = con.createStatement();
			 resultset= statement.executeQuery(edit_query);
			
			if(resultset.next())
			{
				product.setId(resultset.getInt("id"));
				product.setProd_name(resultset.getString("name"));
				
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return product;
		
		
	}

}
