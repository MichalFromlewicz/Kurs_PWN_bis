package vehicle;

public class Car extends WheeledVehicle{

	public String colour;

	

	public Car(int wheels, String colour) {
		super(wheels);
		this.colour = colour;
	}



	@Override
	public String toString() {
		return "Car [colour=" + colour + "]";
	}
	
	
	
}
