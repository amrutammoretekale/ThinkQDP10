package com.datatype;

import java.util.Scanner;

public class FindDia_Area_CircumferanceOfCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
	     double pie=3.14;
	    double radius,area,diemeter,circumferance;
	     System.out.println("Enter value of radius");
	     radius=sc.nextInt();
	       area=pie*radius*radius;
	       diemeter=2*radius;
	       circumferance=2*pie*radius;
	       System.out.println("area:"+area);
	       System.out.println("diemeter:"+diemeter);
	       System.out.println("circumferance:"+circumferance);
	}

}
