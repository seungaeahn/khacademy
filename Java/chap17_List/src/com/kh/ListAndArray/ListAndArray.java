package com.kh.ListAndArray;

import java.util.ArrayList;
import java.util.List;

public class ListAndArray {

	public static void main(String[] args) {
		ListArray1();
		ListAndArray LA = new ListAndArray();
		LA.ListArray2();
		
	}
	
	public static void ListArray1() {
				//Array 출력
				int[] intArray = new int[2]; 
				intArray[0] = 1;
				intArray[1] = 2;
				System.out.println("Array 요소 : ");
				for(int a=0; a < intArray.length; a++) {
					System.out.print(intArray[a] + " ");
				}
				System.out.println(); //개행문자 포함되어 있어 enter같은 역할을 함 
				// List 예제 Integer = int
				List<Integer> intList = new ArrayList<>();
											//Integer 객체를 저장하는 ArrayList
				intList.add(1);
				intList.add(2);
				intList.add(3);
				
				//List 출력
				System.out.println("List 요소 : ");
				for (int num : intList)
					System.out.print(num + " ");
	}
	public void ListArray2() {
				String[] StringArray = {"빨", "주", "노"}; 
				System.out.println(); 
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
