package vehicle;

public class WheeledVehicle extends Vehicle{
	
	public int wheels;

	public WheeledVehicle(int wheels) {
		this.wheels = wheels;
	}



	@Override
	public String toString() {
		return "WheeledVehicle [wheels=" + wheels + "]";
	}
	
	
}
