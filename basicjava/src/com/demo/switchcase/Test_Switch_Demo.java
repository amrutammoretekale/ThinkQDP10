package com.demo.switchcase;

import java.util.Scanner;

public class Test_Switch_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		   char choice;
		    System.out.println("----Welcome CCd---");
		    System.out.println("A.Tea/n.B.cofee/nC.Sandwitch");
		    

		  System.out.println("Enter your choice:");
		    choice=sc.next().charAt(0);
		    switch(choice) {
		    case 'a':
		    case 'A':
		    	System.out.println("Tea for Rs 20");
		    	break;
		    
			case 'b':
			case 'B':
		    	System.out.println("coffee for Rs 100");
		    	break;
			
			case 'c':
			case 'C':	
		    	System.out.println("Sandwitch for Rs 200");
		    	break;
			default:
				System.out.println("his option is not available");
			}

	}

}
