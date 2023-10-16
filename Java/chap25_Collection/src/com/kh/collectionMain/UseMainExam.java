package com.kh.collectionMain;

import java.util.HashMap;
import java.util.Map;

public class UseMainExam {

	public static void main(String[] args) {
		// HashMap ���� UserAge
		Map<String, Integer> UserAge = new HashMap<>();
		
		//������ �̸��� ����
		UserAge.put("Alice", 16);
		UserAge.put("Daniel", 17);
		UserAge.put("Rachel", 20);
		UserAge.put("Tim", 19);
		
		//Ư�� ���� �˻�
		String userName = "Rachel";
		
		if(UserAge.containsKey(userName)) {
			int age = UserAge.get(userName);
			System.out.println(userName + " �� ���� : " + age);
		} else {
			System.out.println(userName + " �� ���̸� ã�� �� �����ϴ�.");
		}
		
		//��� �л��� ���� ��� 
		for (Map.Entry<String, Integer> entry : UserAge.entrySet()) {
			String name = entry.getKey();
			int age = entry.getValue();
			System.out.println(name + " : " + age);
		}
		//���� ���� ���� 
		String UserUpdate = "Daniel";
		int newAge = 19;
		UserAge.put(UserUpdate, newAge);
		System.out.println(UserUpdate + "�� ���̸� " + newAge + "�� �����߽��ϴ�.");

		//���� Ż��
		String removeUser = "Alice";
		UserAge.remove(removeUser);
		
		System.out.println(removeUser + "�� �����߽��ϴ�");
		//���� ���� �̸� ���� ��� 
		System.out.println("���� ���� �̸� ���� :");
		for(Map.Entry<String, Integer> entry : UserAge.entrySet()) {
			String name = entry.getKey();
			int age = entry.getValue();
			System.out.println(name + " : " + age);
		}	
	}

}
