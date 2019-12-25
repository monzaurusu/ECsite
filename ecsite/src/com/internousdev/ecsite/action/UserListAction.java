package com.internousdev.ecsite.action;

import java.util.ArrayList;

import com.internousdev.ecsite.dao.UserListDAO;
import com.internousdev.ecsite.dto.UserInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class UserListAction extends ActionSupport {


	UserListDAO userListDAO = new UserListDAO();
	private ArrayList<UserInfoDTO> userInfoDTO = new ArrayList<UserInfoDTO>();
	private String message;

	public String execute(){

		userInfoDTO = userListDAO.getUserListInfo();

		String result = SUCCESS;
		return result;
	}

	public ArrayList<UserInfoDTO> getUserInfoDTO(){
		return this.userInfoDTO;
	}
	public void setItemInfoDTO(ArrayList<UserInfoDTO> userInfoDTO){
		this.userInfoDTO = userInfoDTO;
	}
	public String getMessage(){
		return this.message;
	}
	public void setMessage(String message){
		this.message = message;
	}


}