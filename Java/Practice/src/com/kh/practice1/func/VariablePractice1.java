package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice1 {

	public static void main(String[] args) {
		// �̸�, ����, ����, Ű�� ����ڿ��� �Է� �޾� ������ ���� ������ ��� ����ϼ���.
				Scanner sc = new Scanner(System.in);
				String name, gender;
				int age;
				double height;
				System.out.println("�̸��� �Է��ϼ���: ");
				name = sc.next();
				System.out.println("������ �Է��ϼ���(��/��): ");
				gender = sc.next();
				System.out.println("���̸� �Է��ϼ���: ");
				age = sc.nextInt();
				System.out.println("Ű�� �Է��ϼ���(cm): ");
				height = sc.nextDouble();
				
				System.out.println("Ű " + height + "�� "+ age + "�� " + gender + "�� " + name + "�� �ݰ����ϴ�.");
				

	}

}
