package cotainment;
//Create a class Car having carNo, brand, model
//every Car is alloted a Driver having driverid, name, adharNo, salary
//We have a Taxi system , Create class where each Car is alloted one driver 
//  > Create an anoymous driver which is been alloted to a car for just one day
//  > Create 3 car having a driver each (taking user input)
//Print the details of car along with the driver
public class Driver {
	private int did;
	private String name;
	private long adharno;
	private double salary;
	
	public Driver() {
		
	}
	public Driver(int did,String name,long adharno,double salary) {
		this.did=did;
		this.name=name;
		this.adharno=adharno;
		this.salary=salary;
	}
	public void setDid(int did) {
		this.did=did;
	}
	public int getDid() {
		return did;
	}
	public void setname(String name) {
		this.name=name;;
	}
	public String getname() {
		return name;
	}
	public void setAdharno(long adharno) {
		this.adharno=adharno;
	}
	public long getAdharno() {
		return adharno;
	}
	public void setSalary(double salary) {
		this.salary=salary;
	}
	public double getSalary() {
		return salary;
	}
	public String toString() {
		return "did:"+did+" "+"name"+name+" "+"dharno:"+adharno+" "+"salary:"+salary;
	}
	
		
	}
	
		
	
	
		
	
	
	


