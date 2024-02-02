package com.Wrapper;

public class WrapperDemo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Boxing : primitive to wrapper
		
		int num=23;
		Integer i1=Integer.valueOf(num);
		Integer i3=num;//valueof-added by compiler//autoboxing
	    
		System.out.println(i1);
		System.out.println(i3);
		
		Integer i2=new Integer(45);
		
		//unboxing
		//wrapper to primitive
		
		Float f1=4.58f;
		float f=f1.floatValue();
		float f2=f1;//floatvalue is added by compiler
		
		System.out.println(f);
		System.out.println(f2);
	}

}
