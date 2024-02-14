package com.while_Loop;

import java.util.Scanner;

public class FrequencyOfDigit {
	public static void frequency(int num) {
		int i,rem;
		
		for(i=0;i<=9;i++) {
			int temp=num;
			int count=0;
			while(temp!=0) {
				rem=temp%10;
				if(rem==i) {
					count++;
				}
				temp=temp/10;
				
			}
			
			   if(count>0)
				System.out.println(i+ "-----> " +count);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc=new Scanner(System.in);
	        int num,freq=0;
	        System.out.println("Enter the number");
	        num=sc.nextInt();
	        frequency(num);
		}
	}


