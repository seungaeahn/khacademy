package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice2 {

	public static void main(String[] args) {
		// 키보드로 정수 두 개를 입력 받아 두 수의 합, 차, 곱, 나누기한 몫을 출력하세요.
			//int inum1 = 30;
			//int inum2 = 3;
			
			Scanner sc = new Scanner(System.in);
			
			int inum4, inum5;
			System.out.println("정수를 입력하세요.: ");
			inum4 = sc.nextInt();
			System.out.println("또 다른 정수를 입력하세요.: ");
			inum5 = sc.nextInt();
			
			System.out.println(inum4 + inum5);
			System.out.println(inum4 - inum5);
			System.out.println(inum4 * inum5);
			System.out.println(inum4 / inum5);
			System.out.println(inum4 % inum5);

	}

}
