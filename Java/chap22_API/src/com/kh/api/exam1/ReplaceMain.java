package com.kh.api.exam1;

public class ReplaceMain {

	public static void main(String[] args) {
		ReplaceMain rm = new ReplaceMain();
		rm.replace1();
		rm.replace2();
		rm.replace3();
		rm.replace4();
		rm.replace5();
		rm.replace6();

	}
	public void replace1() {
		String input = "Hello, world!";
		String reInput = input.replace(" ", "-");
		System.out.println(reInput);
		String Input2 = reInput.replace("-", "");
		System.out.println("input2: " + Input2);
	}
	public void replace2() {
		//world를 java로 교체
		String input = "Hello, world!";
		String reInput = input.replace("world", "java");
		System.out.println(reInput);
	}
	public void replace3() {
		String originName = "Hello world";
		// o로 적혀있는 문자열들 x로 변경하기 
		String reoriginName = originName.replace("o", "x");
		System.out.println(reoriginName);
	}
	public void replace4() {
		String originString = "The quick brown fox jumps over the lazy dog.";
		// fox -> cat
		String reoriginString = originString.replace("fox", "cat");
		System.out.println(reoriginString);
	}
	public void replace5() {
		String originString = "The quick brown fox jumps over the lazy dog.";
		// 모든 공백 제거하기 
		String reoriginString = originString.replace(" ", "");
		System.out.println(reoriginString);
	}
	public void replace6() {
		String originString = "Hello World";
		// replace 대신 replaceAll을 이용해서 대소문자 구분없이 문자열 치환하기
		String reAllstr = originString.replaceAll("(?i)WORLD", "Korea");
		System.out.println(reAllstr);
	}
	
}
















