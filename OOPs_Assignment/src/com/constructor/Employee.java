package com.constructor;

import java.util.Scanner;

/*Write a Java program to create Employee class with following details 
data members  : id,ename,basicsal ,pf,hra,da  ,netsal ,deptno
default and parametric constructors
methods : displayEmp().calculateSal() 
Note : pf is 10% basicsal,hra is 15% of basicsal ,da is 20% of basicsal 
netsal=basicsal-pf+da+hra
Write a test program in which create 2 employee object and call methods*/
public class Employee {
	int id;
	String ename;
	double basicsalary,pf,hra,da,netsal,deptno;
	
	Employee(){
		int financial;
	}
	Employee(int id,String ename,double basicsalry){
		this.id=id;
		this.ename=ename;
		this.basicsalary=basicsalry;
		
	}
	public void detail() {
		System.out.println("Employee detail");
		System.out.println("id:"+id);
		System.out.println("ename:"+ename);
		System.out.println("basicsalary:"+basicsalary);
		System.out.println("netsal:"+netsal);
		
	}
	public void calsalary() {
		pf=basicsalary*0.1;
		hra=basicsalary*0.15;
		da=basicsalary*0.2;
		netsal = basicsalary-pf+da+hra;
		
		
	}
	public String toString() {
		return ename;
	}
		public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			double salary;
			System.out.println("enter basicsalary");
			salary=sc.nextDouble();
			
			
		     Employee e2=new Employee(101,"Arnav",5000);
		     e2.calsalary();
		     e2.detail();
		    
		

	}

}
