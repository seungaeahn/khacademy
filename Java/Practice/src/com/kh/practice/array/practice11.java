package com.kh.practice.array;

public class practice11 {

	public static void main(String[] args) {
		/*
		 10���� ���� ������ �� �ִ� ������ �迭�� ���� �� �Ҵ��ϰ�
		1~10 ������ ������ �߻����� �迭�� �ʱ�ȭ�� �� ����ϼ���.
		ex.
		9 7 6 2 5 10 7 2 9 6
		 */
		int[] arr = new int[10];
	    for(int i = 0; i < arr.length; i++) {
	        int random = (int)(Math.random()* 10 +1);
	        arr[i] = random;
	    }
	    for(int i = 0; i < arr.length; i++) {
	        System.out.print(arr[i] + " ");
	    }
	}

}
