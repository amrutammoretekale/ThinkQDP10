package com.hashsetDemo;

import java.util.ArrayList;
import java.util.HashSet;

public class Logical {

	public static void main(String[] args) {
	ArrayList<Item>al=new ArrayList<>();
	al.add(new Item(1,"chips",90.0));
	al.add(new Item(2,"juice",190.0));
	al.add(new Item(3,"coldrinks",76.0));
	al.add(new Item(4,"dips",80.0));
	al.add(new Item(1,"chips",90.0));


	for(Item i:al) {
		System.out.println(i);
	}
	
	HashSet<Item>hs=new HashSet<>();
	hs.addAll(al);
	System.out.println("--------------");
	

	for(Item i:hs) {
		System.out.println(i);
	}
	}

}
