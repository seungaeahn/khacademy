package com.kh.practice.exam;

import java.util.Scanner;

public class Practice9 {

	public static void main(String[] args) {
		/*
		 4�� ���� 
		 �� ������ ��� ���� �����ϳ�, 1 �̸��� ���ڰ� �Էµƴٸ�
		��1 �̻��� ���ڸ� �Է����ּ��䡱�� ��µǸ鼭 �ٽ� ����ڰ� ���� �Է��ϵ��� �ϼ���.
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ڸ� �Է��ϼ���: ");
		int num = sc.nextInt();
		
        boolean isTrue = false;
        while (!isTrue) { 
            if (num < 1) {
                System.out.println("1 �̻��� ���ڸ� �Է����ּ���.: ");
                num = sc.nextInt();
            } else {
                for (int i = num; i >= 1; i--) {
                    System.out.println(i);
                }
                isTrue = true; 
            }
        }
	}
}