package com.demo.datatype;

import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     double pie=3.14;
    double radius,area;
     System.out.println("Enter value of radius");
     radius=sc.nextInt();
       area=pie*radius*radius;
       System.out.println("area:"+area);
     
	}

}
