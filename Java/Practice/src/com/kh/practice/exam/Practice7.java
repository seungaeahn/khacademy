package com.kh.practice.exam;

import java.util.Scanner;

public class Practice7 {
    public static void main(String[] args) {
    	/*
		 2�� ���� 
		 �� ������ �����ϳ�, 1�̸��� ���ڰ� �ԷµǾ��ٸ�
		 "1 �̻��� ���ڸ� �Է����ּ���"�� ��µǸ鼭 �ٽ� ����� ���� �Է��ϵ��� �ϼ���.
		 */
        Scanner sc = new Scanner(System.in);

        System.out.println("���ڸ� �Է��ϼ���: ");
        int num = sc.nextInt();

        // 1. ���� �� ����� boolean ���� = true or false;
        boolean isTrue = false;
        while (!isTrue) { 
            if (num < 1) { // 2. ���� �߰��ϱ�
                System.out.println("1 �̻��� ���ڸ� �Է����ּ���.: ");
                num = sc.nextInt();
            } else {
                for (int i = 1; i <= num; i++) {
                    System.out.println(i);
                    
                }
                isTrue = true; // �ùٸ� �Է��� ��쿡�� isTrue�� true�� �����Ͽ� ���� ����\
                break;  // if�� switch���� ����� �� �ִ�.
            }
        }
    }
}