package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice4 {

	public static void main(String[] args) {
		// 영어 문자열 값을 키보드로 입력 받아 문자에서 앞에서 세 개를 출력하세요.
				Scanner sc = new Scanner(System.in);
				String word;
				System.out.println("문자열을 입력하세요: ");
				word = sc.next();
				System.out.println("첫 번째 문자: " + word.charAt(0)); //문자를 1자씩 읽음
				System.out.println("두 번째 문자: " + word.charAt(1)); 
				System.out.println("세 번째 문자: " + word.charAt(2)); 

	}

}

//substring()을 이용할 수 있는 방법도 있다.
//substring()은 문자열의 일부를 가져올 수 있다.
//String str = "abcde";
//String tmp = str.substring(2,4);
//시작만 작성할 경우 시작한 인덱스 위치부터 끝까지 출력된다. 
