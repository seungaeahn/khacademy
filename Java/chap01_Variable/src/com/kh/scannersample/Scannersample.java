package com.kh.scannersample;

import java.util.Scanner;

public class Scannersample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("���̸� �Է����ּ���.");
		int age = sc.nextInt(); //������ �޴� next
		System.out.println("�� ���̴� " + age + "�Դϴ�.");
		
		String name;
		int phoneNumber;
		
		System.out.print("����� �̸��� �Է��ϼ���.: ");
		name = sc.next();
		System.out.print("����� ��ȭ��ȣ�� �Է��ϼ���.: ");
		phoneNumber = sc.nextInt(); //-���� �ʱ�
		
		System.out.println("����� �̸��� " + name + "�Դϴ�.");
		System.out.println("����� ��ȭ��ȣ�� " + phoneNumber + "�Դϴ�.");
		
		//�� ��̿� ���� �����ϴ� ���İ� �� �ּ� ����ϱ�
		String hobby, food, address;
		System.out.println("��̸� �Է����ּ���.: ");
		hobby = sc.next();
		System.out.println("�����ϴ� ������ �Է����ּ���.: ");
		food = sc.next();
		System.out.println("�ּҸ� �Է����ּ���.: ");
		address = sc.next();
		
		System.out.println("���� ��̴� " + hobby + "�Դϴ�.");
		System.out.println("���� �����ϴ� ������ " + food + "�Դϴ�.");
		System.out.println("���� �ּ� " + address + "�Դϴ�.");
		
		String name1, name2;
		name1 = sc.next(); //next�� ������ ���� �ʴ´�
		
		
	}
}







