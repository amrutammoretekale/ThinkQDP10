package com.revesion;
interface D{
	void show();
	default void display() {
		System.out.println(" i am in A");
	}
	

}
interface B{
	void show();
	default void display() {
		System.out.println("I am in B");
	}
}

public class DimondProblem implements  D ,B{

	@Override
	public void show() {
		System.out.println(" I am in Diamond");
	}
	@Override
	public void display() {
		System.out.println(" i am in Diamond1");
		D.super.display();
		B.super.display();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D d;
		d=new DimondProblem();
		d.show();
		d.display();
		
		B b;
		b=new DimondProblem();
		b.show();
		b.display();

	}

	
}
