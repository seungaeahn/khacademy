package chap37_TodoList;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class TodoListHash {
	private HashMap<String, String> tasks;
	
	
		public TodoListHash() {
			tasks = new HashMap<String, String>();
		}
		public void addTask(String task) {
			tasks.put(task, task);
		}
		public void removeTask(int index) {
			if(index >= 0 && index < tasks.size()) {
				tasks.remove(index);
			} else {
				System.out.println("잘못된 인덱스.");
			}
		}
		
		//Iterator를 사용해 전체 todoList를 출력하는 메서드 
		public void  displayTasks() {
			Iterator<String> ir = tasks.keySet().iterator();
			while (ir.hasNext()) { //다음 키가 있으면
				String key = ir.next(); //key 값을 가져와서
				String task = tasks.get(key); //key로부터 value 가져오기
				System.out.println(task);
			}
			System.out.println();
		}
		
		public static void main(String[] args) {
			TodoListHash todoList  = new TodoListHash();
			Scanner sc = new Scanner(System.in);
			while(true) {
				System.out.println("할일 추가: add, 삭제: remove, 확인: list,  종료: exit 입력하세요.");
				String choice = sc.nextLine();
				
				if(choice.equalsIgnoreCase("add")) {
					System.out.println("할 일을 입력하세요.");
					String task = sc.nextLine();
					todoList.addTask(task);
				} else if (choice.equalsIgnoreCase("remove")) {
					System.out.println("삭제 할 일 번호 입력하기");
					try {
						int index = Integer.parseInt(sc.nextLine()) -1;
						todoList.removeTask(index);
					} catch (Exception e) {
						System.out.println("유효하지 않은 입력입니다.");
					}
				} else if (choice.equalsIgnoreCase("list")) {
					todoList.displayTasks();
				} else if (choice.equalsIgnoreCase("exit")) {
					break;
				} else {
					System.out.println("잘못된 명령");
				}
			}
			System.out.println("종료");
			sc.close();
		}
	
	
	
	

}
