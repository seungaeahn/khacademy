package com.kh.whilesample;

public class While04 {

	public static void main(String[] args) {
		// 1���� 100������ �� ���ϱ�
		
		int num = 1;
		int sum = 0;
		 
		while (num <=5) { 
			System.out.println("num �� : " + num);
			sum += num;
			num = num + 1;
			//System.out.println("sum �� : " + sum); 
			// sum�� �հ踦 �ֱ������� ���� ������ while�� �ȿ� �ۼ�
		}
		System.out.println("sum �� : " + sum); 
		//while�� ����Ǿ��ٰ� �ؼ� Ŭ������ ����� ���� �ƴ�
		// while���� ����� �� �����ִ� System.out.println(sum)�� ��µ�
			 
	}

}
