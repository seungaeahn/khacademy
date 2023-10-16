package com.kh.pattern.mvc.controller;

import com.kh.pattern.mvc.model.UserModel;
import com.kh.pattern.mvc.view.UserView;
public class UserController {
	/*
	 * 모델과 뷰를 연결하는 곳
	 * 사용자 입력을 처리하는 곳 
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
