package com.kh.practice;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Practice_mkdirs {

	public static void main(String[] args) {

		Practice_mkdirs pm = new Practice_mkdirs();
		pm.Practice1();
		pm.Practice2();
		pm.Practice3();
	}	
	
	public void Practice1() {
		//폴더 연속으로 2개 만들기  C://Users//user1//Desktop//이름1//이름2
		String folderPath ="C://Users//user1//Desktop//이름1";
		File folder = new File(folderPath);
		if(!folder.exists()) {
			folder.mkdir();
			System.out.println("폴더가 성공적으로 생성되었습니다.");
		
		} else {
			System.out.println("폴더가 이미 존재합니다.");
		}
		folder.mkdir();
		try {
			FileWriter w = new FileWriter("C://Users//user1//Desktop//이름1//이름2");
			w.write("User의 이름를 담는 곳입니다.");
			w.write("홍길동");
			w.close();
			
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	public void Practice2() {
		//폴더 연속으로 3개 만들기  C://Users//user1//Java_Workspace//chap25_
		String folderPath ="C://Users//user1//Java_Workspace//chap25_//java//new,p";
		File folder = new File(folderPath);
		if(!folder.exists()) {
			folder.mkdir();
			System.out.println("폴더가 성공적으로 생성되었습니다.");
		
		} else {
			System.out.println("폴더가 이미 존재합니다.");
		}
		folder.mkdir();
//		try {
//			FileWriter w = new FileWriter("C://Users//user1//Java_Workspace//chap25_//java");
//			w.write("챕터25의 필기를 담는 곳입니다.");
//			w.write("설명 작성란");
//			w.close();
//			
//		} catch(IOException e) {
//			e.printStackTrace();
		}
	}
	public void Practice3() {
		//폴더 연속으로 5개 만들기 C://Users//user1//Desktop//myPlace//Music//Korean//kPop//Group
		String folderPath =" C:\\Users\\user1\\Desktop\\myPlace\\Music\\Korean\\kPop";
		File folder = new File(folderPath);
		if(!folder.exists()) {
			folder.mkdir();
			System.out.println("폴더가 성공적으로 생성되었습니다.");
		
		} else {
			System.out.println("폴더가 이미 존재합니다.");
		}
		folder.mkdir();
		try {
			FileWriter w = new FileWriter("C:\\Users\\user1\\Desktop\\myPlace\\Music\\Korean\\kPop\\Group.txt");
			w.write("한국의 케이팝 그룹");
			w.write("블랙핑크 BTS");
			w.close();
			
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
			
}
