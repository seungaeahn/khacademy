package com.kh.practice3.func;

import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {
		/*
		 �Ʒ� ���ÿ� ���� �޴��� ����ϰ� �޴� ��ȣ�� ������ ��OO�޴��Դϴ١���,
		���� ��ȣ�� ������ �����α׷��� ����˴ϴ�.���� ����ϼ���.
		ex.
		1. �Է�
		2. ����
		3. ��ȸ
		4. ����
		7. ����
		�޴� ��ȣ�� �Է��ϼ��� : 3
		��ȸ �޴��Դϴ�. 
		 */
		Scanner scanner = new Scanner(System.in);
		
		int choice;
		
		
			System.out.println("1. �Է�");
			System.out.println("2. ����");
			System.out.println("3. ��ȸ");
			System.out.println("4. ����");
			System.out.println("7. ����");
			System.out.println("�޴� ��ȣ�� �Է��ϼ��� : ");
			
			choice = scanner.nextInt();
			
			/** 1. If�� **/
			
			if (choice == 1) {
				System.out.println("�Է�");
			} else if (choice == 2) {
				System.out.println("����");
			} else if (choice == 3) {
				System.out.println("��ȸ");
			} else if (choice == 4) {
				System.out.println("����");
			} else if (choice == 7) {
				System.out.println("���α׷��� ����˴ϴ�.");
			} //else�� �� ��� ������ ���� ���ϱ� ������ else if�� �����
			
			
			
			/** 2. Switch �� **/
			
			switch(choice) {
				case 1:
					System.out.println("�Է� �޴��Դϴ�.");
					break;
				case 2:
					System.out.println("���� �޴��Դϴ�.");
					break;
				case 3 :
					System.out.println("��ȸ �޴��Դϴ�.");
					break;
				case 4 :
					System.out.println("���� �޴��Դϴ�.");
					break;
				case 7 :
					System.out.println("���α׷��� ����˴ϴ�.");
					break;
				default:
					System.out.println("�ùٸ��� ���� ��ȣ�Դϴ�.");
				}

	}

}
