package com.kh.example.practice2.run;

// import는 최초 1회만 작성 
import com.kh.example.practice2.model.vo.Product;

public class ProductRun {

	public static void main(String[] args) {
		// Product 생성 3개 하고
		// 각각 상품명, 가격, 브랜드명 출력하기 
		
		// 상품의 객체 생성
		Product product1 = new Product("아이폰7", 800000, "애플");
		Product product2 = new Product("갤럭시9", 700000, "갤럭시");
		Product product3 = new Product("맥북 프로", 1200000, "애플");
		
		// 상품 정보 출력
		product1.imformation();
		product2.imformation();
		product3.imformation();
		

	}

}
