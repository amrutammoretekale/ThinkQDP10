package com.switchcase1;

import java.util.Scanner;

//9.WAP in java using switch case for following: Area of a circle Area of a square 
//Area of a right angled triangle 
//Area of a rectangle Circumference of a circle 
//Perimeter of a square Accept inputs like radius,side,etc through keyboard.
public class FindAreaOfCicle_Trai_Reac {
	
     public static float areaCircle(float radius) {
	        float area;
			float pie=3.14f;
		   area=pie*radius*radius;
		   return area;
	      }
     
     public static int areaSqr(int num1,int num2) {
    	 int a,width = 1,length = 1,areasqr;
    	 a=length*width;
 	     areasqr=a*2;
 	     return areasqr;
     }
     
     public static double arearightangle(double base2,double height2) {
    	     double base = 1,height = 1,areaangle;
    	     areaangle = 0.5*base2*height2;
    	    return  areaangle;
     }
     
     public static int areaofrect(int num1,int num2) {
    	 int areaRect,l = 1,b = 1;
    	 areaRect=l*b;
    	 return areaRect;
     }
     public static float circumferance1(float radius12) {
    	 float radius1 = 1,circumferance;
		 float pie1=3.14f;
		 return 2*pie1*radius1;
     }
     public static int  perimetersqr(int num) {
    	 int side = 1,perimeter;
         perimeter=4*side;
    	 return perimeter;
     }
     
   
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
    	System.out.println("enter your choice");
    	int choice = 0;
    	choice=sc.nextInt();
		
	    switch(choice) {
	   
	    case 1:// area of circle
	    float area,radius = 1;
		System.out.println("Enter radius");
		radius=sc.nextInt();
		float area1=areaCircle(radius);
		System.out.println("area of Circle:"+area1);
	    break;
	    case 2:  // area of Square
		int a,length,width,areasqr;
	    System.out.println("Enter Length");
	    length=sc.nextInt();
	    System.out.println("Enter width");
	    width=sc.nextInt();
	     a=length*width;
 	     //areasqr=a*2;
	    int areasqr1=areaSqr(length,width);
	    System.out.println("area of Square:"+areasqr1);
	    break;
	    
	    case 3://area of right angled triangle 
	     double base,height,areaangle;
	     System.out.println("Enter Base");
	     base=sc.nextInt();
	     System.out.println("Enter height");
	     height=sc.nextInt();
	     //areaangle = 0.5*base*height;
	     int areaangle1=(int) arearightangle(base,height);
	     System.out.println("area of Right angle triangle:"+areaangle1);
         break;
	    
	    case 4:// area of rectangle
	     int areaRect,l,b;
	     System.out.println("Enter length");
	     l=sc.nextInt();
	     System.out.println("Enter breath");
	     b=sc.nextInt();
	     //areaRect=l*b;
	     int areaRect1=areaofrect(l,b);
	     System.out.println("area of rectangle:"+areaRect1);
	     break;
	    
	    case 5:// circumferance of circle
	     float radius1,circumferance;
		 float pie1=3.14f;
		 System.out.println("Enter radius");
		 radius1=sc.nextInt();
		 //circumferance=2*pie1*radius1;
		 float cir=circumferance1(radius1);
		 System.out.println("circumferance:"+cir);
		 break;
	   
	    case 6://Perimeter of square
		 int side,perimeter;
		 System.out.println("Enter side");
		 side=sc.nextInt();
		 //perimeter=4*side;
		 int perimeter1= perimetersqr(side);
		 
		 System.out.println("perimeter of Square is:"+perimeter1);
		 break;
	}

	
	}


	}


