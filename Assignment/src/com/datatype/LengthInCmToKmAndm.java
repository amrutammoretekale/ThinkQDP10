package com.datatype;

import java.util.Scanner;

public class LengthInCmToKmAndm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      double length,Lm ,Lkm;
      System.out.println("Enter length");
      length=sc.nextDouble();
      Lkm=length/1000;
      Lm=length/100;
      System.out.println("Length in kilometer:"+Lkm);
      System.out.println("Length in meter:"+Lm);
      
	}

}
