package com.kh.arraysample;

public class Array02 {

	public static void main(String[] args) {
		/*
		// 1. 배열의 길이를 선언
		int[] num = new int[10]; //길이가 10인 배열 
		// 1~10까지의 반복문을 이용해서
		
		for(int i = 0; i < num.length; i++) {
			// 순서대로 배열 인덱스에 넣은 후 
			num[i] = i + 1;
			System.out.println(i);
		}
		// 그 값을 출력
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
			
		}
		*/
		// 길이가 10인 배열을 선언 1~10까지의 값을 반복문
		// 역순으로 배열 인덱스에 넣은 후 그 값을 출력하기
		// 출력값: 10 9 8 7 6 5 4 3 2 1 
		int[] num = new int[10]; //길이가 10인 배열 
		
		int value = 10;
		//      0       0 < 10          i+1
		for(int i = 0; i < num.length; i++) {
			
			num[i] = value--;
			System.out.println("num[" + i + "] =  " + num[i]);
		}
		
		// 2. 길이가 5인 String배열 선언
		//"사과", "귤", "포도", "복숭아", "참외"로 초기화한 후
		//배열 인덱스를 활용해서 귤을 출력하기 
		String[] fruit = {"사과", "귤", "포도", "복숭아", "참외"}; 
		//int fruitLength = fruit.length;
		System.out.print( fruit[1]);
		
	}

}
