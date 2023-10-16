package com.kh.practice.point.model.vo;

public class Point {
    // 인스턴스 변수
    private int x;
    private int y;

    // 기본 생성자
    public Point() {
    	// 기본 좌표 (0, 0)으로 초기화
        this.x = 0;
        this.y = 0;
    }

    // 매개변수를 받는 생성자
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

   
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

  
    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    
    public String toString() {
       
    }
}