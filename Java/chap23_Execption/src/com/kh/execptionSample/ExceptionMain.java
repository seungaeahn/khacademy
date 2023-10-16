package com.kh.execptionSample;

public class ExceptionMain {

	public static void main(String[] args) {
		ExceptionMain exmain = new ExceptionMain();
		exmain.ExceptionA();
		exmain.ExceptionN();
		exmain.ExceptionF();
	}
	public void ExceptionA() {
		try {
			int result = 10 / 0; //0���� ������ �õ�
			System.out.println("Result : " + result);
		} catch (ArithmeticException e) {
			/*
			 ArithmeticException �������� ��� �������� �߻��ϴ� ����
			 ArithmeticException e : e�� �츮�� ������ ������ 
			 e�� ������ ������ �޼����� getMessage()�� ���� �޴´�.
			 
			 */
			System.out.println("��� �������� ���� �߻��� ����!! " + e.getMessage());
		}
		
	}
	
	public void ExceptionN() {
		try {
		String text = null;
		int length = text.length(); //������ ���µ� text�κ��� ���ڿ��� ���̸� ���
		System.out.println("���ڿ� ���� : " + length);
		} catch (NullPointerException n) {
			System.out.println("�� ����!! " + n.getMessage());
		}
	}

	public void ExceptionF() {
		//050904
		try {
			String juminNumber = "050����4";
			int number = Integer.parseInt(juminNumber); //���ڿ��� ������ ��ȯ �õ� 
			System.out.println("����: " + number); //�ȿ� String�� ����ֱ� ������ ������ ���� ���� 
		} catch (NumberFormatException f) {
			System.out.println("���ڸ� �־��ּ���.");
			System.out.println("NumberFormatException �߻�!! :  " + f.getMessage());
		}
		
		
		
	}



}
