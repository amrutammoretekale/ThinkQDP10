package com.hashsetDemo;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<String>hs=new HashSet<>();
		hs.add("Arnav");
		hs.add("Mohini");
		hs.add("Shweta");
		System.out.println(hs);
		
		HashSet<String>hs1=new HashSet<>();
		hs1.add("java");
		hs1.add("SQL");
		hs1.add("Html");
		hs1.add("c++");
		
		//Mathmaticla opr
		System.out.println(hs1);
		
//		//union
//		hs.addAll(hs1);
//		System.out.println(hs);
//		
//		//differeance
//		hs.removeAll(hs1);
//		System.out.println(hs);
		
		//interaction
		hs.retainAll(hs1);
		System.out.println(hs);

	}

}
