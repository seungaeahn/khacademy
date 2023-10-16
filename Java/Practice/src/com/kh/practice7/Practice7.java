package com.kh.practice7;

import java.util.Scanner;

public class Practice7 {

	public static void main(String[] args) {
		/*
		 * ����ڿ��� ���� ũ�⸦ �Է� �ް� �� ����ŭ�� �ݺ��� ���� ���� ũ�⵵ �޾�
			������ ���� �迭�� ���� �� �Ҵ��ϼ���.
			�׸��� �� �ε����� ��a������ �� �ε����� ������ŭ �ϳ��� �÷� �����ϰ� ����ϼ���.
			ex.
			���� ũ�� : 4
			0���� �� ũ�� : 2
			1���� �� ũ�� : 6
			2���� �� ũ�� : 3
			3���� �� ũ�� : 5
			a b 
			c d e f g h 
			i j k 
			l m n o p
		 */
		//����ڿ��� ���� ũ�⸦ �Է� �ް�
		Scanner sc = new Scanner(System.in);
		System.out.println("���� ũ��: ");
		int numRows = sc.nextInt();
		sc.nextLine(); //���๮�� ����
		
		int[][] charArray = new int[numRows][];
		//�� ����ŭ�� �ݺ��� ����
		for(int i = 0; i < numRows; i++) {
			//���� ũ�⵵ �޾�
			System.out.println("���� ũ��: ");
			int numCols = sc.nextInt();
			
			charArray[i] = new int[numCols];
			
			int StartValue = i * numCols + 1;
			for (int j = 0; j < numCols; j++) {
				charArray[i][j] = StartValue++;
			}
			//�迭 ��� 
			for (int a = 0; a < numRows; a++) {
				for (int j = 0; j < charArray[i].length; j++) {
					System.out.println((char)('a' + charArray[i][j] -1));
				}
				System.out.println();
			}
			sc.close();
		}
		
		

	}

}







