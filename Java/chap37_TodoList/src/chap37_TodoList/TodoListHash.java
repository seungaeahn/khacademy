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
				System.out.println("�߸��� �ε���.");
			}
		}
		
		//Iterator�� ����� ��ü todoList�� ����ϴ� �޼��� 
		public void  displayTasks() {
			Iterator<String> ir = tasks.keySet().iterator();
			while (ir.hasNext()) { //���� Ű�� ������
				String key = ir.next(); //key ���� �����ͼ�
				String task = tasks.get(key); //key�κ��� value ��������
				System.out.println(task);
			}
			System.out.println();
		}
		
		public static void main(String[] args) {
			TodoListHash todoList  = new TodoListHash();
			Scanner sc = new Scanner(System.in);
			while(true) {
				System.out.println("���� �߰�: add, ����: remove, Ȯ��: list,  ����: exit �Է��ϼ���.");
				String choice = sc.nextLine();
				
				if(choice.equalsIgnoreCase("add")) {
					System.out.println("�� ���� �Է��ϼ���.");
					String task = sc.nextLine();
					todoList.addTask(task);
				} else if (choice.equalsIgnoreCase("remove")) {
					System.out.println("���� �� �� ��ȣ �Է��ϱ�");
					try {
						int index = Integer.parseInt(sc.nextLine()) -1;
						todoList.removeTask(index);
					} catch (Exception e) {
						System.out.println("��ȿ���� ���� �Է��Դϴ�.");
					}
				} else if (choice.equalsIgnoreCase("list")) {
					todoList.displayTasks();
				} else if (choice.equalsIgnoreCase("exit")) {
					break;
				} else {
					System.out.println("�߸��� ���");
				}
			}
			System.out.println("����");
			sc.close();
		}
	
	
	
	

}
