package com.kh.genericpractice;

import com.kh.genericsMain.Book;

public class GenericBoxMain {

	public static void main(String[] args) {
		//������ �����͸� �����ϴ� Box �ν��Ͻ� ����
		Box<Integer> intBox = new Box<>();
		intBox.put(42);
		intBox.put(1);
		int intValue = intBox.get();
		
		System.out.println("intBox: " + intValue);
		//���ڿ� �����͸� �����ϴ� Book �ν��Ͻ� ����
			Box<String> strBox = new Box<>();
				strBox.put("Hello");
				strBox.put("GoodeBye");
				strBox.put("GoodAfternoon");
				strBox.put("GoodNight");
				strBox.put("GoodMorning");
				String strValue = strBox.get();
				
			System.out.println("strBox: " + strValue);
				
		//���� for�� �̿��ؼ� �� ��� ��� 
//			for(Integer Box1 : intValue) {
//				System.out.println(Box1);
//			}	
//			for(String Box2 : strValue) {
//				System.out.println(Box2);
//			}
	}

}
