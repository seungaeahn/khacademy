package com.kh.practice.exam;

import java.util.Scanner;

public class Practice6 {

	public static void main(String[] args) {
		/*
		 1�� ���� 
		 1 �̻��� ���ڸ� �Է��ϼ���.
		 
		 ����ڷκ��� �� ���� ���� �Է¹޾� 1���� �� ���ڱ����� ���ڵ��� ��� ����ϼ���.
		 	��, �Է��� ���� 1���� ũ�ų� ���ƾ� �Ѵ�.
		 	���� 1�̸��� ���ڰ� �ԷµǾ��ٸ� "1�̻��� ���ڸ� �Է����ּ���."�� ����ϼ���.
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ڸ� �Է��ϼ���: ");
		int num = sc.nextInt();
		
		if(num < 1) {
			System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
		} else {
			for (int i = 1; i <= num; i++) {
				System.out.println(i);
			}
		} 
		
	}

}
