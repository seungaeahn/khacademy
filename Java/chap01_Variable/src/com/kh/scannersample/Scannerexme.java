package com.kh.scannersample;

import java.util.Scanner;

public class Scannerexme {
	//���� �� ���� �Է¹޾�, �� ���� ��, ��, ��, ������ �� ��� �������� ����ϱ�
	public static void main(String[] args) {
		//int inum1 = 30;
		//int inum2 = 3;
		
		Scanner sc = new Scanner(System.in);
		
		int inum4, inum5;
		System.out.println("������ �Է��ϼ���.: ");
		inum4 = sc.nextInt();
		System.out.println("�� �ٸ� ������ �Է��ϼ���.: ");
		inum5 = sc.nextInt();
		
		System.out.println(inum4 + inum5);
		System.out.println(inum4 - inum5);
		System.out.println(inum4 * inum5);
		System.out.println(inum4 / inum5);
		System.out.println(inum4 % inum5);
		
		
	}

}
