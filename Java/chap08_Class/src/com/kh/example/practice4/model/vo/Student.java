package com.kh.example.practice4.model.vo;

public class Student {
	//1. ������� ���� 
	int grade;
	int classroom;
	String name;
	double height;
	char gender;
	
	//2. ������ this�� Ȱ��
	public Student() {
		this.grade = 1;
		this.classroom = 2;
		this.name = "�ڼ�ö";
		this.height = 180.5; 
		this.gender = '��';
	}
	//3. ������� �޼��� �����
	public void information() {
		System.out.println("�г�: " + grade);
		System.out.println("��: " + classroom);
		System.out.println("�̸�: " + name);
		System.out.println("Ű: " + height);
		System.out.println("����: " + gender);
	}
	
}
