package com.kh.ListAndArray;

import java.util.ArrayList;
import java.util.List;

public class ListAndArray_String {

	public static void main(String[] args) {
		// String으로 변경 후 Array와 List 출력해보기 
		String[] StringArray = {"빨", "주", "노"}; 
		
		
		//Array 출력
		System.out.println("Array 요소 : ");
		for(int a = 0; a < StringArray.length; a++) {
			System.out.print(StringArray[a] + " ");
		}
		System.out.println();
		
		// List 
		List<String> StringList = new ArrayList<>();
		
		StringList.add("빨");
		StringList.add("주");
		StringList.add("노");
		StringList.add("파");
		
		//List 출력
		System.out.println("List 요소 : ");
			for (String text : StringList)
				System.out.print( text + " ");
		

	}

}
