package com.practice;

public class example2 {
	int x=10;
	static int y=20;
	void instanceMethod() {
	System.out.println(x);
	System.out.println(y);
	}

	static void method2() {
		 example2 e=new  example2();
		System.out.println(e.x);
		System.out.println(y);
	}
	void show() {
		x++;
		y++;
		System.out.println(x);
		System.out.println(y);
	}
	void display() {
		x=100;
		y=200;
		System.out.println(x);
		System.out.println(this.x);
		System.out.println(y);
		System.out.println(example2.y);
	}
	
	public static void main(String[] args) {
		 example2 e1=new  example2();
		 e1.method2();
		 System.out.println("-------");
		 e1.display();
		 System.out.println("-------");
		 e1.show();
	

	}

}
