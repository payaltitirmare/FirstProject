package com.codeo.ums.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.codeo.ums.connector.ConnectionUtil;
import com.codeo.ums.entity.User;

public class UserDao {

	private static final String insert_query = "insert into usermanagement(name ,email,country) values(?,?,?)";
	private static final String select_all = "select * from usermanagement";
	public static final String update_user = "update usermanagement set name= ? where email= ?;";

	public UserDao() {

	}

	User user = null;

	Connection conn = ConnectionUtil.getconnection();

	// insert data into usermanagement
	
	public void insertUser(User user) {

		Connection conn = ConnectionUtil.getconnection();

		System.out.println("query is :" + insert_query);

		PreparedStatement psmt;
		try {
			psmt = conn.prepareStatement(insert_query);
			if (psmt != null) {
				psmt.setString(1, user.getName());
				psmt.setString(2, user.getEmail());
				psmt.setString(3, user.getCountry());
			}

			System.out.println("name : " + user.getName());

			System.out.println(psmt);

			int result = 0;
			if (psmt != null) {
				result = psmt.executeUpdate();
			}

			if (result != 0) {
				System.out.println("dats is isnerted succefully");
			} else {
				System.out.println("invalid data");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}


	// select all the user

	public List<User> selectAllUsers() {
		// we take list interface for adding all users together and pass to userobject
		// and it will return
		List<User> al = new ArrayList<User>();

		Connection conn = null;
		conn = ConnectionUtil.getconnection();
		try {
			PreparedStatement psmt = conn.prepareStatement(select_all);
			ResultSet rs = null;
			if (psmt != null) {
				rs = psmt.executeQuery();
			}

			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String email = rs.getString("email");
				String country = rs.getString("country");
				al.add(new User(id, name, email, country)); // we write this type because this is collection and we
				// want to pass all objectdata to user class contructor .
				user = new User(id, name, email,country);
				
				System.out.println(id+" "+name+" "+email+" "+country);
				
				System.out.println(al.get(0));
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}
		return al;
	}

	//// *******    update user method  *******////

	public boolean updateUser(User us) throws SQLException {

		boolean rowUpdate =false;
		Connection conn = null;
		conn = ConnectionUtil.getconnection();
		
		user = new User();

		PreparedStatement psmt = conn.prepareStatement(update_user);

		if (psmt != null) {
			
			psmt.setString(1, us.getName());
            psmt.setString(2, us.getEmail());
           
            System.out.println(us.getName()+" "+us.getEmail());
            
			rowUpdate = psmt.executeUpdate() > 0; // is this is greater than 0 then it
		
		}

		return rowUpdate;
	}

	
}
