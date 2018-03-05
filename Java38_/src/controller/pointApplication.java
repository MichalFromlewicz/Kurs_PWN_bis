package controller;

import model.Punkt;
import test.PointController;

public class pointApplication {

	public static void main(String[] args) {
		
		Punkt punkt = new Punkt(45, 67);
		System.out.println("Start: "+punkt);
		
		PointController controller = new PointController();
		controller.addX(punkt);
		System.out.println(punkt);
		
		controller.addY(punkt);
		System.out.println(punkt);
		
		controller.miusX(punkt);
		System.out.println(punkt);
		
		controller.miusY(punkt);
		System.out.println(punkt);

	}

}
