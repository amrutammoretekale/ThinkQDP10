package com.inherit;

import com.inheritance.AccesDemo1;

public class Demo2 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccesDemo1 obj=new AccesDemo1();
		//obj.a=10;//private is not accessable
		//obj.b=20;//default is not accessable
		//obj.c=30;//protected is not accessable
		obj.d=40;
		
		//obj.show();//private is not accessable
		//obj.printme();//default is not accessable
		//obj.display();//protected is not accessable
		obj.displayme();
		

	}

}
