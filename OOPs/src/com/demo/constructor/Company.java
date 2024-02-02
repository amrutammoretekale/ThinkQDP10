package com.demo.constructor;

  class Employee1{
	 private int id;
	 private String name;
	 private double salary;
	
  
  Employee1() {
	  System.out.println("default consructor");
	  System.out.println(id);
	  System.out.println(name);
	  System.out.println(salary);
  }
  Employee1(int id,String name,double salary) {
	  this();
	  System.out.println("para consructor e1");
	  this.id=id;
	  this.name=name;
	  this.salary=salary;
	  System.out.println(this.id);
	  System.out.println(this.name);
	  System.out.println(this.salary);
  }
   Employee1(int id,String name) {
	   System.out.println("para consructor e2");
	  this.id=id;
	  this.name=name;
	  this.salary=0.0;
  }
   Employee1(int id,double salary,String name) {
	   System.out.println("para consructor e3");
	      this.id=id;
		  this.name=name;
		  this.salary=salary;
    }
   public void setEmployeeid(int id) {
		 this.id=id;
	 }
	 public int getid() {
		 return id;
	 }
	 
    public String toString() {
	   return "Employee:"+id+" "+name+" "+salary;
    }
  
   }
  


   public class Company {
	   

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee1 e1=new Employee1();
		System.out.println(e1);
		
		Employee1 e2=new Employee1(101,"arnav",1000);
		System.out.println(e2);
		

		Employee1 e3=new Employee1(102,"amruta");
		System.out.println(e3);
		
		
		
		}

		
   }


