package com.kh.genericsMain;

import java.util.ArrayList;

public class practiceMain {
	public static void main(String[] args) {
		practiceMain pm = new practiceMain();
		pm.practice1();
		
		// String Integer T ����Ͽ� ��� 

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
		//Box ��ü�� com.kh.genericpractice; �ؿ� ����
		//������ �����͸� �����ϴ� Box �ν��Ͻ� ����
		//���ڿ� �����͸� �����ϴ� Box �ν��Ͻ� ����
		// ���� ���
		//���� for�� �̿��ؼ� �� ��� ��� 
		
	}
	
}