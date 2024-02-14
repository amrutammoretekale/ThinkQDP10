package com.conditional;

import java.util.Scanner;

//Write a Java program to input marks of five subjects Physics, Chemistry,
//Biology, Mathematics and Computer. 
//Calculate percentage and grade according to following:
//Percentage >= 90% : Grade A
//Percentage >= 80% : Grade B
//Percentage >= 70% : Grade C
//Percentage >= 60% : Grade D
//Percentage >= 40% : Grade E
//Percentage < 40% : Grade F
public class Cal_Per_GradeOf5Sub {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int phys,chem,bio,math,comp,total;
		float per;
		System.out.println("Enter marks of phys");
		phys=sc.nextInt();
		System.out.println("Enter marks of chem");
		chem=sc.nextInt();
		System.out.println("Enter marks of bio");
		bio=sc.nextInt();
		System.out.println("Enter marks of comp");
		comp=sc.nextInt();
		System.out.println("Enter marks of math");
		math=sc.nextInt();
		total=bio+phys+math+chem+comp;
		per=(total/5)*100;
		System.out.println("percentage:"+per);
		if(per>90)
			System.out.println("grade A");
		else if(per>=80)
			System.out.println("grade B");
		else if(per>=70)
			System.out.println("grade C");
		else if(per>=60)
			System.out.println("grade D");
		else if(per>=40)
			System.out.println("garde E");
		else
			System.out.println("grade F");
		
	}

}
