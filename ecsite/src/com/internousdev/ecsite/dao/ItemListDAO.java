package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.ecsite.dto.ItemInfoDTO;
import com.internousdev.ecsite.util.DBConnector;

public class ItemListDAO {


	public ArrayList<ItemInfoDTO> getItemListInfo(){

		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		ArrayList<ItemInfoDTO> itemListDTO = new ArrayList<ItemInfoDTO>();

		String sql="select * from item_info_transaction";

		try{
			PreparedStatement ps = con.prepareStatement(sql);


			ResultSet rs = ps.executeQuery();

			while(rs.next()){
				ItemInfoDTO itemInfoDTO = new ItemInfoDTO();
				itemInfoDTO.setId(rs.getString("id"));
				itemInfoDTO.setItemName(rs.getString("item_name"));
				itemInfoDTO.setItemPrice(rs.getString("item_price"));
				itemInfoDTO.setItemStock(rs.getString("item_stock"));
				itemInfoDTO.setInsert_date(rs.getString("insert_date"));
				itemListDTO.add(itemInfoDTO);
			}
		}catch (Exception e){
			e.printStackTrace();
		}finally{
			try {
				con.close();
			} catch (SQLException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
		}
        return itemListDTO;

	}



}
