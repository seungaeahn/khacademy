package com.kh.whilesample;

public class While03 {

	public static void main(String[] args) {
		// 반복적으로 출력
		/*int i = 1;
		while (i <=5) { //i가 5보다 작거나 같을 때 true
			//숫자가 5가 될 때 출력을 멈추고자 함 
			System.out.println(i); //위 부등호가 참일 경우 출력
			i = i + 1;
			
		}
		*/
		int i = 1;
		while (i <=10) { 
			
			System.out.println(i); 
			i = ++i;
			/*
			 i++일때 i가 1인 값을 먼저 대입헸기 때문에 ++가 작동하지 않음
			 무한루프 발생
			 ++i일 때는 i에 +1을 먼저 대입
			 1~10까지 출력가능
			 무한루프가 발생하지 않음 
			 */
			
		}

	}

}
