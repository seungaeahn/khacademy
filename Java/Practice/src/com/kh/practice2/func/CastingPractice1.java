package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice1 {

	public static void main(String[] args) {
		// Ű����� ���� �ϳ��� �Է� �޾� �� ������ ���ڸ� ����ϼ���.
				Scanner sc = new Scanner(System.in);
				String word;
				System.out.println("����: ");
				word = sc.next();
				char word1 = word.charAt(0); //�Է¹��� ���� ��� 
				
				int int1 = (int) word1;
				System.out.println("�Է¹��� : " + word1 + " �����ڵ�: " + int1);

	}

}
