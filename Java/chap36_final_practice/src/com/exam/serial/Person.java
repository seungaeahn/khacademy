package com.exam.serial;

import java.io.Serializable;

/*
 Serializable
 	�������̽�
 	Ŭ������ ��ü�� ����ȭ �Ǵ� ������ȭ�� ����
 	����ȭ : ��ü�� ����Ʈ ��Ʈ������ ��ȯ�ϴ� ���μ���
 	������ȭ : ����Ʈ ��Ʈ������ ��ü�� ��ȯ�ϴ� ���μ��� 
 	��ü�� ���Ͽ� �����ϰų� ��ũ��ũ�� ���� �����ϴ� ���� �۾��� ������ �� ����
 	��ü�� ���¸� �����ϰ� �����ϱ� ���� ����
 	
 */
public class Person implements Serializable{
		private String name;
		private int age;
		
		public Person(String name, int age) {
			this.name = name;
			this.age = age;
		}
		@Override
		public String toString() {
			return name + age;
		}

	

}
