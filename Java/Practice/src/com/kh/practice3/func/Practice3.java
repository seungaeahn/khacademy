package com.kh.practice3.func;

import java.util.Scanner;

public class Practice3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int korean, english, math;
		System.out.println("국어점수: ");
	    korean = sc.nextInt();
	    System.out.println("영어점수: ");
		english = sc.nextInt();
		System.out.println("수학점수: ");
		math = sc.nextInt();
		
		float average = (korean + english + math)/3;
		
		if (average >= 60) {
			System.out.println("축하합니다, 합격입니다!");
		} else {
			System.out.println("불합격입니다.");
		}

	}

}
