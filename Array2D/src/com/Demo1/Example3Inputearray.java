package com.Demo1;

import java.util.Scanner;

public class Example3Inputearray {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int arr[][]= new int[3][3];
		
	
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("enter values of row"+(i+1)+":");
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]= sc.nextInt();
			}
			
		}
		
		System.out.println("-----------------------");
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			
			System.out.println();
		}
	}
}
