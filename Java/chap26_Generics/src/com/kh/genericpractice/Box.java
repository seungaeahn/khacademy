package com.kh.genericpractice;
//Box ��ü�� com.kh.genericpractice; �ؿ� ����
		//������ �����͸� �����ϴ� Box �ν��Ͻ� ����
		//���ڿ� �����͸� �����ϴ� Box �ν��Ͻ� ����
		// ���� ���
		//���� for�� �̿��ؼ� �� ��� ��� 

import com.kh.genericsMain.Book;

public class Box<T> {
	T content;
	
	public void put(T item) {
		this.content = item;
	}
	
	public T get() {
		return content;
	}

}
