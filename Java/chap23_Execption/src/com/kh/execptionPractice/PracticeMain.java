package com.kh.execptionPractice;

public class PracticeMain {

	public static void main(String[] args) {
		PracticeMain pm = new PracticeMain();
		pm.ArithException();
		pm.NPException();
		pm.NumFormatException(); 
		pm.ExceptionExam(); 
		
	}
	public void ArithException() {
		// int dividend / divisor�� �������� �� ����ó�� 
		try {
			int dividend = 100;
			int divisor = 0;
			int result = dividend / divisor;
		} catch (ArithmeticException e) {
			System.out.println("����!! " + e.getMessage());
		}
		
		
	}
	public void NPException() {
		try {
			String text = "Hello World";
			String subText = null;
			int length = text.indexOf(subText);
			//indexOf subText�� �ִ� null ���� ������ ���ڿ� �˻� 
		} catch(NullPointerException n) {
			System.out.println("����!! " + n.getMessage());
		}
		
	}
	public void NumFormatException() {
		try {
			String text = "123.45";
			int number = Integer.parseInt(text); 
			System.out.println("����: " + number);
			//�������� ������ ���ڿ��� ������ ��ȯ�ϰڴ� 
		} catch (NumberFormatException f) {
			System.out.println("����!! " + f.getMessage());
		}
		
	}
	public void ExceptionExam() {
		try {
			int[] numbers = {1,2,3,4,5};
			int index = 7; //�ε��� �ѹ�
			int result = numbers[index]; //�迭 ��ҿ� ����
			System.out.println("Result: " + result);
		} catch(ArrayIndexOutOfBoundsException e) {
			//�迭 �ε����� ������ ����� �� �߻��ϴ� ���� ó�� 
			System.out.println("�迭 �ε��� ������ ��� ���ܰ� �߻�!!");
		} catch(Exception e) {
			//�ٸ� ���ܸ� ó���� �� �ִ� ���� ó�� 
			System.out.println("�迭 �ε��� ������ ��� ���ܰ� �ƴ� �Ϲ����� �ٸ� ���� �߻�");
		} finally {
			//�׻� ����Ǵ� ��� 
			System.out.println("Finally ����!");
		}
		System.out.println("���α׷��� ����Ǿ����ϴ�.");
		
	}

}
