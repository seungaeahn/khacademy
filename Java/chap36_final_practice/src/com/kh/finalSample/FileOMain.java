package com.kh.finalSample;

import java.io.FileWriter;
import java.io.IOException;

public class FileOMain {

	public static void main(String[] args) {
		FileWriter fw = null;
		
		try {								//2��° ������ ���� boolean true�� �����Ǹ� �ش� ���Ͽ� �̾��
			fw = new FileWriter("file.txt", true);
			fw.write("1000");
			fw.write("10000");
			fw.close();
			System.out.println("������ �����Ǿ����ϴ�.");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		

	}

}
