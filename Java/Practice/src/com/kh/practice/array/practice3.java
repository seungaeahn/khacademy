package com.kh.practice.array;

public class practice3 {

	public static void main(String[] args) {
		/*
		 사용자에게 입력 받은 양의 정수만큼 배열 크기를 할당하고
		1부터 입력 받은 값까지 배열에 초기화한 후 출력하세요.
		ex.
		양의 정수 : 5
		1 2 3 4 5 
		 */
		int[] array = new int[10];

		for (int i = 0; i < array.length; i++) {
			array[i] = i + 1;
			System.out.println(array[i]);
		}

	}

}
