package test;

import model.Punkt;

public class PointController {

	public void addX (Punkt punkt) {
		punkt.setX(punkt.getX()+1);
	}
	
	public void miusX (Punkt punkt) {
		punkt.setX(punkt.getX()-1);
	}
	
	public void addY (Punkt punkt) {
		punkt.setY(punkt.getY()+1);
	}
	
	public void miusY (Punkt punkt) {
		punkt.setY(punkt.getY()-1);
	}
	
}
