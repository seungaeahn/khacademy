package com.kh.practice;

import java.util.ArrayList;
import java.util.List;



public class CompairActorMain {

	public static void main(String[] args) {
		List<Actor> actors = new ArrayList<>();
		actors.add(new Actor("������", 51));
		actors.add(new Actor("���켺", 50));
		actors.add(new Actor("���μ�", 42));
	
		for(Actor actor : actors) {
		System.out.println(actor);
		}
	}
}
