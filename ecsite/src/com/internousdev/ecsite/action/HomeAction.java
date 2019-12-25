package com.internousdev.ecsite.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.BuyItemDAO;
import com.internousdev.ecsite.dto.BuyItemDTO;
import com.opensymphony.xwork2.ActionSupport;


public class HomeAction extends ActionSupport implements SessionAware {
	private Map<String,Object> session;

	public String execute(){

		BuyItemDAO buyItemDAO = new BuyItemDAO();

		String result = "login";
		/**
		 * sessionにlogin_user_idが入っているかどうかの確認
		 * login画面へ行くか、商品購入画面のどちらに行くかが決まる
		  */
		if(session.containsKey("login_user_id")){

			BuyItemDTO buyItemDTO = buyItemDAO.getBuyItemInfo();
			session.put("id", buyItemDTO.getId());
			session.put("buyItem_name", buyItemDTO.getItemName());
			session.put("buyItem_price",buyItemDTO.getItemPrice());


			result = SUCCESS;
		}
		return result;
	}

	public Map<String,Object> getSession(){
		return this.session;
	}
	@Override
	public void setSession(Map<String,Object> session){
		this.session = session;
	}
}
