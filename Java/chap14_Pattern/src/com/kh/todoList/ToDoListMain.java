package com.kh.todoList;

public class ToDoListMain {

	public static void main(String[] args) {
		ToDoListModel tdmodel = new ToDoListModel("��ħ�Ա�!");
		ToDoListView tdview = new ToDoListView();
		
		System.out.println(tdmodel);
		String item = tdmodel.getItem();
		tdview.displayToDoList(item);
	}

}
