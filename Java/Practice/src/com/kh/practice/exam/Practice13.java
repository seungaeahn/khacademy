package com.kh.practice.exam;

import java.util.Scanner;

public class Practice13 {

	public static void main(String[] args) {
		/*
		 8�� ����
		 ����ڷκ��� �Է� ���� ������ �ܺ��� 9�ܱ��� ����ϼ���.
		��, 9�� �ʰ��ϴ� ���ڰ� ������ ��9 ������ ���ڸ� �Է����ּ��䡱�� ����ϼ���.
		 */
		 Scanner sc = new Scanner(System.in);

		 System.out.print("���� : ");
			int dan = sc.nextInt(); // ������ �Է¹޴� �޼ҵ�

			if (dan <= 9) {
				for (dan = dan; dan < 10; dan++) { // �Է¹��� ���ں��� 9����
					System.out.println("===== " + dan + "�� =====");

					for (int i = 1; i < 10; i++) {
						System.out.printf("%d * %d = %d\n", dan, i, dan * i);
					}
				}
			} else { // 9�� �ʰ��ϴ� ���ڸ� �Է����� ���
				System.out.println("9������ ���ڸ� �Է����ּ���.");
			}
	}
}
