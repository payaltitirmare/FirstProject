package com.codeo.sessionhandlingusingHiddenform;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class BoneCpDataSource {

	public void getcon(){
	{
		
	try (Connection con = DBUtil.getConnection();
			
		Statement st =  con.createStatement();)
	{
		
		System.out.println(con);
		String SQL = " SELECT * FROM employee";
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
	
}
