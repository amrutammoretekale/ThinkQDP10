package com.demo.nested_if_else;

import java.util.Scanner;

//following categaries for E-commerce App
//1.Men
//2.Women
//3.Kids
//if user choose men show them options 1.footwear 2.Tshirt
//if user choose women show them options 1.jewellery 2.Saree
//if user choose kids show them options 1.Toys 2.educational game
//at last show which categeory and option choose by user
public class EcommersSite {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice;
		System.out.println("-----Welcome------");
		System.out.println("1.men\n2.women\n3.kids");
		System.out.println("Enter your choice");
		choice=sc.nextInt();
        if(choice==1)
         	System.out.println("1.footwear\n2.Tshirt");  
        if (choice==2)
        	System.out.println("1.jwellary\n2.sharee");
        if(choice==3)
        	System.out.println("1.toys\n2.educational game");
	}

}
