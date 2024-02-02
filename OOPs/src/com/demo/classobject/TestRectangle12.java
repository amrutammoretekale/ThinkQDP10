package com.demo.classobject;

import java.util.Scanner;

public class TestRectangle12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double len,br;
		System.out.println("Enter length");
		len=sc.nextDouble();
		System.out.println("Enter breadth");
		br=sc.nextDouble();
		Rectangle12 r1=new Rectangle12();
		r1.setData(len, br);
		r1.displayData();
		System.out.println("Area:"+r1.CalArea());
		System.out.println("Perimeter:"+r1.CalPerimeter());

	}

}
