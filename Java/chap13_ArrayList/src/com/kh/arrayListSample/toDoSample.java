package com.kh.arrayListSample;

import java.util.ArrayList;

/*
 * ArrayList�̿��ؼ�
 * ���� ����� (3��)
 * �����ϰ� (2��)
 * ����� (1)
 * ���δ� ����
 */
public class toDoSample {

	public static void main(String[] args) {
		ArrayList<String> toDoList = new ArrayList<>();
		toDoList.add("��ȭ ����");
		toDoList.add("���� �Ա�");
		toDoList.add("���� �ϱ�");
		System.out.println("toDoList : " + toDoList);
		
		toDoList.set(1, "���� �Ա�");
		toDoList.set(2, "��� �ϱ�");
		System.out.println("������ toDoList : " + toDoList);
		
		//ArrayList ��ȸ�ؼ� ��� ��� 
		System.out.println("��� ���� ��� : ");
		for (String toDoLists : toDoList) {
			System.out.println(toDoLists);
		}
		
		
		
		toDoList.clear();
		System.out.println("��� toDoList�� ����: " + toDoList);
		
	}

}
