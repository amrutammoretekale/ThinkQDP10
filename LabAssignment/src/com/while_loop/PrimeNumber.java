package com.while_loop;

public class PrimeNumber {
	
	public int count(int n) {
		int i,count=0;
		for(i=0;i<=n;i++) {
			if(n%i==0) {
				count++;
			} 
		}
		return count;
		
	}
	public  boolean cheakprimeno(int n) {
		int count= count(n);
		if(count==2)
			return true;
		else
			return false;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeNumber p1=new PrimeNumber();
		p1.cheakprimeno(17);
		int n=17;
		//boolean status= cheakprimeno(n);
		//if(status)
		//	System.out.println("prime");
		//else
			//System.out.println(" not prime ");

	}

}
