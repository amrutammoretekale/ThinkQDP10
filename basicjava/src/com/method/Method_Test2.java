package com.method;

public class Method_Test2 {

	
		// TODO Auto-generated method stub
		//method with return keyword ,without para
		
		public static String display() {
			return "hello";
		}
		
		public static int sendAge() {
			int a=10;
			return a;
		}
		
		//method with return ,with para
		public static int add(int a,int b) {
			//return a+b;
			int sum=a+b;
			return sum;  //last statement
			//System.out.println();
		}
		public static void main (String[] args) {
			// TODO Auto-generated method stub
			System.out.println("main()");
			String s=display();
			System.out.println(s);
			
			int age=sendAge();
			System.out.println(age);
			
			System.out.println(sendAge());
			
			double age1=sendAge(); //implicit typecasting
			
			short age2=(short)sendAge(); //explicit typecasting
			
			int sum=add(10, 2);
			System.out.println(sum);
		
		}
		

	}
