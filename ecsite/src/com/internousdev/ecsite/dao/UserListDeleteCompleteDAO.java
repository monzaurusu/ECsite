package com.internousdev.ecsite.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.ecsite.util.DBConnector;

public class UserListDeleteCompleteDAO {

	public int userListHistoryDelete(){

		DBConnector db = new DBConnector();
		Connection con = db.getConnection();

		String sql="delete from login_user_transaction where admin_flg is NULL ";

		PreparedStatement ps;

		int result = 0;
		try{

			ps=con.prepareStatement(sql);

			result = ps.executeUpdate();
		}catch (SQLException e){
			e.printStackTrace();
		}try{
			con.close();
		}catch (Exception e){
			e.printStackTrace();
		}
		return result;
	}


}
