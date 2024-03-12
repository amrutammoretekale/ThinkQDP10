package com.arraylistdemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentArrayList {
	
	public static void main(String[] args) {
		
		List<Student> slist= new ArrayList<>();
		slist.add(new Student(1,"Shreyash",90.5));
		slist.add(new Student(5,"Aman",90.5));
		slist.add(new Student(3,"Rahul",89.3));
		slist.add(new Student(2,"Pravin",89.3));
		slist.add(new Student(6,"Onkar",99.5));
		slist.add(new Student(5,"Rushikesh",93.7));
		
		//System.out.println(slist);
		
		for(Student s:slist)
		{
			System.out.println(s);
		}
		
		Collections.sort(slist);
		System.out.println("---------------------------------------");
		
		for(Student s:slist)
		{
			System.out.println(s);
		}
	}

}
