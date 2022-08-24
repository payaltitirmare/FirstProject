package com.codeo.preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedInsert {

	public static void main(String[] args) {
	
		//insert data into database using prepared 

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");  
			
			Connection con = null;
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "");
		
			PreparedStatement prsmt = null;
			String insert_query="insert into student (Name,clg_name,state) values('maria','udemy','kerla') ,('sita','nnjc','odisha') ,('sughndha','gfg','maharstra')";
			System.out.println(insert_query);
			int result=0;
			if(con!=null)
			{
				 prsmt=con.prepareStatement(insert_query);
			}
			
			if(prsmt!=null)
			{
				result=prsmt.executeUpdate();
			}
			if(result==0)
			{
				System.out.println("data is not inserted");
			}
			else
				System.out.println("data is inserted succefully");
			
			prsmt.close();
			con.close();
		}
		
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
