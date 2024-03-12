package com.LinkedHasSetDemo;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class EmpLinkedHashSet {

	public static void main(String[] args) {
		LinkedHashSet<Employee>lhs=new LinkedHashSet<>();
		lhs.add(new Employee(101,"Sonali",15000));
		lhs.add(new Employee(105,"suresh",12000));
		lhs.add(new Employee(102,"Amit",20000));
		lhs.add(new Employee(103,"Nilesh",25000));
		lhs.add(new Employee(101,"Sonali",15000));
		
		for(Employee e:lhs) {
			System.out.println(e);
		}
		System.out.println("---------------------");
		Iterator<Employee> itr=lhs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		

	}

}
