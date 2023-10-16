package com.kh.fileIO;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

import javax.imageio.ImageIO;

public class PracticeResize {

	public static void main(String[] args) {
		// 이미지 하나 불러오기
		String path = "C:\\Users\\user1\\Desktop\\";
		String inputImg = path + "onion.jpg";
		String outputImg = path + "onionNew.jpg";
		// 바탕화면에 새로운 폴더 만들기 mkdir
		String folderPath ="C://Users//user1//Desktop//Vegi";
		File folder = new File(folderPath);
		if(!folder.exists()) {
			folder.mkdir();
			System.out.println("폴더가 성공적으로 생성되었습니다.");
		
		} else {
			System.out.println("폴더가 이미 존재합니다.");
		}
		folder.mkdir();
		//새로 리사이즈한 이미지 바탕화면에 새로 만든 폴더에 저장하기 
		int width = 300; //가로 길이
		int height = 300; //세로 길이
		try {
			//원본 이미지를 불러오기
			BufferedImage bufImg = ImageIO.read(new File(inputImg));
			//새로운 크기로 이미지 리사이즈
			Image resizeImg = bufImg.getScaledInstance(width, height, Image.SCALE_SMOOTH);
			//BufferedImage 변환 
			BufferedImage bufResizeImg = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
			bufImg.getGraphics().drawImage(resizeImg, 0, 0, null);
			//리사이즈된 이미지를 파일로 저장하기
			ImageIO.write(bufResizeImg, "jpg", new File(outputImg));
			
			System.out.println("이미지 리사이즈 완료!");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("이미지 리사이즈 중 오류발생! : " + e.getMessage());
			
		}
		
		String inputFile = "C:\\Users\\user1\\Desktop\\onionNew.jpg";
		String outputFile = "C:\\Users\\user1\\Desktop\\Vegi\\onionNew.png";

		try (FileInputStream fis = new FileInputStream(inputFile);
				FileOutputStream fos = new FileOutputStream(outputFile)) {
				byte[] buffer = new byte[1024];
				int byteRead;
				
				while((byteRead = fis.read(buffer)) != -1) {
					fos.write(buffer, 0, byteRead);
				}
				System.out.println("파일이 복사되었습니다!");
			} catch (IOException e) {
				e.printStackTrace();
			}
	}
	
	

}
