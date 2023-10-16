package com.kh.stackMain;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PracticeMain {
	public static void main(String[] args) {
		PracticeMain pm = new PracticeMain();
		pm.PracticeStack();
		pm.PracticeQueue();
		
		
	}
	public void PracticeStack() {
		//���ÿ� ���� �����ϰ� �����ϰ� �ʱ�ȭ �� �޼��� ����غ���
				Stack<String> stack = new Stack<>();
				stack.push("�౸");
				stack.push("�߱�");
				stack.push("��");
				stack.push("�豸");
				
				System.out.println(stack.pop());
				
				System.out.println(stack.peek());
				
				stack.clear();
				System.out.println(stack.empty());
	}
	
	public void PracticeQueue() {
		Queue<String> queue = new LinkedList<>();
		
		queue.offer("��");
		queue.offer("��");
		queue.offer("��");
		queue.offer("��");
		queue.offer("��");
		
		String removedElement = queue.poll();
		System.out.println(removedElement);
		removedElement = queue.poll(); 
		
		String frontElement = queue.peek();
		
		int size = queue.size();
		System.out.println("size : " + size);
	}




}

