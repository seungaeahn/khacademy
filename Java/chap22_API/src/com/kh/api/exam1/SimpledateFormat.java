package com.kh.api.exam1;

import java.util.Date;
import java.text.SimpledateFormat;

public class SimpledateFormat {
	/*
	 * SimpleDateFormat
	 	날짜와 시간을 원하는 형식으로 포멧팅하거나
	 	문자열로 부터 날짜와 시간을 파싱하는데 사용되는 클래스 
	 */
	public static void main(String[] args) {
		Date currentDate = new Date();
		SimpledateFormat sdf = new SimpledateFormat("yyyy-MM-dd HH:mm:ss");
		
		
		String forDate = sdf.format(currentDate);
	}
	
}
