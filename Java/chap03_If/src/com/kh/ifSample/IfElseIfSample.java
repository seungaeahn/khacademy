package com.kh.ifSample;

public class IfElseIfSample {
	public static void main(String[] args) {
		//if-else if-else
		/*
		 ���� ���� ������ ���������� ��
		 �� �� ù ��° ���� ���ǿ� �ش��ϴ� �ڵ� Ŭ���� �����ϴ� ����
		 ���� if�� else if�� ������ ���� �ƴ϶�� ������ else ��� ����.
		 
		 if(����1) {
		 	//����1�� ���� �� ����Ǵ� �ڵ�
		 } else if (����2) {
		 	//����2�� ���� �� ����Ǵ� �ڵ�
		 } else {
		 	//���� ��� ������ ������ �� ����Ǵ� �ڵ�
		 */
		int age = 20; //20��
		if (age == 20) {
			System.out.println("�ؿܿ����� ������!");
		} else if (age>= 20) { 
			System.out.println("���迩�� ������!");
		} else {
			System.out.println("���� ��������!");
		}
		
		int score = 85;
		if (score == 90) {
			System.out.println("B+");
		} else if (score > 90) { 
			System.out.println("A");
		} else {
			System.out.println("B");
		}
		int hour = 15;
		if (hour < 12) {
			System.out.println("���� ��ħ�Դϴ�!");
		} else if (hour <18) {
			System.out.println("������ �ڵ��սô�!");
		} else { //18�� ����
			System.out.println("�����ϼ̽��ϴ�.");
		}
		
		//����üũ
		int temp = 28;
		if (temp > 30) {
			System.out.println("���� �����Դϴ�.");
		} else if (temp >20) { //21~30���̰� ��
			System.out.println("������ �����Դϴ�.");
		} else { //20�� ����
			System.out.println("�ҽ��� �����Դϴ�.");
		}
		int number = -5;
		if (number > 0) { //0���� Ŭ �� �� (true)
			System.out.println("����Դϴ�.");
		} else if (number < 0) { //0���� ���� �� �� (true)
			System.out.println("�����Դϴ�.");
		} else { //0�� �� �� (true)
			System.out.println("0 �Դϴ�.");
		}
		
		/*
		 int myAge = 15; ���� ���̰� 15���϶�, û�ҳ����� ������� �������� ����ϱ�
		 */
		int myAge =15;
		if (myAge <= 14) {
			System.out.println("����Դϴ�.");
		} else if (myAge > 20) {
			System.out.println("�����Դϴ�.");
		} else {
			System.out.println("û�ҳ��Դϴ�.");
		}
		//���� ����ϱ�
		int month = 8;
		if (month == 1 || month == 2 || month == 12) {
			System.out.println("�ܿ�");
		} else if (month >= 3 && month <= 5) {
			System.out.println("��");
		} else if (month >= 6 && month <= 8) {
			System.out.println("����");
		} else {
			System.out.println("����");
		}
		
	}
}









