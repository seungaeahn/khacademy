package com.kh.overloadingEx;

public class OverSample {
	
	public int sum(int a, int b) {
		return a+b;
	}
	public int sum(int a, int b, int c) {
		return a+b+c;
	}
	public int sum(int a, int b, int c, int d) {
		return a+b+c+d;
	}
	public int sum(int a, int b, int c, int d, int e) {
		return a+b+c+d+e;
	}
	public int sum(int a, int b, int c, int d, int e, int f) {
		return a+b+c+d+e+f;
	}
	
	
	

	public static void main(String[] args) {
		OverSample os = new OverSample();
		
		//�޼��� ȣ��
		System.out.println("�� ������ ��: " + os.sum(10,20));
		System.out.println("�� ������ ��: " + os.sum(10,20,30));
		System.out.println("�� ������ ��: " + os.sum(10,20,30,40));
		System.out.println("�ټ� ������ ��: " + os.sum(10,20,30,40,50));
		System.out.println("���� ������ ��: " + os.sum(10,20,30,40,50,60));
		
	}

}
