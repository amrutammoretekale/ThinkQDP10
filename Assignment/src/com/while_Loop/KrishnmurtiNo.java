package com.while_Loop;
//16.	 check no is krishnamurthi or not
//145=1!+5!+3!=145

public class KrishnmurtiNo {
	public static void krishmurtino(int num) {
		int fact =1,sum=0,temp=num;
        while(num!=0) {
        	 int rem=num%10;//5
        	 int i;
             for(i=1;i<=rem;i++) {
            	 fact=fact*i;
             }
             sum=sum+fact;
             num=num/10;//14
			 }
           
          if(temp==sum)
        	  System.out.println(temp+" is krishnmurti");
          else
        	  System.out.println(temp+" is not krishnmurti");
        }
	
	public static void main(String[] args) {
		int num=145;
		// TODO Auto-generated method stub
		krishmurtino(num);

	}

}
