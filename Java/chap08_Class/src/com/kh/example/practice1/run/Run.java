package com.kh.example.practice1.run;

import com.kh.example.practice1.model.vo.Member;

public class Run {

	public static void main(String[] args) {
		// 1. Member ��ü�� ���� 
		Member member = new Member();
		
		// 2. chageName() �� ���� 
		member.chageName("������");
		
		// 3. printName()�� �̿��� ��� 
		member.printName();
	}

}
