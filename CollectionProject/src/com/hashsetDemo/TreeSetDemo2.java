package com.hashsetDemo;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo2 {

	public static void main(String[] args) {
		
			TreeSet<Integer>ts=new TreeSet<>();
			ts.add(12);
			ts.add(45);
			ts.add(25);
			ts.add(78);
			//ts.add(null);
			//dupliate not allowed
			
			System.out.println(ts);
			System.out.println("----------------");
			System.out.println("Frist:"+ts.first());
			System.out.println("Last:"+ts.last());
			
			System.out.println(ts.headSet(64));//64 is not included
			System.out.println(ts.tailSet(64));//64 is included
			SortedSet<Integer>s1=ts.subSet(12, 78);
			System.out.println(s1);
			
			//navigableset
			System.out.println("Lower:"+ts.lower(64));
			System.out.println("Floor:"+ts.floor(64));
			
			System.out.println("Higher:"+ts.higher(64));
			System.out.println("Celling:"+ts.ceiling(64));
			
			System.out.println(ts.headSet(64,false));
			System.out.println(ts.tailSet(64,false));
			System.out.println(ts.subSet(12,true,78,true));
			
		
			
			

	}

}
