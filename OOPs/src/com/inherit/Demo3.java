package com.inherit;

import com.inheritance.AccesDemo1;

public class Demo3 extends AccesDemo1 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo3 obj=new Demo3();
		//obj.a=10;//private is not accessable
		//obj.b=20;//default is not accessable
		obj.c=30;
		obj.d=40;
		
		//obj.show();//private is not accessable
		//obj.printme();//default is not accessable
		obj.display();
		obj.displayme();

	}

}
