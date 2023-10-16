package com.kh.collection.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class PracticeCollection {
	
	public static void main(String[] args) {
		PracticeCollection pc = new PracticeCollection();
		pc.practice1();
		pc.practiceSet();
		pc.practiceMap();
	}
	public void practice1() {
		List<String> pList = new ArrayList<>();
		//String add �غ��� for�� ���
		pList.add("������");
		pList.add("�����");
		pList.add("�䳢");
		System.out.println("List: " + pList);
		//���� for�� Ȱ���ؼ� ���
		for(String animal : pList) {
			System.out.println(animal);
		}
		
	}
	public void practiceSet() {
		Set<String> pSet = new HashSet<>();
		//String add �غ��� for�� ��� �ߺ��� �� add �ؾ��� 
		pSet.add("�Ǵ�");
		pSet.add("����");
		pSet.add("�⸰");
		pSet.add("�Ǵ�");
		System.out.println("Set: " + pSet);
		for(String animal : pSet) {
			System.out.println(animal);
		}
		//Map ����
		Map<String, Integer> myMap = new HashMap<>();
//		Map<String, Integer>
		myMap.put("�ѱ�", 1);
		myMap.put("�̱�", 2);
		myMap.put("������", 45);
		myMap.put("������", 42); //�ߺ��� ���� �ʰ� ���� �������� �� ���� ��� 
		
		for(String country : myMap.keySet()) {
			int code = myMap.get(country);
			System.out.println(country + ": " + code);
		}
		
	}
	public void practiceMap() {
		//Ű�� ���� �̿��ؼ� map out �� ���� ���� for������ ����غ���
		Map<String, Integer> myMap = new HashMap<>();
		myMap.put("�Ƶ�����", 1);
		myMap.put("����ŷ", 2);
		myMap.put("�Ե�����", 3);
		myMap.put("������ġ", 4);
		
		for(String hamburger : myMap.keySet()) {
			int code = myMap.get(hamburger);
			System.out.println(hamburger + ": " + code);
		}
		
	}
	

	
}












