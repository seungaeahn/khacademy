package com.kh.practice.array;

import java.util.Scanner;

public class practice6 {

	public static void main(String[] args) {
		/*
		 ������ ~ ���ϡ����� �ʱ�ȭ�� ���ڿ� �迭�� ����� 0���� 6���� ���ڸ� �Է� �޾�
		�Է��� ���ڿ� ���� �ε����� �ִ� ������ ����ϰ�
		������ ���� ���ڸ� �Է� �� ���߸� �Է��ϼ̽��ϴ١��� ����ϼ���.
		ex.
		0 ~ 6 ���� ���� �Է� : 4 0 ~ 6 ���� ���� �Է� : 7
		�ݿ��� �߸� �Է��ϼ̽��ϴ�.
		 */
		 char[] week = {'��','ȭ','��','��','��','��','��'};	// char�� �迭�� ""�� �ƴ� '' ��ߵȴ�. 

		    Scanner sc = new Scanner(System.in);

		    System.out.print("0 ~ 6 ���� ���� �Է� : ");
		    int num = sc.nextInt();

		    if(num >= 0 && num < 7) {
		        System.out.print(week[num]);
		    }else {
		        System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		    }
	}

}
