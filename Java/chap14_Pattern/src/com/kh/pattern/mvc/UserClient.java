package com.kh.pattern.mvc;

import com.kh.pattern.mvc.controller.UserController;
import com.kh.pattern.mvc.model.UserModel;
import com.kh.pattern.mvc.view.UserView;

public class UserClient {

	public static void main(String[] args) {
		/* 
		 * MVC ������ ����ؼ� �л������� �ٷ�� ��
		 */
		//�� ��ü ����
		UserModel user = new UserModel("ȫ�浿", 20);
		
		//�� ��ü ����
		UserView view = new UserView();
		
		//��Ʈ�ѷ� ��ü ���� �� �� �� ����
		UserController controller = new UserController(user, view);
	}

}
