package com.kh.practice.exam;

import java.util.Scanner;

public class Practice11 {

	public static void main(String[] args) {
		/*
		 6�� ����
		 ����ڷκ��� �� ���� ���� �Է� �޾� �� ������ ���ڸ� ��� ����ϼ���.
		 */
		Scanner sc = new Scanner(System.in);

        System.out.print("ù ��° ����: ");
        int num1 = sc.nextInt();

        System.out.print("�� ��° ����: ");
        int num2 = sc.nextInt();

        int start, end;
        if (num1 < num2) {
            start = num1;
            end = num2;
        } else {
            start = num2;
            end = num1;
        }

        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");
        }
        
     // Math �ٹٿ� ���� Ŭ����
     // min (���� ���� ��) �־��� �� ���� ���� �߿��� �� ���� ���� ��ȯ 
     // max (���� ū ��) �־��� �� ���� ���� �߿��� �� ū ���� ��ȯ 
     int a = 5;
     int b = 8;
     int minValue = Math.min(a, b);
     System.out.print(minValue);
     int maxValue = Math.max(a, b);
     System.out.print(maxValue);
        
        
	}

}












