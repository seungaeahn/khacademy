package com.kh.practice3.func;

import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {
		/*
		 아래 예시와 같이 메뉴를 출력하고 메뉴 번호를 누르면 “OO메뉴입니다“를,
		종료 번호를 누르면 “프로그램이 종료됩니다.”를 출력하세요.
		ex.
		1. 입력
		2. 수정
		3. 조회
		4. 삭제
		7. 종료
		메뉴 번호를 입력하세요 : 3
		조회 메뉴입니다. 
		 */
		Scanner scanner = new Scanner(System.in);
		
		int choice;
		
		
			System.out.println("1. 입력");
			System.out.println("2. 수정");
			System.out.println("3. 조회");
			System.out.println("4. 삭제");
			System.out.println("7. 종료");
			System.out.println("메뉴 번호를 입력하세요 : ");
			
			choice = scanner.nextInt();
			
			/** 1. If문 **/
			
			if (choice == 1) {
				System.out.println("입력");
			} else if (choice == 2) {
				System.out.println("수정");
			} else if (choice == 3) {
				System.out.println("조회");
			} else if (choice == 4) {
				System.out.println("삭제");
			} else if (choice == 7) {
				System.out.println("프로그램이 종료됩니다.");
			} //else를 쓸 경우 조건을 넣지 못하기 때문에 else if를 써야함
			
			
			
			/** 2. Switch 문 **/
			
			switch(choice) {
				case 1:
					System.out.println("입력 메뉴입니다.");
					break;
				case 2:
					System.out.println("수정 메뉴입니다.");
					break;
				case 3 :
					System.out.println("조회 메뉴입니다.");
					break;
				case 4 :
					System.out.println("삭제 메뉴입니다.");
					break;
				case 7 :
					System.out.println("프로그램이 종료됩니다.");
					break;
				default:
					System.out.println("올바르지 않은 번호입니다.");
				}

	}

}
