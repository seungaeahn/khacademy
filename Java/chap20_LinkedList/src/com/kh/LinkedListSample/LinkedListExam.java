package com.kh.LinkedListSample;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExam {

	public static void main(String[] args) {
		List<String> linkedList = new LinkedList<>();
		 // �� �߰�
        linkedList.add("ù ��° ��");
        linkedList.add("�� ��° ��");
        linkedList.add("�� ��° ��");
        System.out.println("LinkedList�� ����� ��:");
        for (String value : linkedList) {
            System.out.println(value);
        }
        linkedList.remove(2);
		System.out.println("���� ��: " + linkedList);
		
		//��� �˻� 
		boolean isTrue = linkedList.contains("�� ��°");
		System.out.println("�� ��° ��� ���� ���� : " + isTrue);
		
		//��� ����
		int size = linkedList.size();
		System.out.println("ũ��: "+ size);
		// List �������̽��� LinkedList ��ü Ȱ���ؼ� ���ְ� ��� 
		
		// String
		
		// LinkedList ��ü new LinkedList ��ü
		// int �� �ְ� ���� ���� ��� 

	}

}
