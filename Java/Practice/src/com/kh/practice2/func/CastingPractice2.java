package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice2 {

	public static void main(String[] args) {
		// 실수형(소수점)으로 국어, 영어, 수학 세 과목의 점수를 입력 받아 총점과 평균을 출력하세요. 
		// 이 때 총점과 평균은 정수형으로 처리하세요.
				Scanner sc = new Scanner(System.in);
				float korean, english, math;
				System.out.println("국어: ");
				korean = sc.nextFloat();
				System.out.println("영어: ");
				english = sc.nextFloat();
				System.out.println("수학: ");
				math = sc.nextFloat();
				
				int totalScore = (int) (korean + english + math);
				System.out.println("총점: " + totalScore);
				int averageScore = (int) (korean + english + math) / 3;
				System.out.println("평균: " + averageScore);

	}

}
