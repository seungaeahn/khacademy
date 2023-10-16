package com.kh.practice;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class PracticeMain {

	public static void main(String[] args) {
		PracticeMain pm = new PracticeMain();
		//pm.practice1();
		pm.practice2();

	}
	public void practice1() { //경로 설정해서 파일 만들기
		try {
			//어디서 보던지 경로가 확실한 경로 절대경로 
			FileWriter w = new FileWriter("C://Users//user1//Java_Workspace//chap24_입출력(IO)//src//com//kh//practice//FileName.txt");
			//파일 쓰기
			w.write("잘 작성되었는지 확인");
			//파일 닫기
			w.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	public void practice2() {
		//폴더를 만들고 폴더 안에 파일을 만들기 
		//파일 안에 내용 작성하기 
		String folderPath ="C://Users//user1//Desktop//seungae";
		File folder = new File(folderPath);
		if(!folder.exists()) {
			folder.mkdir();
			System.out.println("폴더 생성 성공!");
		
		} else {
			System.out.println("폴더가 이미 있음!");
		}
		folder.mkdir();
		try {
			FileWriter w = new FileWriter("C://Users//user1//Desktop//seungae//seungaeInfo.txt");
			w.write("seungae의 정보를 담는 곳입니다.");
			w.write("Kh학생, 2000.04.17, 여, 수원시 거주");
			w.close();
			
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
