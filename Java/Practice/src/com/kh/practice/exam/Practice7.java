package com.kh.practice.exam;

import java.util.Scanner;

public class Practice7 {
    public static void main(String[] args) {
    	/*
		 2번 문제 
		 위 문제와 동일하나, 1미만의 숫자가 입력되었다면
		 "1 이상의 숫자를 입력해주세요"가 출력되면서 다시 사용자 값을 입력하도록 하세요.
		 */
        Scanner sc = new Scanner(System.in);

        System.out.println("숫자를 입력하세요: ");
        int num = sc.nextInt();

        // 1. 조건 값 만들기 boolean 변수 = true or false;
        boolean isTrue = false;
        while (!isTrue) { 
            if (num < 1) { // 2. 조건 추가하기
                System.out.println("1 이상의 숫자를 입력해주세요.: ");
                num = sc.nextInt();
            } else {
                for (int i = 1; i <= num; i++) {
                    System.out.println(i);
                    
                }
                isTrue = true; // 올바른 입력일 경우에만 isTrue를 true로 변경하여 루프 종료\
                break;  // if나 switch에서 사용할 수 있다.
            }
        }
    }
}