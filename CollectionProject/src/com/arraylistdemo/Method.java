package com.arraylistdemo;

import java.util.ArrayList;
import java.util.List;

public class Method {

	public static void main(String[] args) {
	List<String> a1=new ArrayList<>();
	
	System.out.println(a1.size());
	System.out.println(a1.isEmpty());
	
	a1.add("Shreyash");
	a1.add("Akshata");
	a1.add("Mandar");
	a1.add("Gunjan");
	
	System.out.println(a1.size());
	System.out.println(a1.isEmpty());
	
	System.out.println(a1.set(2, "onkar"));
	System.out.println(a1);
	
//	System.out.println(a1.set(5, "Amruta"));
//	System.out.println(a1);
	System.out.println(a1.contains("onkar"));
	System.out.println(a1.contains("Pravin"));
	
	System.out.println("----------------");
	System.out.println(a1.remove("onkar"));
	System.out.println(a1);
	
	System.out.println(a1.remove("Anita"));
	System.out.println(a1);
	
	System.out.println("---------------------");
	System.out.println(a1.remove(1));
	System.out.println(a1);
	
	System.out.println("--------------");
	System.out.println(a1.add("pradnya"));
	System.out.println(a1);
	
	//System.out.println(a1.add(3,"Supriya"));
    a1.add(3,"Supriya");
    System.out.println(a1);
	}

}
