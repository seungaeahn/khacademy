package com.kh.arraysample;

import java.util.Scanner;

public class Array03 {

	public static void main(String[] args) {
		/*
		 1. 문자열을 입력받아 
		 2. 문자 하나하나 배열에 넣고
		 3. 검색할 문자 Scanner 
		 4. 검색할 문자가 문자열에 맞게 들어가 있는지 개수와
		 5. 몇 번째 인덱스에 위치하는지 인데스 출력하기 
		 6. 인덱스 출력하기 
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열을 입력하세요.: ");
		String inputString = sc.next();
		System.out.println("검색할 문자를 입력하세요.: ");
		
		char searchChar = sc.next().charAt(0); //첫번째 
		// char charString = (char) inputString; -> 하나하나 입력하는 건 어려우니! toCharArray 사용해보자 
		//String -> char
		//문자열을 -> 문자로 변환 
		// 안녕하세요. -> '안' '녕' '하' '세' '요'
		//toCharArray -> 문자열을 문자 배열로 변환하는 역할 
		char[] charString = inputString.toCharArray();
		
		int charCount = charString.length;
		System.out.println("charCount: " + charCount);
	// 총길이가 얼마나 되는지 확인하고, 각 자리값 출력하기
		int count = 0; //검색할 문자 카운트
		System.out.println(inputString + "에" + searchChar + " 가 존재하는 위치(인덱스)");
		// 반복문을 사용해서 위치찾기
		for (int i=0; i < charCount; i++) {
			// 만약에 내가 이 단어를 검색했을 때 이 문자는 몇번째 인덱스에 위치하는 지 인덱스 출력하기
			if (charString[i] == searchChar) { 
				//charString[i] 고정값이 아니라 i 값이 되어야 하는 이유는 
				//searchChar우리가 검색해서 문자열을 지정해주기 때문에 값이 고정되어 있어야 함 
				
				// 문자배열이 내가 검색한 문자와 일치하는지 
			System.out.println(i);
			}
			
		}
	}
}
