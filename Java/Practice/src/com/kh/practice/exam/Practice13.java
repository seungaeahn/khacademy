package com.kh.practice.exam;

import java.util.Scanner;

public class Practice13 {

	public static void main(String[] args) {
		/*
		 8번 문제
		 사용자로부터 입력 받은 숫자의 단부터 9단까지 출력하세요.
		단, 9를 초과하는 숫자가 들어오면 “9 이하의 숫자만 입력해주세요”를 출력하세요.
		 */
		 Scanner sc = new Scanner(System.in);

		 System.out.print("숫자 : ");
			int dan = sc.nextInt(); // 정수를 입력받는 메소드

			if (dan <= 9) {
				for (dan = dan; dan < 10; dan++) { // 입력받은 숫자부터 9까지
					System.out.println("===== " + dan + "단 =====");

					for (int i = 1; i < 10; i++) {
						System.out.printf("%d * %d = %d\n", dan, i, dan * i);
					}
				}
			} else { // 9를 초과하는 숫자를 입력했을 경우
				System.out.println("9이하의 숫자만 입력해주세요.");
			}
	}
}
