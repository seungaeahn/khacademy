package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice4 {

	public static void main(String[] args) {
		// ���� ���ڿ� ���� Ű����� �Է� �޾� ���ڿ��� �տ��� �� ���� ����ϼ���.
				Scanner sc = new Scanner(System.in);
				String word;
				System.out.println("���ڿ��� �Է��ϼ���: ");
				word = sc.next();
				System.out.println("ù ��° ����: " + word.charAt(0)); //���ڸ� 1�ھ� ����
				System.out.println("�� ��° ����: " + word.charAt(1)); 
				System.out.println("�� ��° ����: " + word.charAt(2)); 

	}

}

//substring()�� �̿��� �� �ִ� ����� �ִ�.
//substring()�� ���ڿ��� �Ϻθ� ������ �� �ִ�.
//String str = "abcde";
//String tmp = str.substring(2,4);
//���۸� �ۼ��� ��� ������ �ε��� ��ġ���� ������ ��µȴ�. 
