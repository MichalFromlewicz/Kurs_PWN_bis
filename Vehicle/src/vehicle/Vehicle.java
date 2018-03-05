package vehicle;

public class Vehicle {

	public String engine;
	
	public double fuel;
	
	public void makeSound() {
		System.out.println("Wrum, wrum");
}
	@Override
	public String toString() {
		return "Vehicle [engine=" + engine + ", fuel=" + fuel + "]";
	}
	
	
}
