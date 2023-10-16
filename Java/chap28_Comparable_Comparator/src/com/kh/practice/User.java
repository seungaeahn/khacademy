package com.kh.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import chap28_Comparator.ComparatorMain;

public class User {

	public static void main(String[] args) {
		// List ArrayList »ý¼º Comparator Á¤¸®
		List<String> str = new ArrayList<>();
		str.add("±è¿µ¼ö");
		str.add("Á¦°¥±¤¼ö");
		str.add("¿µÃ¶");
		str.add("»óÃ¶");
		
		Collections.sort(str, new ComparatorMain());
		
		for(String s : str) {
			System.out.println(s);
		}
	}

}
