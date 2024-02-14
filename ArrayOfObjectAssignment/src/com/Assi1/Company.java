package com.Assi1;
import java.util.Scanner;
//Create a class Department id, name, location
//Create a class Employee having id,name and salary
//and containment dept
//--> Create 2 anonymous object and one object from
//getter,setter
//----> Create object using user input
//---> Sort the employee on the basis of salary
//--->Find the employee having max salary
public class Company {
	static Scanner sc=new Scanner(System.in) ;
	static void sortSalary(Employee em[]) {
		double maxsal=em[0].getSalary();
		Employee stemp=new Employee();
		  for(int i=0;i<em.length;i++) {
			  for(int j=i+1;j<em.length;j++) {
				  if(em[i].getSalary()<em[j].getSalary());
				  {
					  stemp=em[i];
					 em[i]=em[j];
					 em[j]=stemp;
				  }
			  }
			  System.out.println(stemp);
		  }
	  }
	
	static void findmaxSalary(Employee em[]) {
		double maxsal=em[0].getSalary();
		//Employee temp=new Employee();
		String name=em[0].getEname();
		for(int i=0;i<em.length;i++) {
			if(em[i].getSalary()>maxsal) {
				maxsal=em[i].getSalary();
				name=em[i].getEname();
			}
		}
		System.out.println("MaxSal :"+maxsal+" "+"name:"+name);
		}
	
		
	static void enteruserinput(Employee e) {
		System.out.println("Enter eid:");
		e.setId(sc.nextInt());
		System.out.println("Enter Ename:");
		e.setEname(sc.next());
		System.out.println("Enter salary");
		e.setSalary(sc.nextDouble());
		System.out.println("Enter Did");
		Department d=new Department();
		e.setDepartment(d);
		e.getDepartment().setId(sc.nextInt());
		System.out.println("Enter Dname:");
		e.getDepartment().setName(sc.next());
		System.out.println("Enter Location:");
	    e.getDepartment().setLocation(sc.next());
		
	}
	static void displayDetails(Employee em[])
	{
		System.out.println("---------------------------------------");
		for(Employee e:em)
		{
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		Employee e1[]=new Employee[2];
		
//		e1[0]=new Employee(101,"Arnav",12000,new Department(111,"E&TC","pune"));
//		e1[1]=new Employee(102,"Nitin",30000,new Department(222,"COE","Nasik"));
//		e1[2]=new Employee(101,"Samir",12000,new Department(333,"E&TC","Latur"));
//		
//		e1[3]=new Employee();
//		e1[3].setId(104);
//		e1[3].setEname("Amit");
//		e1[3].setSalary(10000);
//	
		
		for(int i=0;i<e1.length;i++) {
			e1[i]=new Employee();
		enteruserinput( e1[i]);
		}
		
		
		displayDetails(e1);
		
		System.out.println("------------------Sorting ----------------------------");
		displayDetails(e1);
		sortSalary(e1);
		
		System.out.println("----------------------------------------------");
		displayDetails(e1);
		findmaxSalary(e1);
		

	}

	

}
