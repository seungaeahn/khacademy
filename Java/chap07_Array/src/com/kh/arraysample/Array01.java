package com.kh.arraysample;

import java.util.Scanner;

public class Array01 {

	public static void main(String[] args) {
		// Array
		// ���� Ÿ���� ���� ������ �ϳ��� �������� �ٷ�� ��
		/*
		 ������ ������ Ÿ���� ���� ���� ���� �� ���� �����ϰ�
		 �ε����� ����Ͽ� �� ���� ������ �� �ֵ��� ����
		 �迭�� ���α׷����� �����͸� ���� ȿ�������� ���ϰ� �����ϰ� �����ϴµ� ���
		 �������� ������ ���� �ٷ� �� �ֵ��� ������ 
		 
		 �迭�� ������ 
		 	������ Ÿ��[] �迭�̸� = new ������ Ÿ��[ũ��];
		 	
		 Ư¡:
		 1. ������ ũ��: ������ �� ũ�Ⱑ �����ǰ�, ũ�Ⱑ �����Ǿ� ���� 
		 				���� �� ũ�⸦ ������ �� ���� 
		 2. ���� ������ Ÿ�� : �迭 ���� ��� ��Ҵ� ������ ������ Ÿ���� ������ ��
		 					ex) intŸ���� �迭�� ��� ��Ұ� �������� ��
		 3. index ��� ���� : �� �迭 ��Ҵ� �������� �ε����� ������ 0���� �����ؼ� �迭ũ�� -1������ ���� ����
		 					�ε����� ����ؼ� Ư�� ��ġ�� �ִ� ��� ���� ���� 
		 					ex)  �迭ũ�� = 5�� ��ٸ� index�� 0~4
		 4. �迭�� ����(length): �迭�� ���̸� �� �� �ִ�. 
		 */
		
		//int score1, score2, score3, score4, score5;
		// score�� 5������ score�� 1000�� ��� ? => �迭 ���
		// intŸ�� �迭 ���� 
		//int[] score; 
		int[] score = new int[5];
		
		score[0] = 1;
		score[1] = 2;
		score[2] = 3;
		score[3] = 4;
		score[4] = 5;
		
		String[] stringArray = new String[4];
		stringArray[0] = "��";
		System.out.print("stringArray: " + stringArray[0]);
		stringArray[1] = "��";
		System.out.print("stringArray: " + stringArray[1]);
		stringArray[2] = "��";
		System.out.print("stringArray: " + stringArray[2]);
		stringArray[3] = "��";
		System.out.print("stringArray: " + stringArray[3]);
		System.out.print("stringArray: " + stringArray[4]);  //����
		
					//�ڸ���ȣǥ   0        1        2
		//String[] nameArray = {"��泭", "�踻��", "ȫ�浿"};
		
		String[] food = {"����", "����", "����", "�Ұ��"}; //3
		int foodLength = food.length;
		
		System.out.println("food �迭�� ����: "+ foodLength); 
	}

}










