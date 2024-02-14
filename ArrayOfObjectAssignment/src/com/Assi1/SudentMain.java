package com.Assi1;
//Create a class Student having id,name, array of marks
//and percentage
//Create a method to calculate percentage
//from the marks
//Create 5 object of this class anonymously.
//Display the student details containing id,name and percentage



public class SudentMain {
     static void findpercentage(Student st[]) {
    	  
         
     } 


	public static void main(String[] args) {
		Student stud[]=new  Student[5];
		 stud[0]=new Student(101,"Aranv",new Double[]{98.5,58.10,75.2,45.3});
		 stud[1]=new Student(102,"Ankita",new Double[]{56.2,78.0,77.2,89.2});
		 stud[2]=new Student(103,"Amruta",new Double[]{58.8,56.7,98.7,65.2});
		 stud[3]=new Student(104,"Arjun",new Double[]{56.2,88.5,86.7,59.1});
		 

			stud[4]= new Student();
			stud[4].setId(104);
			stud[4].setName("Meera");
			stud[4].setMarks(new Double[] {89.6,45.3,90.3});
			
			for(Student s:stud)
			{
				System.out.println(s);
			}
			
			
			
		
			

	}

}
