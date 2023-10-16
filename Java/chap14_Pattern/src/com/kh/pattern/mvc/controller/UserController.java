package com.kh.pattern.mvc.controller;

import com.kh.pattern.mvc.model.UserModel;
import com.kh.pattern.mvc.view.UserView;
public class UserController {
	/*
	 * �𵨰� �並 �����ϴ� ��
	 * ����� �Է��� ó���ϴ� �� 
	 */
	private UserModel usermodel;
	private UserView userview;
	

	public void setModel(UserModel model) {
		this.usermodel = usermodel;
	}
	public void setView(UserView view) {
		this.userview = userview;
	}

	public UserView getView() {
		return userview;
	}

	public UserModel getModel() {
		return usermodel;
	}
	

	
	public UserController(UserModel usermodel, UserView userview) {
		this.usermodel = usermodel;
		this.userview = userview;
	}
	
	
	public static void main(String[] args) {
		

	}

}
