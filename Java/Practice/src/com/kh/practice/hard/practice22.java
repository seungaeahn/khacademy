package com.kh.practice.hard;

import java.util.Scanner;

public class practice22 {

	public static void main(String[] args) {
		/*
		 다음과 같은 실행 예제를 구현하세요.
			ex.
			정수 입력 : 5
			*****
			*   *
			*   *
			*   *
			*****
		 */
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		//사각형 
		for(int i = 1; i <= 5; i++) { //행 숫자 
			for(int j = 1; j <= 5; j++) { //열 숫자 
				// 행이 1인 경우 (가장 윗줄)
				// 현재 행에서 출력하는 열이 첫 번째 열일 경우 (j == 1)
				// 현재 행에서 가장 마지막인 열일 경우 (j == num) 
				// 행이 마지막일 경우 (가장 아랫줄) 
			
			} else {
				System.out.println("&");
			}
			System.out.println(); //줄바꿈 
		}
			
		
		
		
		
		
	}

}
