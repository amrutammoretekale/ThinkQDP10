package com.DiamondProblem;
interface one{
	default void print() {
		System.out.println("one");
	}
	abstract void show();
	
}
interface two extends one{
	default void print () {
		one.super.print();
		System.out.println("two");
	}
}
interface three extends one{
	default void print() {
		System.out.println("three");
	}
}
class Main1 implements two,three{
	public void print() {
		three.super.print();
		two.super.print();
		System.out.println("main");
	}

	@Override
	public void show() {
		System.out.println("in main show");
		
	}
}
public class DiamondProblem {

	public static void main(String[] args) {
		Main1 m=new Main1();
		m.print();

	}

}
