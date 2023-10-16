package com.kh.practice.array;

import java.util.Scanner;

public class practice6 {

	public static void main(String[] args) {
		/*
		 “월“ ~ “일”까지 초기화된 문자열 배열을 만들고 0부터 6까지 숫자를 입력 받아
		입력한 숫자와 같은 인덱스에 있는 요일을 출력하고
		범위에 없는 숫자를 입력 시 “잘못 입력하셨습니다“를 출력하세요.
		ex.
		0 ~ 6 사이 숫자 입력 : 4 0 ~ 6 사이 숫자 입력 : 7
		금요일 잘못 입력하셨습니다.
		 */
		 char[] week = {'월','화','수','목','금','토','일'};	// char형 배열은 ""가 아닌 '' 써야된다. 

		    Scanner sc = new Scanner(System.in);

		    System.out.print("0 ~ 6 사이 숫자 입력 : ");
		    int num = sc.nextInt();

		    if(num >= 0 && num < 7) {
		        System.out.print(week[num]);
		    }else {
		        System.out.println("잘못 입력하셨습니다.");
		    }
	}

}
