package com.Lab.IfElse;

import java.util.Scanner;

public class ProductPrize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc=new Scanner(System.in);
   int Qty,price=0;
   float unitprice=50;
   double total=0,paybill=0;
   
   System.out.println("Enter the Quantity");
   Qty=sc.nextInt();
   
   total=Qty*price;
   if(Qty<=10) {
	   System.out.println("No disscount");
	   paybill=total;
   }
   else if(Qty<=25)
   {
	   System.out.println("5% disscount");
	   paybill=total-(0.05*total);
   }else if(Qty<=50)
   {
       System.out.println("10% disscount");
       paybill=total-(0.1*total);
    
   } else
	   System.out.println("paybill:" +paybill);
}
}
