package com.codeo.mp.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.codeo.mp.connection.DbUtil;
import com.codeo.mp.entity.UserData;

public class UserDAOImp implements UserDAO {

	private String insert_data = "insert into user_registration(user_name, user_mobno, user_adderess, user_emailid, user_pass) values(?,?,?,?,?)" ;
	
	Connection con = DbUtil.getconnection();

	public boolean addData(UserData userdata) {
		boolean flag = false;
		
		PreparedStatement psmt = null;
		int result = 0;
		
		if(con != null)
		{
			try {
				psmt = con.prepareStatement(insert_data);
				
				if(psmt!=null)
				{
					psmt.setString(1, userdata.getuName());
					psmt.setString(2, userdata.getuMobileno());
					psmt.setString(3, userdata.getuAddress());
					psmt.setString(4, userdata.getuEmail());
					psmt.setString(5, userdata.getuPassword());
					
				}
				
				if(psmt!=null)
				{
					result = psmt.executeUpdate();
				}
				
				if(result!=0)
				{
					System.out.println("data is inserted");
				}
				else
				{
					System.out.println("data is not inserted");
				}
				flag=true;
				
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
             catch (Exception e) {
				
				e.printStackTrace();
			}
			
		}
		
		return true;
	}

	
}
