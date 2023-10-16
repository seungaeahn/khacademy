package com.kh.student;

import java.util.HashMap;
import java.util.Map;

public class HashMapExam {

	public static void main(String[] args) {
		// HashMap ���� 
		Map<String, Integer> studentGrades = new HashMap<>();
		
		//�л��� ������ �߰��ϰڽ��ϴ�
		studentGrades.put("KH", 95);
		studentGrades.put("Park", 80);
		studentGrades.put("David", 77);
		studentGrades.put("Bob", 92);
		
		//Ư�� �л��� ���� �˻�
		//containKey : �ʿ��� Key(Ű), value(��)�� �ִ��� Ȯ�� 
		String studentName = "Bob";
		//���࿡ �л��� �߿��� Bob�� �ִٸ� ������ ������
		if(studentGrades.containsKey(studentName)) {
			int grade = studentGrades.get(studentName);
			System.out.println(studentName + " �� ���� : " + grade);
		} else {
			System.out.println(studentName + " �� ������ ã�� �� �����ϴ�.");
		}
		/*
		 Map.Entry �������̽��� �Բ� ���Ǵ� �������̽�
		 getKey() : ��ü�� Ű�� ��ȣ
		 getValue() : ��ü�� ���� ��ȯ 
		 */
		//��� �л��� ������ ��� 
		for (Map.Entry<String, Integer> entry : studentGrades.entrySet()) {
			String name = entry.getKey();
			int grade = entry.getValue();
			System.out.println(name + " : " + grade);
		}
		//�л� ���� ����
				String StudentUpdate = "Bob";
				int newGrade = 98;
				studentGrades.put(StudentUpdate, newGrade);
				System.out.println(studentGrades + "�� ������ " + newGrade + "�� �����߽��ϴ�.");
		
		//�л� ����
			String removeStudent = "David";
			studentGrades.remove(removeStudent);
			
			System.out.println(removeStudent + " �� ������ �����߽��ϴ�");
		//���� �л� ���� ���
		System.out.println("���� �л� ���� :");
		for(Map.Entry<String, Integer> entry : studentGrades.entrySet()) {
			String name = entry.getKey();
			int grade = entry.getValue();
			System.out.println(name + " : " + grade);
		}
	}
	
		
		
	
		
		//��� �л��� ���� ���
//		System.out.println("��ü �л� ����: ");
//		for(Map.entry<String, Integer> entry : studentGrades.entrySet());
//			String name = entry.getKey();
//			int grade = entry.getValue();
//			System.out.println(name + " : " + grade);
		
		
	

}
