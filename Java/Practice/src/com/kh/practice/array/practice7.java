package com.kh.practice.array;

import java.util.Scanner;

public class practice7 {

	public static void main(String[] args) {
		/*
		 ����ڰ� �迭�� ���̸� ���� �Է��Ͽ� �� ����ŭ ������ �迭�� ���� �� �Ҵ��ϰ�
		�迭�� ũ�⸸ŭ ����ڰ� ���� ���� �Է��Ͽ� ������ �ε����� ���� �ʱ�ȭ �ϼ���.
		�׸��� �迭 ��ü ���� �����ϰ� �� �ε����� ����� ������ ���� ����ϼ���.
		ex.
		���� : 5
		�迭 0��° �ε����� ���� �� : 4
		�迭 1��° �ε����� ���� �� : -4
		�迭 2��° �ε����� ���� �� : 3
		�迭 3��° �ε����� ���� �� : -3
		�迭 4��° �ε����� ���� �� : 2
		4 -4 3 -3 2 
		�� �� : 2
		 */
		Scanner sc = new Scanner(System.in);

	    System.out.print("���� : ");
	    int num = sc.nextInt();

	    int[] arr = new int[num];

	    for(int i = 0; i < arr.length; i++) {
	        System.out.printf("�迭 %d��° �ε����� ���� �� : ",i);
	        arr[i] = sc.nextInt();
	    }
	    int sum = 0;
	    for(int i = 0; i < arr.length; i++) {
	        System.out.print(arr[i] + " ");
	        sum += arr[i];
	    }
	    System.out.println();
	    System.out.println("�� �� : " + sum);
	}

}
