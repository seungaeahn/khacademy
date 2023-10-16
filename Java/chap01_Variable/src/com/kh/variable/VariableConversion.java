package com.kh.variable;

public class VariableConversion {
	public static void main(String[] args){
		//1. �ڵ� ����ȯ(�Ͻ��� ����ȯ, ������ ����ȯ)
		int intNum = 100;
		System.out.println(intNum); //���� 100�� �ǹ�
		long longNum = intNum; //int�� long���� �ڵ� ����ȯ
		System.out.println(longNum);
		
		float floatNum = 3.14f;
		double doubleNum = floatNum; //float�� double�� �ڵ� ����ȯ 
		
		// int -> long �����ϴ� ����ȯ 2���� �����
		int intNum1 = 222;
		System.out.println(intNum1);
		long longNum1 = intNum1;
		System.out.println(longNum1);
		
		int intNum2 = 432563;
		System.out.println(intNum2);
		long longNum2 = intNum2;
		System.out.println(longNum2);
		
		// short -> int�� �����ϴ� ����ȯ
		short shortNum = 33;
		System.out.println(shortNum);
		long intNum3 = shortNum;
		System.out.println(intNum3);
		
		//float -> double�� �����ϴ� ����ȯ 
		float floatNum1 = 9.7835f;
		System.out.println(floatNum1);
		double doubleNum1 = floatNum1;
		System.out.println(doubleNum1);
		
		//2. ����� ����ȯ(���� ����ȯ)
		
		//long -> int
		long largeLong = 123456789012345L;
		System.out.println("largeLong : ");
		System.out.println(largeLong);
		int largeInt = (int) largeLong;
		System.out.println("largeInt : ");
		System.out.println(largeInt); //long�� int�� ���� ����ȯ �� ��� int �����ȿ� ���� ���� �� ������ ���� �� ������ �������� �ս��� �Ͼ
		
		long largeLong1 = 12345L;
		System.out.println("largeLong : ");
		System.out.println(largeLong1);
		int largeInt1 = (int) largeLong1;
		System.out.println("largeInt : ");
		System.out.println(largeInt1); //int ���� �ȿ� ��ϱ� �ս��� ����
		
		double largeDouble1 = 12345.6789;
		int intPart = (int) largeDouble1;
		System.out.println(intPart); //�Ǽ��� int�� ���� ����ȯ �� ��� ���� �κи� �����ȴ�.
		
		//���ڿ� ���� ���� ����ȯ 2�� ���
		//���ڴ� char charValue = 'Z'; -> int�� ����
		char charValue = 'Z';
		System.out.println(charValue);
		int int1 = (int) charValue;
		System.out.println(int1);
		
		char charValue1 = 'A';
		System.out.println(charValue1);
		int int4 = (int) charValue1;
		System.out.println(int4);
		
		//double -> int�� ����ȯ
		double doubleNum2 = 254.675;
		System.out.println(doubleNum2);
		int int2 = (int) doubleNum2;
		System.out.println(int2);
		
		//int -> short�� ����ȯ 
		int int3 = 364648;
		System.out.println(int3);
		short shortNum1 = (short) int3;
		System.out.println(shortNum1);
		
		
	}
}

























