package com.kh.practice3.func;

import java.util.Scanner;

public class Practice3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int korean, english, math;
		System.out.println("��������: ");
	    korean = sc.nextInt();
	    System.out.println("��������: ");
		english = sc.nextInt();
		System.out.println("��������: ");
		math = sc.nextInt();
		
		float average = (korean + english + math)/3;
		
		if (average >= 60) {
			System.out.println("�����մϴ�, �հ��Դϴ�!");
		} else {
			System.out.println("���հ��Դϴ�.");
		}

	}

}
