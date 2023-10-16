package com.kh.finalSample;

import java.io.FileWriter;
import java.io.IOException;

public class FileOMain {

	public static void main(String[] args) {
		FileWriter fw = null;
		
		try {								//2번째 인자의 값이 boolean true로 지정되면 해당 파일에 이어쓰기
			fw = new FileWriter("file.txt", true);
			fw.write("1000");
			fw.write("10000");
			fw.close();
			System.out.println("파일이 생성되었습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		

	}

}
