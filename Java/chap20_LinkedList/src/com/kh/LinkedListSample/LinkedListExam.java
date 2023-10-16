package com.kh.LinkedListSample;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExam {

	public static void main(String[] args) {
		List<String> linkedList = new LinkedList<>();
		 // 값 추가
        linkedList.add("첫 번째 값");
        linkedList.add("두 번째 값");
        linkedList.add("세 번째 값");
        System.out.println("LinkedList에 저장된 값:");
        for (String value : linkedList) {
            System.out.println(value);
        }
        linkedList.remove(2);
		System.out.println("삭제 후: " + linkedList);
		
		//요소 검색 
		boolean isTrue = linkedList.contains("두 번째");
		System.out.println("두 번째 요소 포함 여부 : " + isTrue);
		
		//요소 개수
		int size = linkedList.size();
		System.out.println("크기: "+ size);
		// List 인터페이스와 LinkedList 객체 활용해서 값넣고 출력 
		
		// String
		
		// LinkedList 객체 new LinkedList 객체
		// int 값 넣고 수정 삭제 출력 

	}

}
