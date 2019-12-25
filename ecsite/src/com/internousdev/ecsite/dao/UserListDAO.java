package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.ecsite.dto.UserInfoDTO;
import com.internousdev.ecsite.util.DBConnector;


public class UserListDAO {

	public ArrayList<UserInfoDTO> getUserListInfo(){

		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		ArrayList<UserInfoDTO> userListDTO = new ArrayList<UserInfoDTO>();

		String sql="select * from login_user_transaction";

		try{
			PreparedStatement ps = con.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();

			while(rs.next()){
				UserInfoDTO DTO = new UserInfoDTO();
				DTO.setId(rs.getString("id"));
				DTO.setLoginId(rs.getString("login_id"));
				DTO.setLoginPassword(rs.getString("login_pass"));
				DTO.setUserName(rs.getString("user_name"));
				DTO.setInsert_date(rs.getString("insert_date"));
				userListDTO.add(DTO);
			}
		}catch (Exception e){
			e.printStackTrace();
		}
		try{
			con.close();
		}catch (SQLException e){
			e.printStackTrace();
		}
		return userListDTO;
	}


}
