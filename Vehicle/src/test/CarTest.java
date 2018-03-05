package test;

import vehicle.Car;
import vehicle.Vehicle;
import vehicle.WheeledVehicle;

public class CarTest {

	public static void main(String[] args) {
		
		Car car = new Car(4,"red");
		car.fuel = 50;
		car.engine = "6V";
				
		System.out.println(car);
		
		WheeledVehicle wheeledVehicle = car;
		System.out.println(wheeledVehicle);
		
		Vehicle vehicle = car;
		System.out.println(vehicle);
	}

}
