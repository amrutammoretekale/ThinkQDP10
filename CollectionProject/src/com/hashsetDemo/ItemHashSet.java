package com.hashsetDemo;

import java.util.HashSet;

public class ItemHashSet {

	public static void main(String[] args) {
		HashSet<Item>hs=new HashSet<>();
		hs.add(new Item(1,"chips",90.0));
		hs.add(new Item(2,"juice",190.0));
		hs.add(new Item(3,"coldrinks",76.0));
		hs.add(new Item(4,"dips",80.0));
		hs.add(new Item(1,"chips",90.0));
		
		for(Item i:hs) {
			System.out.println(i);
		}
		

	}

}
