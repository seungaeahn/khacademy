package com.kh.genericpractice;
//Box 객체를 com.kh.genericpractice; 밑에 생성
		//정수형 데이터를 저장하는 Box 인스턴스 생성
		//문자열 데이터를 저장하는 Box 인스턴스 생성
		// 각각 출력
		//향상된 for문 이용해서 값 모두 출력 

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
