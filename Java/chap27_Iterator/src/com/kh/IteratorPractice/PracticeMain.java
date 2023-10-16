package com.kh.IteratorPractice;

import java.util.ArrayList;
import java.util.Iterator;

public class PracticeMain {

	public static void main(String[] args) {
		ArrayList<String> lunch = new ArrayList<>();
		lunch.add("������");
		lunch.add("������");
		lunch.add("�쵿");
		lunch.add("�ʹ�");
		
		Iterator<String> iter = lunch.iterator();
		
		while(iter.hasNext()) {
			String lch = iter.next();
			System.out.println(lch);
		}
	}

}
