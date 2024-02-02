package com.methodoverloading;

public class TypePramotion {
	static void display(int n) {
		System.out.println("In int");
		System.out.println(n);
	}
	static void display(char n) {
		System.out.println("In char");
		System.out.println(n);
	}
	static void display(float n) {
		System.out.println("In float");
		System.out.println(n);
	}
	static void display(long n) {
		System.out.println("In long");
		System.out.println(n);
	}
	static void display(int n1,double d1) {
		System.out.println("In method 1");
		System.out.println("ans:"+(n1+d1));
	}
	static void display(int n1,float f1) {
		System.out.println("In method 2");
		System.out.println("ans:"+(n1+f1));
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//display(8);//In int
		//display(8l);//In long
		//display(8.4f);
		//display(9l,7.4f);
		System.out.println("-------------------------------");
		//display('A');
		
		display(9,4.5f); // ambiguity issues
	
		

	}
	
		
	}
	
		
	


