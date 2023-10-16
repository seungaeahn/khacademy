package com.kh.practice.array;

import java.util.Scanner;

public class practice8 {

	public static void main(String[] args) {
		/*
		 3이상인 홀수 자연수를 입력 받아 배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고,
		중간 이후부터 끝까지는 1씩 감소하여 내림차순으로 값을 넣어 출력하세요.
		단, 입력한 정수가 홀수가 아니거나 3 미만일 경우 “다시 입력하세요”를 출력하고
		다시 정수를 받도록 하세요.
		ex.
		정수 : 4
		다시 입력하세요.
		정수 : -6
		다시 입력하세요.
		정수 : 5
		1, 2, 3, 2, 1
		 */
		Scanner sc = new Scanner(System.in);

	    // 조건 맞을때까지 반복 => while
	    while(true) {
	        // 정수 입력
	        System.out.print("정수 : ");
	        int num = sc.nextInt();

	        if(num >= 3 && num % 2 == 1) {	// num이 3이상 홀수 일때만 작동
	            int[] arr = new int[num];

	            /*
	             * 5입력시 => {1,2,3,2,1}	=> 2번 인덱스까지 증가 그 이후로 감소
	             * 7입력시 => {1,2,3,4,3,2,1}	=> 3번 인덱스까지 증가 그 이후로 감소
	             * 9입력시 => 				=> 4번 인덱스까지 증가 그 이후로 감소
	             * 							=> 배열의 길이 / 2 인덱스까지 증가 그 이후부터 감소
	             */
	            int value = 1;

	            for(int i = 0; i < arr.length; i++) {
	                arr[i] = value;
	                if(i < arr.length / 2) {
	                    value ++;

	                }else {
	                    value--;
	                }
	            }

	            for(int i = 0; i < arr.length; i++) {
	                System.out.print(arr[i] + " ");
	            }
	            break;

	        }else {
	            System.out.println("다시 입력하세요.");
	        }
	    }

	}

}
