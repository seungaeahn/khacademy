package com.kh.inheritance.calculator;

import java.util.Scanner;

public class CalculatorRun extends Calculator{
	
	CalculatorForMod cal = new CalculatorForMod();

	public static void main(String[] args) {
		/*Scanner �̿��ؼ� �ڵ� �����ϱ�*/
		Scanner sc = new Scanner(System.in);
		System.out.println("num1 �Է�: ");
		int num1 = sc.nextInt();
		System.out.println("num2 �Է�: ");
		int num2 = sc.nextInt();
		
		Calculator cal = new Calculator();
		int result1 = cal.add();
		int result2 = cal.substruct();
		int result3 = cal.multiply();
		int result4 = cal.divide();
		//int result5 = cal.mod(); �ڹٴ� ���߻�� �Ұ�
		
		System.out.println("Add: " + result1);
		System.out.println("Substruct: " + result2);
		System.out.println("Multiply: " + result3);
		System.out.println("Divide: " + result4);
		//System.out.println("Mod: " + result5); �ڹٴ� ���߻�� �Ұ�
	}

}
