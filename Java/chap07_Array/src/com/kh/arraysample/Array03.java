package com.kh.arraysample;

import java.util.Scanner;

public class Array03 {

	public static void main(String[] args) {
		/*
		 1. ���ڿ��� �Է¹޾� 
		 2. ���� �ϳ��ϳ� �迭�� �ְ�
		 3. �˻��� ���� Scanner 
		 4. �˻��� ���ڰ� ���ڿ��� �°� �� �ִ��� ������
		 5. �� ��° �ε����� ��ġ�ϴ��� �ε��� ����ϱ� 
		 6. �ε��� ����ϱ� 
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڿ��� �Է��ϼ���.: ");
		String inputString = sc.next();
		System.out.println("�˻��� ���ڸ� �Է��ϼ���.: ");
		
		char searchChar = sc.next().charAt(0); //ù��° 
		// char charString = (char) inputString; -> �ϳ��ϳ� �Է��ϴ� �� ������! toCharArray ����غ��� 
		//String -> char
		//���ڿ��� -> ���ڷ� ��ȯ 
		// �ȳ��ϼ���. -> '��' '��' '��' '��' '��'
		//toCharArray -> ���ڿ��� ���� �迭�� ��ȯ�ϴ� ���� 
		char[] charString = inputString.toCharArray();
		
		int charCount = charString.length;
		System.out.println("charCount: " + charCount);
	// �ѱ��̰� �󸶳� �Ǵ��� Ȯ���ϰ�, �� �ڸ��� ����ϱ�
		int count = 0; //�˻��� ���� ī��Ʈ
		System.out.println(inputString + "��" + searchChar + " �� �����ϴ� ��ġ(�ε���)");
		// �ݺ����� ����ؼ� ��ġã��
		for (int i=0; i < charCount; i++) {
			// ���࿡ ���� �� �ܾ �˻����� �� �� ���ڴ� ���° �ε����� ��ġ�ϴ� �� �ε��� ����ϱ�
			if (charString[i] == searchChar) { 
				//charString[i] �������� �ƴ϶� i ���� �Ǿ�� �ϴ� ������ 
				//searchChar�츮�� �˻��ؼ� ���ڿ��� �������ֱ� ������ ���� �����Ǿ� �־�� �� 
				
				// ���ڹ迭�� ���� �˻��� ���ڿ� ��ġ�ϴ��� 
			System.out.println(i);
			}
			
		}
	}
}
