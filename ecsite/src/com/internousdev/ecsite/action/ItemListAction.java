package com.internousdev.ecsite.action;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.ItemListDAO;
import com.internousdev.ecsite.dto.ItemInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class ItemListAction extends ActionSupport implements SessionAware {

	private Map<String, Object> session;
	ItemListDAO itemListDAO = new ItemListDAO();
	private ArrayList<ItemInfoDTO> itemInfoDTO = new ArrayList<ItemInfoDTO>();
	private String message;

	public String execute() {

		itemInfoDTO = itemListDAO.getItemListInfo();

		String result = SUCCESS;
		return result;
	}

	public ArrayList<ItemInfoDTO> getItemInfoDTO() {
		return this.itemInfoDTO;
	}

	public void setItemInfoDTO(ArrayList<ItemInfoDTO> itemInfoDTO) {
		this.itemInfoDTO = itemInfoDTO;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Map<String, Object> getSession() {
		return this.session;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
