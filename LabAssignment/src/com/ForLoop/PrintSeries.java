package com.ForLoop;

public class PrintSeries {
   public static void series1() {
	   int i,ans = 1;
		for(i=1;i<=10;i++) {
			System.out.println(ans);
			ans=(ans+ans)+1;
			
		}
   }
   public static void series2() {
	   int i,ans = 2;
		for(i=2;i<=10;i++) {
			System.out.println(ans);
			ans=(ans+ans)-1;
			
		}
   }
   
   public static void series() {
	   int i,ans;
	   int n1=1;
	   int n2=2;
	   for(i=1;i<=10;i++) {
		   System.out.println(n1);
			n1=(n1+n1)+1; 
			System.out.println(n2);
			n2=(n2+n2)-1;
	   }
   }
	public static void main(String[] args) {
		 //series1() ;
		 //series2();
		 series();
		}

	}


