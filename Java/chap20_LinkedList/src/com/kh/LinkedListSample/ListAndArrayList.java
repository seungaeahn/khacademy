package com.kh.LinkedListSample;

import java.util.List;
import java.util.LinkedList;

public class ListAndArrayList {

	public static void main(String[] args) {
		// 생성
		List<String> linkedList = new LinkedList<>();
		
		//요소추가
		linkedList.add("첫 번째");
		linkedList.add("두 번째");
		linkedList.add("세 번째");
		
		System.out.println("linkedList : " + linkedList);
		
		linkedList.remove(2);
		System.out.println("삭제 후: " + linkedList);
		
		//요소 검색 
		boolean isTrue = linkedList.contains("두 번째");
		System.out.println("두 번째 요소 포함 여부 : " + isTrue);
		
		//요소 개수
		int size = linkedList.size();
		System.out.println("크기: "+ size);
		
	
		
		

	}

}
