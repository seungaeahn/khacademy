package com.kh.genericsMain;

//���ʸ� Ŭ���� ����
//T type�� ���� t ��� �ְ� ���� ���� ��밡�� 
public class Book<T> {
	T content;
	
	public void put(T item) {
		this.content = item;
	}
	
	public T get() {
		return content;
	}
}
