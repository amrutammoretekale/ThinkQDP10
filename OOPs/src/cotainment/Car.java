package cotainment;
//Create a class Car having carNo, brand, model
//every Car is alloted a Driver having driverid, name, adharNo, salary
//We have a Taxi system , Create class where each Car is alloted one driver 
//> Create an anoymous driver which is been alloted to a car for just one day
//> Create 3 car having a driver each (taking user input)
//Print the details of car along with the driver
public class Car {

	private int carno;
	private String brand;
	private double model;
	private Driver driver;
	
	public Car() {
		
	}
	public Car(int carno,String brand,double model,Driver driver) {
		this.carno=carno;
		this.brand=brand;
		this.model=model;
		this.driver=driver;
	}
	public void setCarno(int carno) {
		this.carno=carno;
	} 
	public int getCarno() {
		return carno;
	}
	public void setBrnd(String brand) {
		this.brand=brand;
	}
	public String getBrand() {
		return brand;
	}
	public void setModel(double model) {
		this.model=model;
	}
	public double getModel() {
		return model;
	}
	public void setDriver(Driver driver) {
		this.driver=driver;
	
	}
	public Driver getDriver() {
		return driver;
	}
	public String toString() {
		return "carno:"+carno+" "+"brand:"+brand+" "+"model:"+model+driver;
	}
	

}
