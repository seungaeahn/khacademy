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
		//스택에 값을 저장하고 삭제하고 초기화 등 메서드 사용해보기
				Stack<String> stack = new Stack<>();
				stack.push("축구");
				stack.push("야구");
				stack.push("농구");
				stack.push("배구");
				
				System.out.println(stack.pop());
				
				System.out.println(stack.peek());
				
				stack.clear();
				System.out.println(stack.empty());
	}
	
	public void PracticeQueue() {
		Queue<String> queue = new LinkedList<>();
		
		queue.offer("빨");
		queue.offer("주");
		queue.offer("노");
		queue.offer("초");
		queue.offer("파");
		
		String removedElement = queue.poll();
		System.out.println(removedElement);
		removedElement = queue.poll(); 
		
		String frontElement = queue.peek();
		
		int size = queue.size();
		System.out.println("size : " + size);
	}




}

