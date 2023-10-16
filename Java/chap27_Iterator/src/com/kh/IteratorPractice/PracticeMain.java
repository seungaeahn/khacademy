package com.kh.IteratorPractice;

import java.util.ArrayList;
import java.util.Iterator;

public class PracticeMain {

	public static void main(String[] args) {
		ArrayList<String> lunch = new ArrayList<>();
		lunch.add("∏∂∂Û≈¡");
		lunch.add("µ∑∞°Ω∫");
		lunch.add("øÏµø");
		lunch.add("√ π‰");
		
		Iterator<String> iter = lunch.iterator();
		
		while(iter.hasNext()) {
			String lch = iter.next();
			System.out.println(lch);
		}
	}

}
