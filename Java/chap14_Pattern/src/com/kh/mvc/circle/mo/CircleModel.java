package com.kh.mvc.circle.mo;

public class CircleModel {
	private double PI = 3.14;
	private double radius;
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double circleSize() {
		double a = radius * radius * PI;
		return a ;
	}
}
