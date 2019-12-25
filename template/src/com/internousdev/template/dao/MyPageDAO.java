package com.internousdev.template.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.template.dto.MyPageDTO;
import com.internousdev.template.util.DBConnector;

public class MyPageDAO {

	public MyPageDTO getMyPageUserInfo(String item_transaction_id, String user_master_id){

		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		MyPageDTO myPageDTO = new MyPageDTO();
		                                                                                                        //ubit(user_buy_item_transaction) が親テーブル              ubit.item_transaction_idとiit.idの中身が一致するものだけ表示するという結合条件、ubitが親なので、iitにないものはnullになる。
		String sql = "select iit.item_name,ubit.total_price,ubit.total_count,ubit.pay from user_buy_item_transaction ubit left outer join item_info_transaction iit on ubit.item_transaction_id=iit.id where ubit.item_transaction_id=? and ubit.user_master_id=? order by ubit.insert_date desc";
                             //iitはitem_info_transactonの訳  ubitはuser_master_idの訳
		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, item_transaction_id);
			ps.setString(2, user_master_id);
			ResultSet rs =ps.executeQuery();

			if(rs.next()){
				myPageDTO.setItemName(rs.getString("item_name"));
				myPageDTO.setTotalPrice(rs.getString("total_price"));
				myPageDTO.setTotalCount(rs.getString("total_count"));
				myPageDTO.setPayment(rs.getString("pay"));
			}

		}catch ( Exception e){
			e.printStackTrace();
		}finally{
			try{
				con.close();
			}catch (Exception e){
				e.printStackTrace();
			}
		}
		return myPageDTO;
	}      //intは戻り値、publicには戻り値が絶対に必要。戻り値がない場合はvoid。
	       //戻り値を書かないのはコンストラクタ new などの時だけ。
	public int buyItemHistoryDelete(String item_transaction_id, String user_master_id){

		DBConnector db = new DBConnector();
		Connection con = db.getConnection();

	    String sql="delete from user_buy_item_transaction where item_transaction_id=? and user_master_id=?";
	    PreparedStatement ps;
	    int result = 0;


	    try{
	    	ps=con.prepareStatement(sql);
	    	ps.setString(1, item_transaction_id);
	    	ps.setString(2, user_master_id);
	    	result = ps.executeUpdate();
	    	//実行されると、resultに１が入る。executeUpdateの戻り値はint
	    	//resultはint型のメソッド
	    }catch (SQLException e){
	    	e.printStackTrace();
	    }finally{
	    	try{
	    		con.close();
	    	}catch (Exception e){
	    		e.printStackTrace();
	    	}
	    }
	    return result;

	}


}
