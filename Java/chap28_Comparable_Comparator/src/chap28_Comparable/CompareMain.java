package chap28_Comparable;

import java.util.ArrayList;
import java.util.List;

public class CompareMain {

	public static void main(String[] args) {
		List<Person> people = new ArrayList<>();
		people.add(new Person("�л�1", 78));
		people.add(new Person("�л�2", 79));
		people.add(new Person("�л�3", 71));
		
		//���̸� �������� ����
//		Collections.short(people);
		
		for(Person person : people) {
			System.out.println(people);
		}
	}

}
