package com.kh.practice;

import java.util.Scanner;

public class practice4 {

	public static void main(String[] args) {
		/*
		 ��, ����, ����, �ܿ� ������ switch������ �ٲ㼭 ����ϼ���.
		ex 1.
		1~12 ������ ���� �Է� : 8
		8���� �����Դϴ�.
		ex 2.
		1~12 ������ ���� �Է� : 99
		99���� �߸� �Էµ� ���Դϴ�.
		 */
		
		
		Scanner sc = new Scanner(System.in);
		int month;
		System.out.println("1~12 ������ ���� �Է� : ");
		month = sc.nextInt();
		switch (month) {
			case 1: 
				System.out.println("�ܿ�"); 
				break;
			case 2:
				System.out.println("�ܿ�"); 
				break; 
			case 3:
				System.out.println("��");
				break;
			case 4:
				System.out.println("��");
				break;
			case 5:
				System.out.println("��");
				break;
			case 6:
				System.out.println("����");
				break;
			case 7:
				System.out.println("����");
				break;
			case 8:
				System.out.println("����");
				break;
			case 9:
				System.out.println("����");
				break;
			case 10:
				System.out.println("����");
				break;
			case 11:
				System.out.println("�ܿ�");
				break;
			case 12:
				System.out.println("�ܿ�");
				break;
			default:
				System.out.println(month + "���� �߸� �Էµ� ���Դϴ�.");
		}		
		
		
	}

}
