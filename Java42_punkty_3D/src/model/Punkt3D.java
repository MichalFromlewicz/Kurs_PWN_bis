package model;

public class Punkt3D extends Punkt2D {
	
	private int z;
	
	public Punkt3D() {
		this.z =0;
		super.setX(0);
		super.setY(0);
	}

	public Punkt3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

	public void addZ (int move) {
		this.z += move;
		
	}
	
	public void minusZ(int move) {
		this.z -= move;
		
	}
	
	@Override
	public void addX (int move) {
		System.out.println("Override addX Punkt3D");
		addX(move);	
	}
	
	@Override
	public void minusX(int move) {
		System.out.println("Override minusX Punkt3D");
		super.	minusX(move);	
	}

	@Override
	public String toString() {
		return "Punkt3D [z=" + z + ", getX()=" + getX() + ", getY()=" + getY() + "]";
	}
	
	
	
}
