package com.kh.superSample;
//��ӹ޾Ƽ� super() super. ������ Ȯ��
/*
super = �θ� Ŭ������ ������ �޼��忡 �����ϱ� ���� ��� 
super() = �θ� Ŭ������ �����ڸ� ȣ���ϱ� ���� ���
			���� Ŭ������ �����ڿ��� ù��° �ٿ� ȣ�� �Ǿ�� ��!
*/
public class SuperMain {

	public static void main(String[] args) {
		Child child1 = new Child();
		
		Child child2 = new Child("ȫ�浿");
		child2.display();
		// super.display(); ���� �� ��� �Ǵ���
		// super.display(); �긦 ����ϰ� ������ ��� �ؾ��ϴ��� 

	}

}
