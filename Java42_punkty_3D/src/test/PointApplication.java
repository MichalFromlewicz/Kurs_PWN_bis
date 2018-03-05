package test;

import model.Punkt2D;
import model.Punkt3D;

public class PointApplication {

	public static void main(String[] args) {
		
		Punkt2D p2d = new Punkt2D(45, 67);
		Punkt3D p3d = new Punkt3D(10,20,30);
		
		System.out.println(p2d);
		System.out.println(p3d);
		
		p2d.addX(5);
		p2d.minusX(7);
		System.out.println(p2d);
		
		p3d.minusZ(5);
		p3d.minusX(1);
		p3d.addY(3);
		System.out.println(p3d);
		
		Punkt2D p2d2 = new Punkt2D(43,67);
		System.out.println("Czy p2d = p2d2?" + p2d.equals(p2d2));
		System.out.println("p2d hash code: " + p2d.hashCode());
		System.out.println("p2d2 hash code: " + p2d2.hashCode());
		
	}

}
