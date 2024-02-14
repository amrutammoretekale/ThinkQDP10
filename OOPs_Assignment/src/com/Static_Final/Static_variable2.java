package com.Static_Final;
//4.	Check following variations:
//a.	Static variable and Non-Static (Instance Variable) – Just declare and print it.
//b.	See if you can access static variable in static method
//c.	non static variable in static method
//d.	then static variable in non-static method
//e.	non static variable in non-static method Note: non static means instance variable


public class Static_variable2 {
	int x=10;
	static int y=20;
	void instanceMethod() {
		// in instance method can access both static and instance
		System.out.println(x);
		System.out.println(y);
	}
	// in static method- can access only static variable
	// access instance we need to create object 
	static void method() {
		Static_variable2 v3=new  Static_variable2();
		System.out.println(v3.x);
		System.out.println(y);
	}
	void show() {
		x++;
		y++;
		System.out.println("x:"+x);
		System.out.println("y:"+y);
	}
	void display() {
		int x=100;//local variable
		System.out.println(x);
		System.out.println(this.x);
		
		System.out.println(y);
		System.out.println(Static_variable2.y);
	}

	public static void main(String[] args) {
		//System.out.println(x);
		System.out.println(y);
		
		Static_variable2 v1=new Static_variable2();
		Static_variable2 v2=new Static_variable2();
		
		System.out.println(v1.x);
		System.out.println(v2.y);
		
		System.out.println("--------------------------");
		v1.show();
		v2.show();
		
		

	}

}
