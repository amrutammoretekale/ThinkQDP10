package com.inheritance;

class Parent {
	int value;
	String msg;

	Parent() {

	}

	Parent(int value) {
		System.out.println("In parent class para constructor");
		this.value = value;
	}

	public String toString() {
		return "parent:." + value;
	}

	void display() {
		String msg = "Welcome";
		System.out.println("massage:" + msg);

	}
}

class Child extends Parent {
	int data;

	Child() {
		msg = "Hello";
	}

	Child(int Data, int value) {
		super(value);
		this.data = data;
		msg = "Hello";
	}

	void display() {
		super.display();
		System.out.println("Data:" + data);
	}

	void show() {
		String msg = "Java";
		System.out.println("Message:" + msg);
		System.out.println("Inst message:" + this.msg);
		System.out.println("Super message:" + super.msg);
	}

}

public class SuperDemo {

	public static void main(String[] args) {

		Child c = new Child(10, 100);
//		System.out.println("Data:"+c.data);
//		System.out.println("Value:"+c.value);
		c.display();
		c.show();

	}

}
