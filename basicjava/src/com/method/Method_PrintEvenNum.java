package com.method;

public class Method_PrintEvenNum {
	public static void printEvn(int num) {
		int i;
		for(i=1;i<=num;i++);{
		boolean status=isEven(i);
		if(status) {
			System.out.println(i+"");
		}
		}
	}
	public static boolean isEven(int n) {
	
		if(n%2==0)
			return true;
		else
			return false;
	}
    public static boolean isodd(int n) {
    	if(n%2!=0)
    		return true;
    	else
    		return false;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int range=50;
       printEvn(range);
       int a=56;
       System.out.println(isEven(a));
	}

}
