package com.demo.classobject;

//compatible
class Rectangle{
	//instanse variable
	double len;
	double br;
	
	public void color() {
		System.out.println("color instance method");
	}
}
//executable


public class TestRect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r1=new Rectangle();
		r1.color();
		System.out.println(r1.len);
		System.out.println(r1.br);

	}

}
