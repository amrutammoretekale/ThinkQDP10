package com.demo.operator;

public class UnaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //case 1
		//int a=10;
		//a++;//11
		//++a;//11
		//System.out.println(a);
		
		//case2
		//int b=20;
		//System.out.println(++b);//21
		//System.out.println(b++);//20
		//System.out.println(b);//21
		
		//case 3
		//int c=30;
		//int d=++c;
		//int d=c++;
		//System.out.println("c:"+c);
		//System.out.println("d:"+d);
		
		int a=10;
		int b=20;
		int d;
		d=a++ + b++;
		System.out.println("a"+a);//11
		System.out.println("b"+b);//21
		System.out.println("d"+d);//30
	}

}
