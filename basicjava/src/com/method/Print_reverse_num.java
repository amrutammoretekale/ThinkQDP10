package com.method;

public class Print_reverse_num {
  public static int rev(int num) {
	  int rev=0,rem;
	  while(num!=0){
		  rem=num%10;//rem
		  rev=rev*10+rem;
		  num/=10;
		
	  }return rev;
	  
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
         for(i=551;i<=565;i++) {
        	 System.out.println(i+" "+rev(i));         }
	}

}
