package cotainment;

import java.util.Scanner;

public class MyCollege {
	Scanner sc=new Scanner(System.in);
	public void enterStudentDetails(Student s,Course c) {
		System.out.println("Enter Student id");
		s.setSid(sc.nextInt());
		System.out.println("Enter Student Sname ");
		s.setSname(sc.next());
		System.out.println("Enter Student fees");
		s.setMarks(sc.nextDouble());
		
//		Course c=new Course();
//		System.out.println("Enter course id");
//		c.setCid(sc.nextInt());
//		System.out.println("Enter course name");
//		c.setCname(sc.next());
//		System.out.println("Enter course fees");
//		c.setFees(sc.nextDouble());
		
		s.setCourse(c);
		s.setCourse(new Course());
		System.out.println("Enter course id");
		s.getCourse().setCid(sc.nextInt());
		
		System.out.println("Enter course name");
		s.getCourse().setCname(sc.next());
		
		System.out.println("Enter course fees");
		s.getCourse().setFees(sc.nextDouble());
		
	}

public static void main(String[] args) {
	

	      Course c1= new Course(101, "Java", 45000);
	      Course c2= new Course(102,".net", 50000);
	      Course c3= new Course(103, "Python", 47000);

	      Student stud1= new Student(1,"Mandar",95,c1);
	      Student stud2= new Student(2,"Shreyash",89,c2);
	      Student stud3= new Student(3,"Shivani",67,c1);
	      Student stud4= new Student(4,"Amit",90,c2);
	      Student stud5= new Student(5,"Manya",73,c1);
	      Student stud6= new Student(6,"Sumit",57,c3);
	
	
	      System.out.println(stud1);
	      System.out.println(stud2);
	      System.out.println(stud3);
	      System.out.println(stud4);
	      System.out.println(stud5);
	      System.out.println(stud6);
	      System.out.println("--------------------------------------------");
	
	      Student s1= new Student(101, "Gunjan", 78, new Course(1,"Java",45000));
	      Student s2= new Student(101, "Arnav", 48, new Course(2,".net",50000));
		  System.out.println(s1);
		  System.out.println(s2);
		  System.out.println("--------------------------------------------");
		  
		  Student s3= new Student();
			s3.setSid(102);
			s3.setSname("Pravin");
			s3.setMarks(90);
			s3.setCourse(new Course(1,"Java",45000));
			System.out.println(s3);
			System.out.println("--------------------------------------------");
		
	       System.out.println(s1.getCourse().hashCode());
		   System.out.println(s2.getCourse().hashCode());
	       System.out.println("--------------------------------------------");
		
	       System.out.println(stud1.getCourse().hashCode());
		   System.out.println(stud3.getCourse().hashCode());
	       System.out.println("--------------------------------------------");
		
           System.out.println(stud1.getCourse().hashCode());
		   System.out.println(stud3.getCourse().hashCode());
	       System.out.println("-----------------------------------------");
		
	       System.out.println(stud1.getCourse().getFees());
		   System.out.println(stud3.getCourse().getFees());
		   System.out.println("-----------------------------------------");
		
		  //c1.setFees(50000);
          stud1.getCourse().setFees(55000);

		  System.out.println(stud1.getCourse().getFees());
		  System.out.println(stud3.getCourse().getFees());
		
	}

}


