package com.hashsetDemo;

import java.util.Comparator;
import java.util.TreeSet;

class ItemComparator implements Comparator{

//	public int compare(Item o1, Item o2) {
//		if (o1.getCost()==o2.getCost());
//		
//		return o1.getName().compareTo(o2.getName());
//	
//		else 
//			return (int) (o2.getCost()-o1.getCost());
//		
//	}

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
public class TreeSetItem {

	public static void main(String[] args) {
		TreeSet<Item> ts=new TreeSet<>(new ItemComparator());
		ts.add(new Item(1,"chips",90.0));
		ts.add(new Item(2,"juice",190.0));
		ts.add(new Item(3,"coldrinks",76.0));
		ts.add(new Item(4,"dips",80.0));
		ts.add(new Item(1,"chips",90.0));
		
		for(Item i:ts) {
			System.out.println(i);
		}

	}

}
