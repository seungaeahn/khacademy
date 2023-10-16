package com.kh.practice.point.model.vo;

public class Circle {
    // �ν��Ͻ� ����
    private int x;
    private int y;
    private int radius;

    // �⺻ ������
    public Circle() {
        // �⺻ ��ǥ (0, 0)�� ������ 0���� �ʱ�ȭ
        this.x = 0;
        this.y = 0;
        this.radius = 0;
    }

    // �Ű������� �޴� ������
    public Circle(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    // x ��ǥ�� ���Ϳ� ����
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    // y ��ǥ�� ���Ϳ� ����
    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    // �������� ���Ϳ� ����
    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    // ��ü�� ���ڿ� ǥ���� ��ȯ�ϴ� toString �޼���
    @Override
    public String toString() {
        return "Circle [x=" + x + ", y=" + y + ", radius=" + radius + "]";
    }
}
