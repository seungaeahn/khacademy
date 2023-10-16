package com.kh.practice;

import java.util.Scanner;

public class practice4 {

	public static void main(String[] args) {
		/*
		 봄, 여름, 가을, 겨울 예제를 switch문으로 바꿔서 출력하세요.
		ex 1.
		1~12 사이의 정수 입력 : 8
		8월은 여름입니다.
		ex 2.
		1~12 사이의 정수 입력 : 99
		99월은 잘못 입력된 달입니다.
		 */
		
		
		Scanner sc = new Scanner(System.in);
		int month;
		System.out.println("1~12 사이의 정수 입력 : ");
		month = sc.nextInt();
		switch (month) {
			case 1: 
				System.out.println("겨울"); 
				break;
			case 2:
				System.out.println("겨울"); 
				break; 
			case 3:
				System.out.println("봄");
				break;
			case 4:
				System.out.println("봄");
				break;
			case 5:
				System.out.println("봄");
				break;
			case 6:
				System.out.println("여름");
				break;
			case 7:
				System.out.println("여름");
				break;
			case 8:
				System.out.println("여름");
				break;
			case 9:
				System.out.println("가을");
				break;
			case 10:
				System.out.println("가을");
				break;
			case 11:
				System.out.println("겨울");
				break;
			case 12:
				System.out.println("겨울");
				break;
			default:
				System.out.println(month + "월은 잘못 입력된 달입니다.");
		}		
		
		
	}

}
