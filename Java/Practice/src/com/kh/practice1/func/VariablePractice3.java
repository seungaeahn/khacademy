package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice3 {

	public static void main(String[] args) {
		//Ű���� ����, ���� ���� �Ǽ������� �Է� �޾� �簢���� ������ �ѷ��� ����Ͽ� ����ϼ���.
				Scanner sc = new Scanner(System.in);
				double width, height;
				System.out.println("������ ���̴�?");
				width = sc.nextDouble();
				System.out.println("������ ���̴�?");
				height = sc.nextDouble();
				
				System.out.println("����: "+ width + " ����: " + height);
				
				double area = width * height ;
				System.out.println("����:  " + area);
				double length =  2*(width+height);
				System.out.println("�ѷ�: " + length );

	}

}
