package com.kh.whilesample;

public class While04 {

	public static void main(String[] args) {
		// 1부터 100까지의 합 구하기
		
		int num = 1;
		int sum = 0;
		 
		while (num <=5) { 
			System.out.println("num 은 : " + num);
			sum += num;
			num = num + 1;
			//System.out.println("sum 은 : " + sum); 
			// sum의 합계를 주기적으로 보고 싶으면 while문 안에 작성
		}
		System.out.println("sum 은 : " + sum); 
		//while이 종료되었다고 해서 클래스가 종료된 것은 아님
		// while문이 종료된 후 남아있는 System.out.println(sum)이 출력됨
			 
	}

}
