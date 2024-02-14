package com.demo.whileloop1;

public class AmstrongNo1To500 {
	public static int countDigit(int num) {
		int count=0;
		while(num!=0) {
			count++;
			num/=10;
	     }return count;
	}
	public static int power(int base,int pow) {
		int i;
		int p=1;
		for(i=1;i<=pow;i++) {
			p*=base;//p=p*base;
			}return p;
	}
	public static boolean amstrongno(int num) {
		int pow=countDigit(num);
		int orignal=num;
		int rem, sum=0;
		int i;
      while(num!=0) {
		
		while(num!=0) {
			rem=num%10;
			sum=sum+power(rem,pow);
			num/=10;               
			}
		}
      return orignal==sum;
	}
	
	public static void isamstrongno() {
		int i;
		for(i=1;i<=5000;i++) {
			if(amstrongno(i))
				System.out.println(i);
		}
	}
	

	public static void main(String[] args) {
	     isamstrongno(); 
	     
	}

}
