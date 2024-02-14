package com.demo.pattern;

public class DimondWithSpase {
	public static void pattern() {
	
	for(int i=1;i<=5;i++)
	{
		for(int sp=4;sp>=i;sp--)
		{
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++)
		{
			System.out.print("* ");
		}
		System.out.println("");
		
		
	}
	int i;
	for( i=4;i>=1;i--)
	{
		for(int sp=4;sp>=i;sp--)
		{
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++)
		{
			System.out.print("* ");
		}
		System.out.println("");
		
		
	}
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 pattern();

	}

}
