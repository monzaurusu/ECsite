package com.internousdev.ecsite.action;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.UserListDeleteCompleteDAO;
import com.internousdev.ecsite.dto.UserInfoDTO;
import com.opensymphony.xwork2.ActionSupport;


public class UserListDeleteCompleteAction extends ActionSupport implements SessionAware {

	private UserListDeleteCompleteDAO userListDeleteCompleteDAO = new UserListDeleteCompleteDAO();
	private ArrayList<UserInfoDTO> userInfoDTO = new ArrayList<UserInfoDTO>();
	private String message;
	private Map<String,Object> session;
	private String deleteFlg;

	public String execute(){
        String result = SUCCESS;
		if(deleteFlg.equals("1")){
			delete();

		}

		return result;
	}



	public void delete(){

		int res = userListDeleteCompleteDAO.userListHistoryDelete();

		if(res>0){
			userInfoDTO = null;
			setMessage("商品を正しく削除しました。");

		}else if(res == 0){
			setMessage("商品情報の削除に失敗しました。");
		}


	}

	public ArrayList<UserInfoDTO> getItemInfoDTO(){
		return this.userInfoDTO;
	}
	public String getMessage(){
		return this.message;
	}
	public void setMessage(String message){
		this.message = message;
	}


	public Map<String,Object> getSession(){
		return this.session;
	}
	public String getDeleteFlg(){
		return deleteFlg;
	}
	public void setDeleteFlg(String deleteFlg){
		this.deleteFlg = deleteFlg;
	}



	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;


	}

}
