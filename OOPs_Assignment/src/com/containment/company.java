package com.containment;

import java.util.Scanner;

public class company {
	static Scanner sc=new Scanner(System.in);
	static void enterEmpoyeeDetials(Employee e,Department d) {
		System.out.println("Enter Employee Id");
		e.setEid(sc.nextInt());
		System.out.println("Enter Employee name");
		e.setEname(sc.next());
		System.out.println("Enter Employee salary");
		e.setSalary(sc.nextDouble());
		
		e.setDepartment(d);
		e.setDepartment(new Department());
		System.out.println("Enter department id");
		e.getDepartment().setDid(sc.nextInt());
		System.out.println("Enter depatrment name");
		e.getDepartment().setDname(sc.next());
		
	}

	public static void main(String[] args) {
		Department d1=new Department(101,"Entc");
		Department d2=new Department(102,"coe");
		Department d3=new Department(103,"me");
		
		Employee e1=new Employee(1,"Arnav",12000,d1);
		Employee e2=new Employee(2,"Nikita",15000,d2);
		Employee e3=new Employee(3,"Swarup",20000,d3);
		Employee e4=new Employee(4,"Swapnali",51000,d1);
		
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		System.out.println(e4);
		
		System.out.println("------------------------------");
		
		Employee e5=new Employee(222,"Athrv",15700,new Department(5,"hr"));
		Employee e6=new Employee(333,"sunita",56200,new Department(6,"hii"));
		Employee e7=new Employee(444,"Susma",45000,new Department(7,"et"));
		System.out.println(e5);
		System.out.println(e6);
		System.out.println(e7);
		
		System.out.println("----------------------------------");
		
		Employee e8=new Employee();
		e8.setEid(108);
		e8.setEname("Amruta");
		e8.setSalary(20000);
		e8.setDepartment(new Department(1,"IT"));
		System.out.println(e8);
		System.out.println("-------------------");
		e5.setEid(555);
		e5.getDepartment().setDname("Entc");
		System.out.println(e5);
		
		System.out.println("-------------------------------------");
		System.out.println(e1.getDepartment().getDname());
		System.out.println(e2.getDepartment().hashCode());
		
		System.out.println("-----------------------------");
		Employee em=new Employee();
		Department dt=new Department();
		enterEmpoyeeDetials(em,dt);
		System.out.println(em);
		System.out.println(dt);
		
	}

}
