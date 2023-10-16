package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice1 {

	public static void main(String[] args) {
		// 키보드로 문자 하나를 입력 받아 그 문자의 숫자를 출력하세요.
				Scanner sc = new Scanner(System.in);
				String word;
				System.out.println("문자: ");
				word = sc.next();
				char word1 = word.charAt(0); //입력받은 문자 출력 
				
				int int1 = (int) word1;
				System.out.println("입력문자 : " + word1 + " 유니코드: " + int1);

	}

}
