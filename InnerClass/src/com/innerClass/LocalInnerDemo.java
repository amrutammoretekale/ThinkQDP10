package com.innerClass;



class Outer2{
	private static int data=10;
	void display() {
		class Inner2{
			private int value=90;
			static void show() {
				System.out.println(data);
			}
			void show1() {
				System.out.println(value);
			}
			
		}
		//object inside the method
		Inner2 i1=new Inner2();
		i1.show1();
		Inner2.show();
	}
}
public class LocalInnerDemo {

	public static void main(String[] args) {
		Outer2 o1=new Outer2();
		o1.display();
		
		//Outer2.display();

	}

}
