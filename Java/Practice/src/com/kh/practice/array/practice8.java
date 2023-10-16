package com.kh.practice.array;

import java.util.Scanner;

public class practice8 {

	public static void main(String[] args) {
		/*
		 3�̻��� Ȧ�� �ڿ����� �Է� �޾� �迭�� �߰������� 1���� 1�� �����Ͽ� ������������ ���� �ְ�,
		�߰� ���ĺ��� �������� 1�� �����Ͽ� ������������ ���� �־� ����ϼ���.
		��, �Է��� ������ Ȧ���� �ƴϰų� 3 �̸��� ��� ���ٽ� �Է��ϼ��䡱�� ����ϰ�
		�ٽ� ������ �޵��� �ϼ���.
		ex.
		���� : 4
		�ٽ� �Է��ϼ���.
		���� : -6
		�ٽ� �Է��ϼ���.
		���� : 5
		1, 2, 3, 2, 1
		 */
		Scanner sc = new Scanner(System.in);

	    // ���� ���������� �ݺ� => while
	    while(true) {
	        // ���� �Է�
	        System.out.print("���� : ");
	        int num = sc.nextInt();

	        if(num >= 3 && num % 2 == 1) {	// num�� 3�̻� Ȧ�� �϶��� �۵�
	            int[] arr = new int[num];

	            /*
	             * 5�Է½� => {1,2,3,2,1}	=> 2�� �ε������� ���� �� ���ķ� ����
	             * 7�Է½� => {1,2,3,4,3,2,1}	=> 3�� �ε������� ���� �� ���ķ� ����
	             * 9�Է½� => 				=> 4�� �ε������� ���� �� ���ķ� ����
	             * 							=> �迭�� ���� / 2 �ε������� ���� �� ���ĺ��� ����
	             */
	            int value = 1;

	            for(int i = 0; i < arr.length; i++) {
	                arr[i] = value;
	                if(i < arr.length / 2) {
	                    value ++;

	                }else {
	                    value--;
	                }
	            }

	            for(int i = 0; i < arr.length; i++) {
	                System.out.print(arr[i] + " ");
	            }
	            break;

	        }else {
	            System.out.println("�ٽ� �Է��ϼ���.");
	        }
	    }

	}

}
