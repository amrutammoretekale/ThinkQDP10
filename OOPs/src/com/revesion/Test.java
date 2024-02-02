package com.revesion;
class Flower{
     void m1() {
		System.out.println("Flower m1.....");
	}
	static void m2() {
		System.out.println("Flower m2....");
	}
	void m4() {
		System.out.println("Flower m3....");
	}
}
class Rose extends Flower {
	 void m1() {
		System.out.println("Rose m1...");
	}
	void m3() {
		System.out.println("Rose m2...");
	}
}
public class Test {

	public static void main(String[] args) {
		Flower f=new Flower();
		f.m1();
		f.m2();
		f.m4();
		System.out.println("-----------------------");
		f=new Rose();
		f.m1();
	   // f.m3();//this method not prsent in parent class
		f.m4();
		

	}

}
