package com.kh.inheritance.calculator;

import java.util.Scanner;

public class CalculatorRun extends Calculator{
	
	CalculatorForMod cal = new CalculatorForMod();

	public static void main(String[] args) {
		/*Scanner 이용해서 코드 변경하기*/
		Scanner sc = new Scanner(System.in);
		System.out.println("num1 입력: ");
		int num1 = sc.nextInt();
		System.out.println("num2 입력: ");
		int num2 = sc.nextInt();
		
		Calculator cal = new Calculator();
		int result1 = cal.add();
		int result2 = cal.substruct();
		int result3 = cal.multiply();
		int result4 = cal.divide();
		//int result5 = cal.mod(); 자바는 이중상속 불가
		
		System.out.println("Add: " + result1);
		System.out.println("Substruct: " + result2);
		System.out.println("Multiply: " + result3);
		System.out.println("Divide: " + result4);
		//System.out.println("Mod: " + result5); 자바는 이중상속 불가
	}

}
