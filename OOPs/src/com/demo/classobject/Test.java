package com.demo.classobject;

public class Test {
	public void method1() {
		System.out.println(" hi i am instance method");
	}
    
	public void show() {
		System.out.println("Hello");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test t1=new Test();
		t1.method1();
		t1.show();

	}

}
