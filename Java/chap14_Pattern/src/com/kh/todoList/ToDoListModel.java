package com.kh.todoList;

public class ToDoListModel {
	//�� �� ���
	private String items;
	//����� ������
	private String item;
	//������ ���ϰ� ����
	
	public ToDoListModel(String text) {
		this.item = text;
	}
	
	public String getItem() {
		return item;
	}
}