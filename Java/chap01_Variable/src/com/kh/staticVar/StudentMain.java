package com.kh.staticVar;

public class StudentMain {

	public static void main(String[] args) {
		StaticVar stKim = new StaticVar();
		stKim.setStudentName("Kh학생1");
		//System.out.println(stKim.serialNum);
		// 학교에서 학생 회원가입
		// 일단 우리학교 학생이 맞는지 확인
		// 우리학교 학생 인증키;
		// 시리얼 넘버를 수정해서 -> 20
		// kh학생1 20
		// kh학생2 20
		stKim.serialNum++;
		
		StaticVar khLee = new StaticVar();
		khLee.setStudentName("KH 2학생");
		System.out.println("KH stKim : ");
		System.out.println(stKim.serialNum);
		System.out.println("KH 2학생 : ");
		System.out.println(khLee.serialNum);
		
	}

}
