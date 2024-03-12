package com.hashmapDemo;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<String,Double>smap=new HashMap<>();
		System.out.println(smap.put("Supriya", 89.0));
		System.out.println(smap);
		System.out.println(smap.put("Supriya", 91.1));
		System.out.println(smap);
		smap.put("pradnya", 85.3);
		smap.put("Rushikesh", 91.99);
		smap.put(null,null);
		smap.put("Amruta", 75.9);
		smap.put("Mandar", 84.1);
		smap.put("Gunjan", 81.2);
		
		System.out.println(smap);

	}

}
