package com.kh.example.practice1.run;

import com.kh.example.practice1.model.vo.Member;

public class Run {

	public static void main(String[] args) {
		// 1. Member 객체를 생성 
		Member member = new Member();
		
		// 2. chageName() 값 변경 
		member.chageName("뉴네임");
		
		// 3. printName()을 이용해 출력 
		member.printName();
	}

}
