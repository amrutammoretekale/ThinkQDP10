package com.inheritance;

public class Demo1 {
	private int a;
	int b;
	protected int c;
	public int d;
	
	private void show() {
		System.out.println("hello");
	}
	 void printme() {
		System.out.println("nice");
	}
	protected void display() {
			System.out.println("good");
		}
	public void displayme() {
		System.out.println("good");
	}

	public static void main(String[] args) {
		AccesDemo1 obj=new AccesDemo1();
		//obj.a=10;//private is not accessable
		obj.b=20;
		obj.c=30;
		obj.d=40;
		
		//obj.show();//private is not accessable
		obj.printme();
		obj.display();
		obj.displayme();
		

	}

}
