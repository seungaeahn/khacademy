package com.kh.api.exam1;

public class PracticeMain2 {

	public static void main(String[] args) {
		PracticeMain2 pm2 = new PracticeMain2();
		pm2.practice1();
		pm2.practice2();
		pm2.practice3();
		pm2.practice4();
		pm2.practice5();

	}
	public void practice1() {
		//¹®ÀÚ¿­ µ¡ºÙÀÌ±â Ãâ·Â append
		StringBuffer sb = new StringBuffer();
		sb.append("¿À´Ã "); 
		sb.append("Àú³áÀº ¹¹¸ÔÁö");
		System.out.println(sb.toString());
	}
	public void practice2() {
		//¹®ÀÚ¿­ µÚÁı±â reverse
		StringBuffer sb = new StringBuffer();
		String str = "¿À´Ã Àú³áÀº ¹¹¸ÔÁö";
		sb.append(str);
		sb.reverse();
		System.out.println(sb.toString());
	}
	public void practice3() {
		//¹®ÀÚ¿­ »ğÀÔ insert ?¤¾¤¾
		StringBuffer sb = new StringBuffer();
		String str = "¿À´Ã Àú³áÀº ¹¹¸ÔÁö";
		sb.append(str);
		sb.insert(10, "?¤¾¤¾");
		System.out.println(sb.toString());
	}
	public void practice4() {
		//¹®ÀÚ¿­ ´ëÃ¼ replace(,,);
		StringBuffer sb = new StringBuffer();
	    String str = "¿À´Ã Àú³áÀº ¹¹¸ÔÁö";
	    sb.append(str);
	    sb.replace(3, 5, "Á¡½É");
	    System.out.println(sb.toString());
	}
	public void practice5() {
		//¹®ÀÚ¿­ »èÁ¦ delete(,,);
		StringBuffer sb = new StringBuffer();
	    String str = "¿À´Ã Àú³áÀº ¹¹¸ÔÁö";
	    sb.append(str);
	    sb.delete(2, 5);
	    System.out.println(sb.toString());
	}
	
	
}









