package com.kh.todoList;

public class ToDoListMain {

	public static void main(String[] args) {
		ToDoListModel tdmodel = new ToDoListModel("¾ÆÄ§¸Ô±â!");
		ToDoListView tdview = new ToDoListView();
		
		System.out.println(tdmodel);
		String item = tdmodel.getItem();
		tdview.displayToDoList(item);
	}

}
