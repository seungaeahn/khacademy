package com.kh.practice7.classroom;

public class ClassRoomMain {

	public static void main(String[] args) {
		/*
		 * �޼ҵ� �� : public void practice8(){}
			1���� �迭�� 12���� �л����� �⼮�� ������ �ʱ�ȭ �ϰ�
			2�� 3������ 2���� �迭 2���� �̿��Ͽ� �д��� ����
			1�д� ���ʺ��� ������, 1�࿡�� �Ʒ� �� ������ �ڸ��� ��ġ�ϼ���.
			<�⼮��>
			1. ���ǰ� 2. ������ 3. ����� 4. ����� 5. ���̹� 6. �ں���
			7. �ۼ��� 8. ������ 9. ������ 10. ��õ�� 11. ��ǳǥ 12. ȫ����
			ex.
			== 1�д� ==
			���ǰ� ������ 
			����� ����� 
			���̹� �ں��� 
			== 2�д� ==
			�ۼ��� ������ 
			������ ��õ�� 
			��ǳǥ ȫ����

		 */
		//1. �л� �̸��� �����ϴ� ���ڿ� �迭 �����ϰ� �ʱ�ȭ
		String[] students = {"���ǰ�","������","�����","�����","���̹�","�ں���", "�ۼ���","������","������","��õ��","��ǳǥ","ȫ����"};
		//2. �� �д��� ��� ���� ������ ���� rows �ళ�� col ������
		int rows = 3;
		int cols = 2;
		//3. �� ���� 2���� ���ڿ� �迭 classRoom1 classRoom2 ���� �� �ʱ�ȭ
		//�� �д��� �ڸ���ġ�� ��Ÿ�� 
		String[][] classRoom1 = new String[rows][cols];
		String[][] classRoom2 = new String[rows][cols];
		//4. �л� �迭�� �ݺ� ó���ϱ� ���� �ݺ��� 
		// i ������ �л� �ε��� 
		for (int i = 0; i<students.length; i++) {
			int row = i % rows; //row ������ �� �ε���
			int col = i / rows; //col ������ �� �ε��� 
			
			if(col % 2 == 0) { //���� ���� ¦�� ������ Ȯ�� 
								//¦�� ���� ù ��° �дܿ� �ش�
				classRoom1[row][col/2] = students[i]; //col/2 �� �ε����� ������ ���� �� ��ġ
			} else { //���� ���� Ȧ�� ���� ��� �ι�° �дܿ� �ش�
				classRoom2[row][col/2] = students[i];
			}
		}
		//���
		//classRoom1
		System.out.println("== 1�д� ==");
		//classRoom2 
		System.out.println("== 2�д� ==");
		
	}
	//classRoom ��� �޼ҵ� �д� �ڸ� ��ġ�� ����ϴ� ����
	public static void printClassRoom(String[][] classRoom) {
		//���� ���� ��Ÿ���� �ݺ��� �д��� �� �� ��ŭ �ݺ� 
		for(int row = 0; row < classRoom.length; row++) {
			//���� ���� ��Ÿ���� �ݺ��� �д��� �� �� ��ŭ �ݺ� 
			for(int col = 0; row < classRoom.length; col++) {
				System.out.println(classRoom[row][col] + " ");
			}
			
		}
		System.out.println();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
