package com.demo.constructor;
class Demo
{
	
  int a,b;
  String name;
  
  Demo()
  {
//	  this.a=10;
//	  b=20;
//	  name="Unknown";
	  this(10,20);
	  System.out.println("Default constructor");
  }
  
  Demo(int a,int b)
  {
	 // this();  Recursive call to constructor
	  System.out.println("Param const.. 1");
	  this.a=a;
	  this.b=b;
	  this.name="Unknown";
  }
  
  Demo(int a, int b, String name)
  {
	  
	  this.a=a;
	  this.b=b;
	  this.name=name;
	  System.out.println("Param const.. 2");
  }
  


}

public class ConstructorChaining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d1=new Demo();
		Demo d2=new Demo(14,15,"Arnav");
		Demo d3=new Demo(10,20);

	}

}
