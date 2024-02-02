package com.inheritance;
// default methdod :backword compatiblity and mutable

interface Operations{
	void area();
	default void volume() {
		System.out.println("Volune method for 3d shape");
	}
}
class Square implements Operations{
	int side;
	Square(){
		
	}
	Square(int side){
		this.side=side;
	}
	@Override
	public void area() {
		System.out.println("Area is :"+(side*side));
		
	}
}
class Cube implements Operations{
	int side;
	Cube(){
		
	}
	Cube(int side){
		this.side=side;
	}

	@Override
	public void area() {
		System.out.println("Area of Cube is :"+(6*side*side));
		
	}
	public void volume() {
		System.out.println("Volume of Cube is:"+(side*side*side));
	}
	
}
public class DefaultMethodDemo {

	public static void main(String[] args) {
		Operations c;
		c=new Square(7);
		c.area();
		c.volume();
		
		c=new Cube(9);
		c.area();
		c.volume();
	}

}
