package com.kh.fileIO;

import java.io.File;

public class File_Rename_Main {

	public static void main(String[] args) {
		String originFile = "C:\\Users\\user1\\Desktop\\RealCute.jpg";
		String newFile = "C:\\Users\\user1\\Desktop\\Cute222.jpg";
		
		File currentFile = new File(originFile);
		File renameFile = new File(newFile);
		//���� �̸� �����ϱ�
		//���࿡ ������ �ִٸ�!
		if(currentFile.renameTo(renameFile)) {
			System.out.println("���� �̸� ���� ����!");
		} else {
			System.out.println("�����̸� ���� ����!");
		}
	}

}
