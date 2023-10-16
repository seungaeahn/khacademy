package com.kh.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import chap28_Comparator.ComparatorMain;

public class User {

	public static void main(String[] args) {
		// List ArrayList ���� Comparator ����
		List<String> str = new ArrayList<>();
		str.add("�迵��");
		str.add("��������");
		str.add("��ö");
		str.add("��ö");
		
		Collections.sort(str, new ComparatorMain());
		
		for(String s : str) {
			System.out.println(s);
		}
	}

}
