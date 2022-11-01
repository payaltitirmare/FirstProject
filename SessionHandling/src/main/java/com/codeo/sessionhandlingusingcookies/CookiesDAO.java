package com.codeo.sessionhandlingusingcookies;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class CookiesDAO {

	public static DataSource ds =null;

	public void formconnection(String name, String email, String education, String subject1, String subject2,
			String subject3, String dob, int age) {
		
		String configure_file_path ="src/main/java/com/codeo/sessionhandlingusingcookies/db.properties";
		
		 HikariConfig hcfg=new HikariConfig(configure_file_path);
		
		HikariDataSource hdata = new HikariDataSource();
		Connection con=null;
		
		PreparedStatement psmt=null;
		String query ="insert into cookiedata(name, email, education, subject1, subject2, subject3, dob, age)";
		
		
			try {
				
				con = hdata.getConnection();
				psmt = con.prepareStatement(query);
				int result =0;
				
				if(psmt!=null)
				{
					psmt.setString(1, name);
					psmt.setString(2, email);
					psmt.setString(3, education);
					psmt.setString(4, subject1);
					psmt.setString(5, subject2);
					psmt.setString(6, subject3);
					psmt.setString(7, dob);
					psmt.setString(8, String.valueOf(age));
				}
				
				if(psmt!=null)
				{
					result= psmt.executeUpdate();
				}
				
				if(result!=0)
				{
					System.out.println("data is inserted");
				}
				else
				{
					System.out.println("data is not inserted");
				}
				
				con.close();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
	}
	
	
	
}
