package com.kh.arrayListPractice;

import java.util.Scanner;

public class UserScannerMain {

	public static void main(String[] args) {
		/*
		 3-3) ����ڷκ��� 5���� ������ �Է¹޾Ƽ� �迭�� ������ ����, 
		 ���� for ���� ����ؼ� �迭�� ��� ��Ҹ� ���� ��� ���
		 */
		// Scanner�� ����Ͽ� ����ڷκ��� �Է� ����
        Scanner scanner = new Scanner(System.in);
        
        // 5���� ������ ������ �迭 ���� 
        int[] numbers = new int[5];
        
        // ����ڷκ��� ������ �Է¹޾� �迭�� ����
        for (int i = 0; i < 5; i++) {
            System.out.print("5���� ������ �Է��ϼ���: ");
            numbers[i] = scanner.nextInt();
        }
        
        // �迭�� ��� ��Ҹ� ����
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
       
        
        // ��� ���
        System.out.println("�迭�� ��� ����� ��: " + sum);

	}

}