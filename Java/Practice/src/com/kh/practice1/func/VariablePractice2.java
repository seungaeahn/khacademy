package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice2 {

	public static void main(String[] args) {
		// Ű����� ���� �� ���� �Է� �޾� �� ���� ��, ��, ��, �������� ���� ����ϼ���.
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
