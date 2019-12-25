package com.internousdev.ecsite.dto;

public class LoginDTO {

	private String loginId;
	private String loginPassword;
	private String userName;
	private String adminFlg;
	private int loginId2;
	private boolean loginFlg = false;

	public String getLoginId(){
		return loginId;
	}
	public void setLoginId(String loginId){
		this.loginId = loginId;
	}
	public String getLoginPassword(){
		return loginPassword;
	}
	public void setLoginPassword(String loginPassword){
		this.loginPassword = loginPassword;
	}
	public String getUserName(){
		return userName;
	}
	public void setUserName(String userName){
		this.userName = userName;
	}
	public String getAdminFlg(){
		return adminFlg;
	}
	public void setAdminFlg(String adminFlg){
		this.adminFlg = adminFlg;
	}
	public int getLoginId2(){
		return loginId2;
	}
	public void setLoginId2(int loginId2){
		this.loginId2 = loginId2;
	}

	public boolean getLoginFlg(){
		return loginFlg;
	}
	public void setLoginFlg(boolean loginFlg){
		this.loginFlg = loginFlg;
	}


}
