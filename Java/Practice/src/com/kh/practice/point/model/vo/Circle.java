package com.kh.practice.point.model.vo;

public class Circle {
    // 인스턴스 변수
    private int x;
    private int y;
    private int radius;

    // 기본 생성자
    public Circle() {
        // 기본 좌표 (0, 0)와 반지름 0으로 초기화
        this.x = 0;
        this.y = 0;
        this.radius = 0;
    }

    // 매개변수를 받는 생성자
    public Circle(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    // x 좌표의 게터와 세터
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    // y 좌표의 게터와 세터
    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    // 반지름의 게터와 세터
    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    // 객체의 문자열 표현을 반환하는 toString 메서드
    @Override
    public String toString() {
        return "Circle [x=" + x + ", y=" + y + ", radius=" + radius + "]";
    }
}
