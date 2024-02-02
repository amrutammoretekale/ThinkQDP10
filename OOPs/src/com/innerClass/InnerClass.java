package com.innerClass;
class Outer{
	void outerMwethod() {
		System.out.println("In outer method");
	}
	class Inner{
		void msg() {
			System.out.println("in inner method");
		}
		static void show() {
			System.out.println("in static inner method");
		}
	}
}

public class InnerClass {

	public static void main(String[] args) {
		Outer o1=new Outer();
		o1.outerMwethod();
		
		Outer.Inner i1=o1.new Inner();
		i1.msg();
		Outer.Inner i2=new Outer().new Inner();
		i2.msg();
		
		Outer.Inner.show();

	}

}
