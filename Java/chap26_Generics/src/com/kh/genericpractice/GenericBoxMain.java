package com.kh.genericpractice;

import com.kh.genericsMain.Book;

public class GenericBoxMain {

	public static void main(String[] args) {
		//정수형 데이터를 저장하는 Box 인스턴스 생성
		Box<Integer> intBox = new Box<>();
		intBox.put(42);
		intBox.put(1);
		int intValue = intBox.get();
		
		System.out.println("intBox: " + intValue);
		//문자열 데이터를 저장하는 Book 인스턴스 생성
			Box<String> strBox = new Box<>();
				strBox.put("Hello");
				strBox.put("GoodeBye");
				strBox.put("GoodAfternoon");
				strBox.put("GoodNight");
				strBox.put("GoodMorning");
				String strValue = strBox.get();
				
			System.out.println("strBox: " + strValue);
				
		//향상된 for문 이용해서 값 모두 출력 
//			for(Integer Box1 : intValue) {
//				System.out.println(Box1);
//			}	
//			for(String Box2 : strValue) {
//				System.out.println(Box2);
//			}
	}

}
