package com.demo.constructor;
//
    public class Employee {
	
	   private int eid;
	   private String ename;
	   private double esal;
	   
	 public Employee() {
		 System.out.println("default constructor");
		 }   
	 public Employee(int cid) {
		 System.out.println("parameterized cons");
	 }
	 public Employee(int eid,String name) {
		 System.out.println("p2");
		 
	 }
	
	
	
	

}
