package com.kh.practice;

import java.util.HashMap;
import java.util.Map;

public class UserExam {

	public static void main(String[] args) {
//		Map <String, Integer>
//		      �̸�     ����
//		contains
		
		Map<String, Integer> studentAge = new HashMap<>();
		studentAge.put("Alice", 16);
		studentAge.put("Daniel", 17);
		studentAge.put("Rachel", 20);
		studentAge.put("Tim", 19);
		
		String studentName = "Rachel";
		
		if(studentAge.containsKey(studentName)) {
			int age = studentAge.get(studentName);
			System.out.println(studentName + " �� ���� : " + age);
		} else {
			System.out.println(studentName + " �� ���̸� ã�� �� �����ϴ�.");
		}
	}

}
