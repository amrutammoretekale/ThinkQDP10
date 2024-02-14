package com.innerClass;
class Outer1
{	
    static int value=10;
    String msg="Hello";
    
    void display()
    {
    	System.out.println("Value:"+value);
    	System.out.println("Message:"+msg);
    }
    
    static class Inner
    {
    	static int data=100;
    	String msg1="welcome";
    	
    	void show()
    	{
    		System.out.println("Value:"+value);
//    		System.out.println("Message from Outer:"+msg);
//    		display();
    		
    		System.out.println("Data:"+data);
            System.out.println("Inner message:"+msg1);
            
            Outer1 o1= new Outer1();
    		System.out.println("Message from Outer:"+o1.msg);
    		o1.display();
            
    		
    	}
    	
    	static void print()
    	{
    		System.out.println("static inner ");
    	}
    	
    }

}
public class StaticInnerDemo {

	public static void main(String[] args) {
		//Outer1.Inner1 n1=new Inner1().Outer1;
		Outer1.Inner i1=new Outer1.Inner();
		i1.show();
		
		Outer1.Inner.print();
	}

}
