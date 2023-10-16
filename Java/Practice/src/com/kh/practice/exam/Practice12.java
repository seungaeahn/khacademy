package com.kh.practice.exam;

import java.util.Scanner;

public class Practice12 {

	public static void main(String[] args) {
		/*
		 7번 문제 
		 사용자로부터 입력 받은 숫자의 단을 출력하세요.
		 */
		 Scanner sc = new Scanner(System.in);

		 System.out.print("숫자: ");
		 int num = sc.nextInt();
	
		 System.out.println("====  " + num + "단" + "  ====");
		 
		 for (int i = 1; i <= 9; i++) {
		 System.out.println(num + " * " + i + " = " + (num * i));
		 }
	}

}

