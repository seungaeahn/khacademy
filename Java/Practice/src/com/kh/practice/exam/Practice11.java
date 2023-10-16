package com.kh.practice.exam;

import java.util.Scanner;

public class Practice11 {

	public static void main(String[] args) {
		/*
		 6번 문제
		 사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요.
		 */
		Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 숫자: ");
        int num1 = sc.nextInt();

        System.out.print("두 번째 숫자: ");
        int num2 = sc.nextInt();

        int start, end;
        if (num1 < num2) {
            start = num1;
            end = num2;
        } else {
            start = num2;
            end = num1;
        }

        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");
        }
        
     // Math 다바에 내장 클래스
     // min (가장 작은 값) 주어진 두 개의 숫자 중에서 더 작은 값을 반환 
     // max (가장 큰 값) 주어진 두 개의 숫자 중에서 더 큰 값을 반환 
     int a = 5;
     int b = 8;
     int minValue = Math.min(a, b);
     System.out.print(minValue);
     int maxValue = Math.max(a, b);
     System.out.print(maxValue);
        
        
	}

}












