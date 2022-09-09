package com.codeo.bonecp;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.Statement;

public class BoneCpDatasource {

	public static void main(String[] args)throws SQLException 
	{
		
	try (Connection con = DBUtil.getConnection();
			
		Statement st =  con.createStatement();){
		
		System.out.println(con);
		String SQL = " SELECT * FROM booking";
		System.out.println(SQL);
		ResultSet rs = st.executeQuery(SQL);
		
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
		}
	}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	
	
}
}