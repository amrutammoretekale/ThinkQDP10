package com.TreeMpDemo1;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
TreeMap<Integer, String> tm= new TreeMap<>();
		
//		tm.put(11, "Mandar");
//		tm.put(2, "Amruta");
//		tm.put(34, "Rushikesh");
	
		tm.put(90 ,"Alex");
		tm.put(78 ,null);
		//tm.put(null, "Un");
		tm.put(56 ,"John");
		tm.put(98 ,"Chris");
		tm.put(59, "Tim");
		
		for(Map.Entry<Integer, String> e: tm.entrySet())
		{
			System.out.println(e.getKey()+" "+e.getValue());
		}
		System.out.println("-----------------------------");
		
		System.out.println(tm);
		
       Set<Integer> keys=tm.keySet();
		
		Iterator<Integer> itr= keys.iterator();
		while(itr.hasNext())
		{
			int key= itr.next();
		  System.out.println(key+tm.get(key));
		}
		
		System.out.println("---------------------------------------");
		
        Set<Entry<Integer,String>> entries=tm.entrySet();
		
		for(Entry<Integer, String>e:entries)
		{
			System.out.println(e.getKey()+e.getValue());
		}
		
		System.out.println("---------------------------------------------");
		
		NavigableMap<Integer, String> ns=tm.descendingMap();
		for(Map.Entry<Integer, String> e:ns.entrySet())
		{
			System.out.println(e.getKey()+":"+e.getValue());
		}
		
		System.out.println("-------------------------------------------");
		NavigableSet<Integer> ns1=tm.navigableKeySet();
		for(Integer i:ns1)
		{
			System.out.println(i+":"+tm.get(i));
		}
		
	}
}



