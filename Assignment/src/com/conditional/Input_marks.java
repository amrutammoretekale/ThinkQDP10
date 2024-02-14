package com.conditional;

import java.util.Scanner;

// WAP to input marks of 5 subject
public class Input_marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int m1,m2,m3,m4,m5;
        int marks,grade,sum=0;
        System.out.print("Enter the  5 subjects marks ");
        m1=sc.nextInt();
        m2=sc.nextInt();
        m3=sc.nextInt();
        m4=sc.nextInt();
        m5=sc.nextInt();
        int total=m1+m2+m3+m4+m5;
        float per=total/5;
       
        if(per>=90)
        	System.out.println("Gread A");
         else if(per>=80)
            System.out.println("Gread B");
         else if(per>=70)
        	 System.out.println("Grade C");
         else if(per>=60)
        	 System.out.println("Grade D");
         else if(per>=50)
        	System.out.println("Grade E");
         else if(per>=40)
        	 System.out.println("Grade F");
        System.out.println("total:"+total);
        System.out.println("percenage:"+per);
	}

}
