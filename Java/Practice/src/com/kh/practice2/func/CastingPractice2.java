package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice2 {

	public static void main(String[] args) {
		// �Ǽ���(�Ҽ���)���� ����, ����, ���� �� ������ ������ �Է� �޾� ������ ����� ����ϼ���. 
		// �� �� ������ ����� ���������� ó���ϼ���.
				Scanner sc = new Scanner(System.in);
				float korean, english, math;
				System.out.println("����: ");
				korean = sc.nextFloat();
				System.out.println("����: ");
				english = sc.nextFloat();
				System.out.println("����: ");
				math = sc.nextFloat();
				
				int totalScore = (int) (korean + english + math);
				System.out.println("����: " + totalScore);
				int averageScore = (int) (korean + english + math) / 3;
				System.out.println("���: " + averageScore);

	}

}
