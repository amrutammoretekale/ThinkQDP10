package com.DiamondProblem;
interface Fruit{
	default void print() {
		System.out.println("Fruit....");
	}
}
interface Apple extends Fruit{
	default void print() {
		Fruit.super.print();
		System.out.println("Fruit Apple....");
	}
}
interface Beat extends Fruit{
	default void print() {
		System.out.println("Fruit Beat....");
	}
}
class Main2 implements Apple,Beat{

	@Override
	public void print() {
		System.out.println("in main ");
		Apple.super.print();
		Beat.super.print();
	}
	
}
public class DiamondProblem2 {

	public static void main(String[] args) {
		Main2 m1=new Main2();
		m1.print();
	}

}
