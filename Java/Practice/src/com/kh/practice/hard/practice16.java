package com.kh.practice.hard;

import java.util.Scanner;

public class practice16 {

	public static void main(String[] args) {
		/*
		 위 문제와 모든 것이 동일하나, 입력한 수가 2보다 작은 경우
		“잘못 입력하셨습니다.”를 출력하면서 다시 사용자가 값을 입력하도록 하세요.
		 * ‘소수’는 n을 1부터 n까지로 나누었을 때 나누어 떨어지는 수가 1과 n뿐인 수를 말한다.
		ex) 2, 3, 5, 7, 11 …
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 하나 입력하세요: ");
		int num = sc.nextInt();
		
		
		if(num <2) {
				System.out.print("잘못 입력하셨습니다.: ");
				num = sc.nextInt();
				
		} else if (num == 2){
			boolean isPrime = true;

		} else {
			for(int i = 2; i <= num/2; i++) {
				if(num % i == 0);  //소수가 아님
					
			} isPrime = false;	
				}
			
		 

		 System.out.println(isPrime ? "소수입니다." : "소수가 아닙니다.");
	}
}





