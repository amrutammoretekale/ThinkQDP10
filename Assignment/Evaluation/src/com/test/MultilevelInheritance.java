package com.test;
class Animal{
	public void eat() {
		System.out.println("eating");
	}
}
class Dog extends Animal{
	public void bark() {
		System.out.println("barking");
	}
}
class BodyDog extends Dog{
	public void weep() {
		System.out.println("weeping");
	}
}
public class MultilevelInheritance {

	public static void main(String[] args) {
		BodyDog d1=new BodyDog();
		d1.eat();
		d1.bark();
		d1.weep();

	}

}
