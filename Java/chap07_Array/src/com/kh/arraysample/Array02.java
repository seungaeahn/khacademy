package com.kh.arraysample;

public class Array02 {

	public static void main(String[] args) {
		/*
		// 1. �迭�� ���̸� ����
		int[] num = new int[10]; //���̰� 10�� �迭 
		// 1~10������ �ݺ����� �̿��ؼ�
		
		for(int i = 0; i < num.length; i++) {
			// ������� �迭 �ε����� ���� �� 
			num[i] = i + 1;
			System.out.println(i);
		}
		// �� ���� ���
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
			
		}
		*/
		// ���̰� 10�� �迭�� ���� 1~10������ ���� �ݺ���
		// �������� �迭 �ε����� ���� �� �� ���� ����ϱ�
		// ��°�: 10 9 8 7 6 5 4 3 2 1 
		int[] num = new int[10]; //���̰� 10�� �迭 
		
		int value = 10;
		//      0       0 < 10          i+1
		for(int i = 0; i < num.length; i++) {
			
			num[i] = value--;
			System.out.println("num[" + i + "] =  " + num[i]);
		}
		
		// 2. ���̰� 5�� String�迭 ����
		//"���", "��", "����", "������", "����"�� �ʱ�ȭ�� ��
		//�迭 �ε����� Ȱ���ؼ� ���� ����ϱ� 
		String[] fruit = {"���", "��", "����", "������", "����"}; 
		//int fruitLength = fruit.length;
		System.out.print( fruit[1]);
		
	}

}
