package chap28_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorMain implements Comparator<String>{

	@Override
	public int compare(String num1, String num2) {
		//���̰� ������ 0 ��ȯ 
		if(num1.length() == num2.length()) {
			return 0;
		}
		//num1�� num2���� ��� ��� ��ȯ 
		else if (num1.length() > num2.length()) {
			return 1;
		}
		//num1�� num2���� ª���� ���� ��ȯ 
		else {
			return -1;
		}
	}
	public static void main(String[] args) {
		List<String> str = new ArrayList<>();
		str.add("apple");
		str.add("banana");
		str.add("aanana");
		str.add("cherry");
		str.add("add");
		str.add("z");
		str.add("abcdefg");
		
		//Comparator�� ����ؼ� ���ڿ��� ����  1.���� 2.����
		Collections.sort(str, new ComparatorMain());
		
		//���ĵ� ��� ���
		for (String s : str) {
			System.out.println(s);
		}

	}

}





