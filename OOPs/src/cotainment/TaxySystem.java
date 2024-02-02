package cotainment;

import java.util.Scanner;

public class TaxySystem {
	Scanner sc=new Scanner(System.in);
	public void EnterCarDetails(Car c,Driver d) {
		System.out.println("Enter Car no:");
		c.setCarno(sc.nextInt());
		System.out.println("Enter Brand:");
		c.setBrnd(sc.next());
		System.out.println("Enter model:");
		c.setModel(sc.nextDouble());
		
		System.out.println("Enter Driver id");
//		d.setDid(sc.nextInt());
//		System.out.println("Enter driver name:");
//		d.setname(sc.next());
//		System.out.println("Enter Adhar no");
//		d.setAdharno(sc.nextLong());
//		System.out.println("Enter salary");
//		d.setSalary(sc.nextDouble());
		
	    c.setDriver(d);
	    c.setDriver(new Driver());
	    System.out.println("Enter driver id:");
		c.getDriver().setDid(sc.nextInt());
	
	    System.out.println("Enter driver name:");
	    c.getDriver().setname(sc.next());
		
		System.out.println("Enter Adharno:");
		c.getDriver().setAdharno(sc.nextInt());
		
		System.out.println("Enter salary:");
		c.getDriver().setSalary(sc.nextDouble());
		
		
	}

	public static void main(String[] args) {
		Driver d1=new Driver(101,"Sunil",1012547145,10000);
		Driver d2=new Driver(102,"Nitin",789654123,15000);
		Driver d3=new Driver(101,"Amol",256314000,12000);
		
		Car c1=new Car(101,"bmw",2023,d1);
		Car c2=new Car(108,"Whagnor",2022,d3);
		Car c3=new Car(118,"maruti",2000,d2);
		Car c4=new Car(128,"kiya",2001,d3);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println("--------------------------------");
		
		TaxySystem s1=new TaxySystem();
		
		Car c5=new Car();
		Driver d7=new Driver();
		s1.EnterCarDetails(c5,d7);
		System.out.println(c5);
		System.out.println(d7);
		

	}

	
		
	}


