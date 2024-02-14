package com.demo.operator;

public class LogicalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
        int b=20;
        int c=10;
        
        System.out.println(a<b && a<c);//false
        System.out.println(a<b || a<c);//true
        System.out.println(a==c || a>b);//rue
        System.out.println(a==c || a<b);//true
	}

}
