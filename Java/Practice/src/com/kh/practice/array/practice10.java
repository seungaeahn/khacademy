package com.kh.practice.array;

import java.util.Scanner;

public class practice10 {

	public static void main(String[] args) {
		/*
		 주민등록번호 성별자리 이후부터 *로 가리고 출력하세요.
		단, 원본 배열 값은 변경 없이 배열 복사본으로 변경하세요.
		ex.
		주민등록번호(-포함) : 123456-1234567
		123456-1******

		 */
		 Scanner sc = new Scanner(System.in);

		    System.out.print("주민등록번호(-포함) : ");
		    String num = sc.nextLine();

		    char[] arr = new char[14];

		    for(int i = 0; i < num.length(); i++) {
		        arr[i] = num.charAt(i);
		    }
		    char[] copy = arr.clone(); 
		    // 단순히 arr.clone()으로 한 번에 배열을 복사할 때에는 값을 복사하는 것이 아닌 주솟값을 복사하게 되어 
		    // arr의 값이 변경되면 복사한 배열의 값도 변경되게 됨.
		  

		    for(int i = 7; i < copy.length; i++) {
		        copy[i] = '*';
		    }
		    System.out.println(copy);
	}

}
