package com.kh.practice.hard;

import java.util.Scanner;

public class practice16 {

	public static void main(String[] args) {
		/*
		 �� ������ ��� ���� �����ϳ�, �Է��� ���� 2���� ���� ���
		���߸� �Է��ϼ̽��ϴ�.���� ����ϸ鼭 �ٽ� ����ڰ� ���� �Է��ϵ��� �ϼ���.
		 * ���Ҽ����� n�� 1���� n������ �������� �� ������ �������� ���� 1�� n���� ���� ���Ѵ�.
		ex) 2, 3, 5, 7, 11 ��
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �ϳ� �Է��ϼ���: ");
		int num = sc.nextInt();
		
		
		if(num <2) {
				System.out.print("�߸� �Է��ϼ̽��ϴ�.: ");
				num = sc.nextInt();
				
		} else if (num == 2){
			boolean isPrime = true;

		} else {
			for(int i = 2; i <= num/2; i++) {
				if(num % i == 0);  //�Ҽ��� �ƴ�
					
			} isPrime = false;	
				}
			
		 

		 System.out.println(isPrime ? "�Ҽ��Դϴ�." : "�Ҽ��� �ƴմϴ�.");
	}
}





