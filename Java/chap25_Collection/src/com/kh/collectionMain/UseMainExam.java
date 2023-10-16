package com.kh.collectionMain;

import java.util.HashMap;
import java.util.Map;

public class UseMainExam {

	public static void main(String[] args) {
		// HashMap 생성 UserAge
		Map<String, Integer> UserAge = new HashMap<>();
		
		//유저의 이름과 나이
		UserAge.put("Alice", 16);
		UserAge.put("Daniel", 17);
		UserAge.put("Rachel", 20);
		UserAge.put("Tim", 19);
		
		//특정 유저 검색
		String userName = "Rachel";
		
		if(UserAge.containsKey(userName)) {
			int age = UserAge.get(userName);
			System.out.println(userName + " 의 나이 : " + age);
		} else {
			System.out.println(userName + " 의 나이를 찾을 수 없습니다.");
		}
		
		//모든 학생과 나이 출력 
		for (Map.Entry<String, Integer> entry : UserAge.entrySet()) {
			String name = entry.getKey();
			int age = entry.getValue();
			System.out.println(name + " : " + age);
		}
		//유저 나이 수정 
		String UserUpdate = "Daniel";
		int newAge = 19;
		UserAge.put(UserUpdate, newAge);
		System.out.println(UserUpdate + "의 나이를 " + newAge + "로 수정했습니다.");

		//유저 탈퇴
		String removeUser = "Alice";
		UserAge.remove(removeUser);
		
		System.out.println(removeUser + "를 삭제했습니다");
		//최종 유저 이름 나이 출력 
		System.out.println("최종 유저 이름 나이 :");
		for(Map.Entry<String, Integer> entry : UserAge.entrySet()) {
			String name = entry.getKey();
			int age = entry.getValue();
			System.out.println(name + " : " + age);
		}	
	}

}
