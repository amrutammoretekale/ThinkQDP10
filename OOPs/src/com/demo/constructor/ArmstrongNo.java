package com.demo.constructor;

public class ArmstrongNo {
	int num;
	public ArmstrongNo() {
		num=371;
	}
	public ArmstrongNo(int num) {
		this.num=num;
	}
	public int countdigit(int num) {
		int count=0;
		int onum=num;
		while(onum!=0) {
			count++;
			onum/=10;
		}return count;
	}
	public int power(int base,int pow) {
		int i;
		int p=1;
		for(i=1;i<=pow;i++) {
			p=p*base;
		}
		System.out.println("power is:"+p);
		return p;
	
	}	
	public boolean testArmstrong() {
		int pow=countdigit(num);
		int onum=num;
		int  base=1 ,rem,sum=0;
		while(onum!=0) {
			rem=onum%10;
			sum=sum+ power(rem,pow); 
			onum=onum/10;
		}
		System.out.println("sum is:"+sum);
		System.out.println("num is:"+num);
		  if(num==sum) {
			   return true;
		   }
		  else 
			  return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArmstrongNo a1=new ArmstrongNo(371);
		
		if(a1. testArmstrong()) {
			System.out.println(a1.num+" is armstrong");
		}
		else
			System.out.println(a1.num+" is not armstrong");
		

	}

}
