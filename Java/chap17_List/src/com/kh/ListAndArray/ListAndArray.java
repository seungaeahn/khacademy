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
				//Array ���
				int[] intArray = new int[2]; 
				intArray[0] = 1;
				intArray[1] = 2;
				System.out.println("Array ��� : ");
				for(int a=0; a < intArray.length; a++) {
					System.out.print(intArray[a] + " ");
				}
				System.out.println(); //���๮�� ���ԵǾ� �־� enter���� ������ �� 
				// List ���� Integer = int
				List<Integer> intList = new ArrayList<>();
											//Integer ��ü�� �����ϴ� ArrayList
				intList.add(1);
				intList.add(2);
				intList.add(3);
				
				//List ���
				System.out.println("List ��� : ");
				for (int num : intList)
					System.out.print(num + " ");
	}
	public void ListArray2() {
				String[] StringArray = {"��", "��", "��"}; 
				System.out.println(); 
				//Array ���
				System.out.println("Array ��� : ");
				for(int a = 0; a < StringArray.length; a++) {
					System.out.print(StringArray[a] + " ");
				}
				System.out.println();
				
				// List 
				List<String> StringList = new ArrayList<>();
				
				StringList.add("��");
				StringList.add("��");
				StringList.add("��");
				StringList.add("��");
				
				//List ���
				System.out.println("List ��� : ");
					for (String text : StringList)
						System.out.print( text + " ");
	}
	
}
