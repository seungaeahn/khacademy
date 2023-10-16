package com.kh.genericsMain;

import java.util.ArrayList;

public class practiceMain {
	public static void main(String[] args) {
		practiceMain pm = new practiceMain();
		pm.practice1();
		
		// String Integer T 사용하여 출력 

	}
	
	public void practice1() {
		ArrayList<String> strList = new ArrayList<>();
		strList.add("Goodbye");
		strList.add("friday");
		
		printList(strList);
	}


	public static <T> void printList(ArrayList<T> strList) {
		for (T item : strList) {
			System.out.println(item);
		}
	}
	
	
	public void practice2() {
		//Box 객체를 com.kh.genericpractice; 밑에 생성
		//정수형 데이터를 저장하는 Box 인스턴스 생성
		//문자열 데이터를 저장하는 Box 인스턴스 생성
		// 각각 출력
		//향상된 for문 이용해서 값 모두 출력 
		
	}
	
}