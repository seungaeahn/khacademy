package com.kh.switchsample;

import java.util.Scanner;

public class SwitchScanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �������ּ���.");
		//int fruit = 3;
		int fruit = sc.nextInt();
		
		switch (fruit) {
		case 1:
			System.out.println("���");
			break;
		case 2:
			System.out.println("����");
			break;
		default:
			System.out.println("�߸��� �����Դϴ�.");
		}
		
		//scanner�� �̿��ؼ� ���ڸ� �����ϴ� switch�� �ϳ� ������ּ���.
		System.out.println("���ڸ� �������ּ���.");
		int snack = sc.nextInt();
		
		switch (snack) {
		case 1:
			System.out.println("�����");
			break;
		case 2:
			System.out.println("���ĸ�");
			break;
		case 3:
			System.out.println("������");
			break;
		default:
			System.out.println("�߸��� �����Դϴ�.");
			
		}
		
		
		System.out.println("�ֹ��Ͻ� ��ȣ�� �������ּ���.");
		System.out.println("1. �Ƹ޸�ī��");
		System.out.println("2. ��� ����Ƽ");
		System.out.println("3. ���ν����");
		

		int choice = sc.nextInt();
		
		switch (choice) {
			case 1:
				System.out.println("�Ƹ޸�ī�� �ֹ��ϼ̽��ϴ�.");
				break;
			case 2:
				System.out.println("��� ����Ƽ �ֹ��ϼ̽��ϴ�,");
				break;
			case 3:
				System.out.println("���ν���ʸ� �ֹ��ϼ̽��ϴ�.");
				break;
			default:
				System.out.println("�߸��� �����Դϴ�. �ٽ� �ֹ����ּ���.");
		}
		
		

	}

}
