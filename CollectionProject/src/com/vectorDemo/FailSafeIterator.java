package com.vectorDemo;

import java.util.Enumeration;
import java.util.Vector;

public class FailSafeIterator {

	public static void main(String[] args) {
		Vector<Integer> vl = new Vector<>();
		vl.add(8);
		vl.add(5);
		vl.add(8);
		vl.add(-34);
		vl.add(23);
		
		System.out.println(vl);
		
		Enumeration<Integer> en= vl.elements();
		while(en.hasMoreElements())
		{
			if(en.nextElement()== -34)
				vl.add(34);
		}
		
		System.out.println(vl);
	}

}

