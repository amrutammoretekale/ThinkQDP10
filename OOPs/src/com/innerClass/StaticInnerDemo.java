package com.innerClass;
class Outer1{
	static int value=10;
	String msg="Hello";
	void display() {
		System.out.println("Value:"+value);
		System.out.println("Message:"+msg);
	}
	static class  Inner1{
		static int data=100;
		String msg1="welcome";
		void show() {
			System.out.println("value:"+value);
//			System.out.println("Message from outer1"+msg1);
//			display();
			
			Outer1 o1=new Outer1();
			System.out.println("message from outer:"+o1.msg);
			o1.display();
		}
		static void print() {
			System.out.println("satic inner");
		}
	}
}
public class StaticInnerDemo {

	public static void main(String[] args) {
		//Outer1.Inner1 n1=new Inner1().Outer1;

	}

}
