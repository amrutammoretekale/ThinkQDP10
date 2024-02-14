package com.while_Loop;
//19.	check no is automorphic or not
//input n=25
//output Automorphic
//as 25*25=625

public class Automorphic_No {
	public static void automorphic(int num) {
		int temp=num, ans=0;
		
		int sum=0,i;
		 int count=0;
		 
		 while(temp!=0) {
				
			  temp=temp/10;
			  count++;
	     	}
		    int sqr=num*num;
		   int power=1;
		   for(i=1;i<=count;i++) {
			 power=power*10;
			
		 }
		   ans=sqr%power;
		  
		  System.out.println("ans"+ans);
		 
		if(ans==num) 
			System.out.println(num+" is automrphism");
			else
			System.out.println(num+" is not automrphism");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		automorphic(25);

	}

}
