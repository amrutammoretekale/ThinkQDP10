package com.demo.constructor;

public class HarshatNo{
	int num;
	public HarshatNo(){
		num=156;
	}
	public HarshatNo(int num) {
		this.num=num;
	}
	public  boolean harshat(int num) {
		  int rem,sum=0;
		  int orignal=num;
		  while(num!=0) {
			  rem=num%10;
			  sum=sum+rem;
			  num=num/10;
			  }
		  if(orignal%sum==0) {
			  return true;
		  }
		  else 
			  return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HarshatNo h1=new HarshatNo();
		if(h1.harshat(156))
			System.out.println(h1.num+" is harshat no");
		else
			System.out.println(h1.num+" is not harshat no");
	}

}
