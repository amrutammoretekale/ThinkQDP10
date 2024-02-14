package com.demo.pattern;

public class Square_N {
	public static void pattern_I() {
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i==1||j==3|| i==5)
				{
					System.out.print("*");
				}
				else
				{
				System.out.print(" ");
				}
			}
			System.out.println("");
		}
		
	}
	
	static  void patterN()
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(j==1 ||i==j|| j==5)
				{
				System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pattern_I();
		patterN();

	}

}
