package com.kh.collection.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class PracticeCollection {
	
	public static void main(String[] args) {
		PracticeCollection pc = new PracticeCollection();
		pc.practice1();
		pc.practiceSet();
		pc.practiceMap();
	}
	public void practice1() {
		List<String> pList = new ArrayList<>();
		//String add 해보고 for문 출력
		pList.add("강아지");
		pList.add("고양이");
		pList.add("토끼");
		System.out.println("List: " + pList);
		//향상된 for문 활용해서 출력
		for(String animal : pList) {
			System.out.println(animal);
		}
		
	}
	public void practiceSet() {
		Set<String> pSet = new HashSet<>();
		//String add 해보고 for문 출력 중복된 값 add 해야함 
		pSet.add("판다");
		pSet.add("사자");
		pSet.add("기린");
		pSet.add("판다");
		System.out.println("Set: " + pSet);
		for(String animal : pSet) {
			System.out.println(animal);
		}
		//Map 예제
		Map<String, Integer> myMap = new HashMap<>();
//		Map<String, Integer>
		myMap.put("한국", 1);
		myMap.put("미국", 2);
		myMap.put("스페인", 45);
		myMap.put("스페인", 42); //중복이 되지 않고 가장 마지막에 들어간 값만 출력 
		
		for(String country : myMap.keySet()) {
			int code = myMap.get(country);
			System.out.println(country + ": " + code);
		}
		
	}
	public void practiceMap() {
		//키와 값을 이용해서 map out 한 다음 향상된 for문으로 출력해보기
		Map<String, Integer> myMap = new HashMap<>();
		myMap.put("맥도날드", 1);
		myMap.put("버거킹", 2);
		myMap.put("롯데리아", 3);
		myMap.put("맘스터치", 4);
		
		for(String hamburger : myMap.keySet()) {
			int code = myMap.get(hamburger);
			System.out.println(hamburger + ": " + code);
		}
		
	}
	

	
}












