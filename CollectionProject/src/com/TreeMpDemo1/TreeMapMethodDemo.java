package com.TreeMpDemo1;

import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapMethodDemo {

	public static void main(String[] args) {

		TreeMap<Integer, String> tmap = new TreeMap<>();

		tmap.put(3, "java");
		tmap.put(1, "html");
		tmap.put(8, "C");
		tmap.put(4, "c++");
		tmap.put(6, "Python");
		tmap.put(4, "Angular");

		System.out.println(tmap);
		// Sorted Map
		System.out.println("First Key:" + tmap.firstKey());
		System.out.println("Last Key:" + tmap.lastKey());

		SortedMap<Integer, String> s1 = tmap.subMap(3, 6);// 3 included // 6 excluded
		System.out.println(s1);

		SortedMap<Integer, String> s2 = tmap.headMap(3);// entries before 3 and 3 is excluded

		System.out.println(s2);

		SortedMap<Integer, String> s3 = tmap.tailMap(3);// entries after 3 and 3 is included

		System.out.println(s3);
		
		System.out.println(".......................................................");

		// Navigable Map

		System.out.println("Lower Key:" + tmap.lowerKey(4)); // strictly less
		System.out.println("Floor key:" + tmap.floorKey(4)); // less or than equal to

		System.out.println("Higher Key:" + tmap.higherKey(4));// strictly higher
		System.out.println("Ceiling key:" + tmap.ceilingKey(4));// equal to or greater than

		SortedMap<Integer, String> s4 = tmap.subMap(3, false, 6, true);// 3 (from)included : true // 6(to) excluded:
																		// false
		System.out.println(s4);

		SortedMap<Integer, String> s5 = tmap.headMap(3, true);// by default:entries before 3 and 3 is excluded

		System.out.println(s5);

		SortedMap<Integer, String> s6 = tmap.tailMap(3, false);// by default: entries after 3 and 3 is included

		System.out.println(s6);
	}
}
