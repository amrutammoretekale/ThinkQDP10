package com.demo.datatype;
//WAP to take product price is 10 ask user quantity and give them total bill.
import java.util.Scanner;

public class TotalBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int quantity,productprice=10,totalbill;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Quantity");
        quantity=sc.nextInt();
        totalbill=productprice*quantity;
        System.out.println("totalbill:"+totalbill);
	}

}
