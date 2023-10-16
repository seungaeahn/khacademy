package com.kh.arrayListSample;

import java.util.ArrayList;

/*
 * ArrayList이용해서
 * 할일 만들고 (3개)
 * 수정하고 (2개)
 * 지우고 (1)
 * 전부다 삭제
 */
public class toDoSample {

	public static void main(String[] args) {
		ArrayList<String> toDoList = new ArrayList<>();
		toDoList.add("영화 보기");
		toDoList.add("저녁 먹기");
		toDoList.add("샤워 하기");
		System.out.println("toDoList : " + toDoList);
		
		toDoList.set(1, "점심 먹기");
		toDoList.set(2, "목욕 하기");
		System.out.println("수정된 toDoList : " + toDoList);
		
		//ArrayList 순회해서 요소 출력 
		System.out.println("모든 할일 목록 : ");
		for (String toDoLists : toDoList) {
			System.out.println(toDoLists);
		}
		
		
		
		toDoList.clear();
		System.out.println("모든 toDoList를 제거: " + toDoList);
		
	}

}
