package com.kh.switchsample;

import java.util.Scanner;

public class SwitchScanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("과일을 선택해주세요.");
		//int fruit = 3;
		int fruit = sc.nextInt();
		
		switch (fruit) {
		case 1:
			System.out.println("사과");
			break;
		case 2:
			System.out.println("포도");
			break;
		default:
			System.out.println("잘못된 선택입니다.");
		}
		
		//scanner를 이용해서 과자를 선택하는 switch를 하나 만들어주세요.
		System.out.println("과자를 선택해주세요.");
		int snack = sc.nextInt();
		
		switch (snack) {
		case 1:
			System.out.println("새우깡");
			break;
		case 2:
			System.out.println("양파링");
			break;
		case 3:
			System.out.println("빼빼로");
			break;
		default:
			System.out.println("잘못된 선택입니다.");
			
		}
		
		
		System.out.println("주문하실 번호를 선택해주세요.");
		System.out.println("1. 아메리카노");
		System.out.println("2. 흑당 버블티");
		System.out.println("3. 아인슈페너");
		

		int choice = sc.nextInt();
		
		switch (choice) {
			case 1:
				System.out.println("아메리카노 주문하셨습니다.");
				break;
			case 2:
				System.out.println("흑당 버블티 주문하셨습니다,");
				break;
			case 3:
				System.out.println("아인슈페너를 주문하셨습니다.");
				break;
			default:
				System.out.println("잘못된 선택입니다. 다시 주문해주세요.");
		}
		
		

	}

}
