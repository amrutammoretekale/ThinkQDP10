package com.Varargs;

public class VargsWrapper {
	// promoted to parent class
	
	
//		public static void display(int ...s)
//		{
//			System.out.println("In int");
//			for(int st:s)
//			{
//				System.out.println(st);
//			}
//		}
		
		
		public static void display(Object ...s)
		{
			System.out.println("In object");
			for(Object st:s)
			{
				System.out.println(st);
			}
		}
		

		public static void display(Number ...s)
		{
			System.out.println("In number");
			for(Number st:s)
			{
				System.out.println(st);
			}
		}
		
		public static void display(Double ...s)
		{
			System.out.println("In double");
			for(Double st:s)
			{
				System.out.println(st);
			}
		}
		
		public static void display(Integer ...s)
		{
			System.out.println("In int");
			for(Integer st:s)
			{
				System.out.println(st);
			}
		}


	public static void main(String[] args) {
		display(7.8f,6.7f); // Float : Number: Object
		display('A','B','C');// Character: Object
	}


	}


