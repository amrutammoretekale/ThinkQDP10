package com.linkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListIterate {

	public static void main(String[] args) {

		LinkedList<String> fruits = new LinkedList<>();
		fruits.add("Grapes");
		fruits.add("Apple");
		fruits.add("Guava");
		fruits.add("Banana");

		// print
		// normal for loop
		// enhanced for loop
		// iterator
		// list iterator : forward
		// list iterator: backward

		Iterator<String> itr = fruits.descendingIterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("-------------------------------");

		for (int i = 0; i < fruits.size(); i++) {
			System.out.println(fruits.get(i));
		}
		System.out.println("------------------------");

		Iterator<String> itr1 = fruits.iterator();
		while (itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		// 4th way
		System.out.println("------------------------");
		ListIterator<String> litr = fruits.listIterator();
		while (litr.hasNext()) {
			System.out.println(litr.next());
		}

		// 5th way
		System.out.println("-----------------------------------");
		ListIterator<String> lit = fruits.listIterator(fruits.size());
		while (lit.hasPrevious()) {
			System.out.println(lit.previous());
		}
	}
}
