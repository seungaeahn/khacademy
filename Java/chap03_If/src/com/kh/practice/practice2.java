package com.kh.practice;

import java.util.Scanner;

public class practice2 {

	public static void main(String[] args) {
		/*
		 Ű����� ������ �Է� ���� ������ ����̸鼭 ¦���� ���� ��¦���١��� ����ϰ�
¦���� �ƴϸ� ��Ȧ���١��� ����ϼ���.
����� �ƴϸ� ������� �Է����ּ���.���� ����ϼ���.
ex.
���ڸ� �� �� �Է��ϼ��� : -8
����� �Է����ּ���.
		 */
		Scanner scanner = new Scanner(System.in);
		
		int num;
		System.out.println("���ڸ� �� �� �Է��ϼ��� : ");
		num = scanner.nextInt();
		if (num > 0 && num % 2 == 0) {
			System.out.println("¦����");
		} else if (num % 2 == 1) {
			System.out.println("Ȧ����");
		} else { 
			System.out.println("����� �Է����ּ���.");
		}

		}
	}

