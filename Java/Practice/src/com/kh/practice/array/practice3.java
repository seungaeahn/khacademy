package com.kh.practice.array;

public class practice3 {

	public static void main(String[] args) {
		/*
		 ����ڿ��� �Է� ���� ���� ������ŭ �迭 ũ�⸦ �Ҵ��ϰ�
		1���� �Է� ���� ������ �迭�� �ʱ�ȭ�� �� ����ϼ���.
		ex.
		���� ���� : 5
		1 2 3 4 5 
		 */
		int[] array = new int[10];

		for (int i = 0; i < array.length; i++) {
			array[i] = i + 1;
			System.out.println(array[i]);
		}

	}

}
