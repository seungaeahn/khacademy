package com.kh.ListAndArray;

import java.util.ArrayList;
import java.util.List;

public class ListAndArray_String {

	public static void main(String[] args) {
		// String���� ���� �� Array�� List ����غ��� 
		String[] StringArray = {"��", "��", "��"}; 
		
		
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
