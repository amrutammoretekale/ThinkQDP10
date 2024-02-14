package com.while_Loop;
//17.	Disarum no 135=1+3*3+5*5*5=135
public class Disarum_No {
	public static void disarumno(int num) {
	
		int temp=num;
		int temp1=num;
		int count=0;
		
		int sum=0;
		 while(temp!=0) {
				
			  temp=temp/10;// 135 13 1
			  count++;
			}
		while(temp1!=0) {
			int power = 1;
			int rem=temp1%10;//5 3 1
			for(int i=1;i<=count;i++) {
				power=power*rem;
			}
			 sum=sum+power;
			 count--;
			temp1=temp1/10;// 135 15 1
		}System.out.println(sum);
		if(num==sum)
			System.out.println(num+" is disarum no");
		else
			System.out.println(num+" is not disarum no");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 disarumno(135);

	}

}
