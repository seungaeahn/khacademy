package com.kh.practice.array;

import java.util.Scanner;

public class practice10 {

	public static void main(String[] args) {
		/*
		 �ֹε�Ϲ�ȣ �����ڸ� ���ĺ��� *�� ������ ����ϼ���.
		��, ���� �迭 ���� ���� ���� �迭 ���纻���� �����ϼ���.
		ex.
		�ֹε�Ϲ�ȣ(-����) : 123456-1234567
		123456-1******

		 */
		 Scanner sc = new Scanner(System.in);

		    System.out.print("�ֹε�Ϲ�ȣ(-����) : ");
		    String num = sc.nextLine();

		    char[] arr = new char[14];

		    for(int i = 0; i < num.length(); i++) {
		        arr[i] = num.charAt(i);
		    }
		    char[] copy = arr.clone(); 
		    // �ܼ��� arr.clone()���� �� ���� �迭�� ������ ������ ���� �����ϴ� ���� �ƴ� �ּڰ��� �����ϰ� �Ǿ� 
		    // arr�� ���� ����Ǹ� ������ �迭�� ���� ����ǰ� ��.
		  

		    for(int i = 7; i < copy.length; i++) {
		        copy[i] = '*';
		    }
		    System.out.println(copy);
	}

}
