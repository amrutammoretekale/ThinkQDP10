package com.Static_Final;
//5.	See if you can overload static method, by using static keyword for 2nd overloade
//method and without using static keyword.
public class OverloadMethodUsingStatic {
	static void display(float n) {
		System.out.println("In float");
		System.out.println(n);
	}
      static void display1(char n) {
		System.out.println("in cahr");
		System.out.println(n);
	}
	static void display(double n,double d) {
		System.out.println("in double");
		System.out.println(n);
		System.out.println(d);
	}

	public static void main(String[] args) {
			display(10,10);
		OverloadMethodUsingStatic a1=new OverloadMethodUsingStatic ();
		a1.display1('a');

	}
	
		
	}


