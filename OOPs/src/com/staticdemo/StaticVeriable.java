package com.staticdemo;

public class StaticVeriable {
	int x=20;//instance variable
	static int y=10;//local variable
	
	//in instance
	void instanceMethod() {
		System.out.println(x);
		System.out.println(y);
	}
	// in static method: can access only static
	//access instance -we neeed to create object
	static void staticMethod() {
		StaticVeriable s=new StaticVeriable();
		System.out.println(s.x);
		System.out.println(y);
	} 
	
	void show() {
		x++;
		y++;
		System.out.println(x);
		System.out.println(y);
	}
	void display()
	{
		int x=100;
		System.out.println(x); // local variable
		System.out.println(this.x);
		
		int y=200;
		System.out.println(y);// local
		System.out.println( StaticVeriable.y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(x);
				System.out.println(y);
				 StaticVeriable s1= new  StaticVeriable();
				 StaticVeriable s2= new  StaticVeriable();
				System.out.println(s1.x);
				//System.out.println(s1.y);
				
				System.out.println("------------------------------");
				s1.show();
				s2.show();
				

	}

}
