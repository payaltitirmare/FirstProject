package com.codeo.Hikaricp;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.*;



//this is client program 
public class Retriew {

	
	public static void main(String[] args) {
		String SELECT_SQL ="SELECT FROM employee";
		
		try(Connection conn =  ReadingDataFromDatabse.getDataSource().getConnection(); 
				PreparedStatement stmt = conn.prepareStatement(SELECT_SQL);
				ResultSet rs = stmt.executeQuery();)
		
		{
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2));
			}
		}
				catch(Exception e)
		{
					e.printStackTrace();
		}
				
				
				
		
	}
	
}
