package com.kh.api.exam1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class PracticeMain4 {

	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		
		PracticeMain4 pm4 = new PracticeMain4();
		pm4.practice2();
		pm4.practice3();
		pm4.practice4();
		

	}
	public void practice2() {
		//��¥ ���� ���
		Date currentDate = new Date();
		SimpleDateFormat smDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		String s = smDateFormat.format(currentDate);
		String formatStr = String.format("���� ��¥:: %s", s);
		System.out.println(formatStr);
	}

	
	
	public void practice3() {
		//���ڰ� ������ ���̺��� ª�� ��� �տ� 0���� ä���ְڴ�
		int num1 = 123;
		int num2 = 7;
		String a = String.format("����1: %05d, ����2: %d", num1, num2);
		System.out.println(a);
	}
	public void practice4() {
		String text1 = "Hello";
		String text2 = "World";
		//10�� �ּ� �ʺ� �ּ� 10�ڸ��� ������ ����
		//���� ���ڿ��� 10�ڸ����� ª�ٸ� ���ʿ� �������� ä����
		//���� ���ڿ��� 10�ڸ����� ª�ٸ� �����ʿ� �������� ä���� 
		//' ����ǥ�� �ѷ��ξ��� 
		
		String formatStr = String.format("'%-10s' '%10s'", text1, text2);
		System.out.println(formatStr);
	}
	
}







