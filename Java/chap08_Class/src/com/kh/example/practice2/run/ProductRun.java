package com.kh.example.practice2.run;

// import�� ���� 1ȸ�� �ۼ� 
import com.kh.example.practice2.model.vo.Product;

public class ProductRun {

	public static void main(String[] args) {
		// Product ���� 3�� �ϰ�
		// ���� ��ǰ��, ����, �귣��� ����ϱ� 
		
		// ��ǰ�� ��ü ����
		Product product1 = new Product("������7", 800000, "����");
		Product product2 = new Product("������9", 700000, "������");
		Product product3 = new Product("�ƺ� ����", 1200000, "����");
		
		// ��ǰ ���� ���
		product1.imformation();
		product2.imformation();
		product3.imformation();
		

	}

}
