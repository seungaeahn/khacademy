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
		//world�� java�� ��ü
		String input = "Hello, world!";
		String reInput = input.replace("world", "java");
		System.out.println(reInput);
	}
	public void replace3() {
		String originName = "Hello world";
		// o�� �����ִ� ���ڿ��� x�� �����ϱ� 
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
		// ��� ���� �����ϱ� 
		String reoriginString = originString.replace(" ", "");
		System.out.println(reoriginString);
	}
	public void replace6() {
		String originString = "Hello World";
		// replace ��� replaceAll�� �̿��ؼ� ��ҹ��� ���о��� ���ڿ� ġȯ�ϱ�
		String reAllstr = originString.replaceAll("(?i)WORLD", "Korea");
		System.out.println(reAllstr);
	}
	
}
















