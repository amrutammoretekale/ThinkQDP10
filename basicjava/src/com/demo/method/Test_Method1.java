package com.demo.method;

public class Test_Method1 {
         //defination
	//without return without parameter
	public static void show() {
		System.out.println("Hello");
	}
	 // without return with parameter
	public static void add(int a,int b) {
		
		int sum=a+b;
		System.out.println("sum"+sum);
	} 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//method calling
		//by method name
		//method can be multiple time in program
		//it can be used in any block
		//eg if else switch loop
       show();
       //add(10,"hello") not possible
       //add(10.5,12.2) not possible
       add(10,20);
       add(10,'a');
       int x=10,y=20;
       add(x,y);
    		   
	}

}
