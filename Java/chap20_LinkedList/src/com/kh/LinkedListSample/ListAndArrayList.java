package com.kh.LinkedListSample;

import java.util.List;
import java.util.LinkedList;

public class ListAndArrayList {

	public static void main(String[] args) {
		// ����
		List<String> linkedList = new LinkedList<>();
		
		//����߰�
		linkedList.add("ù ��°");
		linkedList.add("�� ��°");
		linkedList.add("�� ��°");
		
		System.out.println("linkedList : " + linkedList);
		
		linkedList.remove(2);
		System.out.println("���� ��: " + linkedList);
		
		//��� �˻� 
		boolean isTrue = linkedList.contains("�� ��°");
		System.out.println("�� ��° ��� ���� ���� : " + isTrue);
		
		//��� ����
		int size = linkedList.size();
		System.out.println("ũ��: "+ size);
		
	
		
		

	}

}
