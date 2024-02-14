package com.methodoverloading;

public class MethodOverloading {
	
	static void display(int n) {
		System.out.println("In int");
		System.out.println(n);
	}
	static void display(float n) {
		System.out.println("In float");
		System.out.println(n);
	}
	static void display(char n) {
		System.out.println("in cahr");
		System.out.println(n);
	}
	static void display(double n) {
		System.out.println("in double");
		System.out.println(n);
	}
	static void dispaly(long n) {
		System.out.println("In long");
		System.out.println(n);
	}
	static void dispaly(int n1,float f1) {
		System.out.println("In method 1");
		System.out.println(n1+f1);
	}
	static void dispaly(float f1,int n1) {
		System.out.println("In method 2");
		System.out.println(n1+f1);
	}
	public static void main(String[] args) {
		   display(8);
		   display(8.4f);
		   dispaly(8,4.5f);
		  // display(8.5f,5);//Ambiguous issue

	}

}
