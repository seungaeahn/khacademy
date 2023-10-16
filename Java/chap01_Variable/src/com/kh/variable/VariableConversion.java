package com.kh.variable;

public class VariableConversion {
	public static void main(String[] args){
		//1. 자동 형변환(암시적 형변환, 묵시적 형변환)
		int intNum = 100;
		System.out.println(intNum); //숫자 100을 의미
		long longNum = intNum; //int를 long으로 자동 형변환
		System.out.println(longNum);
		
		float floatNum = 3.14f;
		double doubleNum = floatNum; //float을 double로 자동 형변환 
		
		// int -> long 변경하는 형변환 2가지 만들기
		int intNum1 = 222;
		System.out.println(intNum1);
		long longNum1 = intNum1;
		System.out.println(longNum1);
		
		int intNum2 = 432563;
		System.out.println(intNum2);
		long longNum2 = intNum2;
		System.out.println(longNum2);
		
		// short -> int로 변경하는 형변환
		short shortNum = 33;
		System.out.println(shortNum);
		long intNum3 = shortNum;
		System.out.println(intNum3);
		
		//float -> double로 변경하는 형변환 
		float floatNum1 = 9.7835f;
		System.out.println(floatNum1);
		double doubleNum1 = floatNum1;
		System.out.println(doubleNum1);
		
		//2. 명시적 형변환(강제 형변환)
		
		//long -> int
		long largeLong = 123456789012345L;
		System.out.println("largeLong : ");
		System.out.println(largeLong);
		int largeInt = (int) largeLong;
		System.out.println("largeInt : ");
		System.out.println(largeInt); //long을 int로 강제 형변환 할 경우 int 범위안에 들지 않을 때 억지로 넣을 순 있지만 데이터의 손실이 일어남
		
		long largeLong1 = 12345L;
		System.out.println("largeLong : ");
		System.out.println(largeLong1);
		int largeInt1 = (int) largeLong1;
		System.out.println("largeInt : ");
		System.out.println(largeInt1); //int 범위 안에 드니까 손실이 없음
		
		double largeDouble1 = 12345.6789;
		int intPart = (int) largeDouble1;
		System.out.println(intPart); //실수를 int로 강제 형변환 할 경우 정수 부분만 유지된다.
		
		//문자와 숫자 간의 형변환 2개 출력
		//문자는 char charValue = 'Z'; -> int로 변경
		char charValue = 'Z';
		System.out.println(charValue);
		int int1 = (int) charValue;
		System.out.println(int1);
		
		char charValue1 = 'A';
		System.out.println(charValue1);
		int int4 = (int) charValue1;
		System.out.println(int4);
		
		//double -> int로 형변환
		double doubleNum2 = 254.675;
		System.out.println(doubleNum2);
		int int2 = (int) doubleNum2;
		System.out.println(int2);
		
		//int -> short로 형변환 
		int int3 = 364648;
		System.out.println(int3);
		short shortNum1 = (short) int3;
		System.out.println(shortNum1);
		
		
	}
}

























