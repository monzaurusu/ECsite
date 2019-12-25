package com.internousdev.ecsite.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.BuyItemDAO;
import com.internousdev.ecsite.dao.LoginDAO;
import com.internousdev.ecsite.dto.BuyItemDTO;
import com.internousdev.ecsite.dto.LoginDTO;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport implements SessionAware{

		private String loginUserId;
		private String loginPassword;
		private Map<String,Object> session;
		private LoginDAO loginDAO = new LoginDAO();
		private LoginDTO loginDTO = new LoginDTO();


	public String execute(){
		String result = ERROR;

		BuyItemDAO buyItemDAO = new BuyItemDAO();
		BuyItemDTO buyItemDTO = buyItemDAO.getBuyItemInfo();

		loginDTO = loginDAO.getLoginUserInfo(loginUserId,loginPassword);
		session.put("loginUser",loginDTO);

         //nullと""の違いをきちんと判別すべし！！nullはインスタンスできないが、""はインスタンス化される
		//adminFlgに何も入っていない時、nullである。空でないだけでは解決できない！！！難しい！！！
		if(loginDTO.getAdminFlg() != null && !(loginDTO.getAdminFlg().equals(""))&&
				((LoginDTO)session.get("loginUser")).getLoginFlg()){
			session.put("adminFlg",loginDTO.getAdminFlg());
			session.put("login_user_id", loginDTO.getLoginId());

				result = "admin";
		}

		else if(((LoginDTO)session.get("loginUser")).getLoginFlg()){
			         result = SUCCESS;
				session.put("login_user_id", loginDTO.getLoginId());

				session.put("id", buyItemDTO.getId());
				session.put("buyItem_name",buyItemDTO.getItemName());
				session.put("buyItem_price", buyItemDTO.getItemPrice());



	      }




		return result;
    }

	public String getLoginUserId(){
		return loginUserId;
	}
	public void setLoginUserId(String loginUserId){
		this.loginUserId = loginUserId;
    }
	public String getLoginPassword(){
		return loginPassword;
	}
	public void setLoginPassword(String loginPassword){
		this.loginPassword = loginPassword;
	}
	public Map<String,Object> getSession(){
		return this.session;
	}
	@Override
	public void setSession(Map<String,Object> session){
		this.session = session;
	}



}
