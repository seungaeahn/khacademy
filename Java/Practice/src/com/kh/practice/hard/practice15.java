package com.kh.practice.hard;

import java.util.Scanner;

public class practice15 {

	public static void main(String[] args) {
		/*
		 사용자로부터 입력 받은 하나의 값이 소수인지 판별하는 프로그램을 구현하세요.
		단(=만약에 -> if문 사용) , 입력한 수가 2보다 작은 경우 “잘못 입력하셨습니다.”를 출력하세요.
		* ‘소수’는 n을 1부터 n까지로 나누었을 때 나누어 떨어지는 수가 1과 n뿐인 수를 말한다.
		ex) 2, 3, 5, 7, 11 …

		 */
		// 주어진 숫자를 그 중간값, 즉 제곱근 값으로 나누어 떨어지는 수가 없는 것을 찾는 것이 핵심.
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 하나 입력하세요: ");
		int num = sc.nextInt();
		
		// isPrime : 소수인지 판별
				boolean isPrime = true;
		
		// i : num에 나눌 값, for문을 한 바퀴 돌 때마다 1씩 증가한다.
		// 변수 i를 num/2만큼만 반복하게 해서 반복횟수를 줄인다.
				for(int i = 2; i <= num/2; i++) {
		        	// 순차적으로 i를 num에 나누어본다.
					if(num % i == 0) {
		            	// num이 i로 나눠져 나머지가 0이 되면 isPrime에 false(소수가 아님)을 입력한다.
						isPrime = false;
		                // 이미 1과 자기자신 외에 다른 수로도 나눠져 합성수임을 알았으므로 더 이상 반복하지 않고 빠져나온다.
						break;
					}
				}
				
				// 삼항 연산자를 사용하여 isPrime이 true이면 "소수입니다."를 출력한다.
		        // isPrime이 false라면 "소수가 아닙니다."를 출력한다.
				System.out.println(isPrime ? "소수입니다." : "소수가 아닙니다.");
		
		// a * a를 사용하는 것은 소수 판별 알고리즘을 최적화하기 위해 사용되는 방법
				//for(int a =2; a * a <= i; i++)
			//sqrt(i); i의 제곱근을 나타내는 함수 
				
				
		
		
		
	}

}
