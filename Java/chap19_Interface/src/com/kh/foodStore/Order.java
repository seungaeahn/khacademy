package com.kh.foodStore;

import java.util.ArrayList;
import java.util.List;

//주문 객체
public class Order implements FoodStore{
	private List<Menu> OrderMenus;
	
	public Order() {
		OrderMenus = new ArrayList<>();
	}
	
	@Override
	public void addMenu(String Menu) {
		Menu menuA = new Menu(Menu);
		OrderMenus.add(menuA);
	}
	@Override
	public void removeMenu(String Menu) {
		System.out.println(Menu);
	}
	@Override
	public void printMenu() {
		System.out.println("주문내역");
		for (Menu menuA : OrderMenus) {
		System.out.println(menuA.getItem());
		}
	}
}
