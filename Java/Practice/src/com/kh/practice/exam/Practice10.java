package com.kh.practice.exam;

import java.util.Scanner;

public class Practice10 {

	public static void main(String[] args) {
		/*
		 5�� ���� 
		 1���� ����ڿ��� �Է� ���� �������� �������� ���� ����ϼ���.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �ϳ� �Է��ϼ���: ");
        int num = sc.nextInt();

        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        System.out.println(sum);
	}

}
