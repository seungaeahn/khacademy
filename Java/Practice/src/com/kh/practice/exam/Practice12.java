package com.kh.practice.exam;

import java.util.Scanner;

public class Practice12 {

	public static void main(String[] args) {
		/*
		 7�� ���� 
		 ����ڷκ��� �Է� ���� ������ ���� ����ϼ���.
		 */
		 Scanner sc = new Scanner(System.in);

		 System.out.print("����: ");
		 int num = sc.nextInt();
	
		 System.out.println("====  " + num + "��" + "  ====");
		 
		 for (int i = 1; i <= 9; i++) {
		 System.out.println(num + " * " + i + " = " + (num * i));
		 }
	}

}

