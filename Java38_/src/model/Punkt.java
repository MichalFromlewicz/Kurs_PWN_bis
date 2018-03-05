package model;

public class Punkt {
	
	private int x;
	
	private int y;
	
	public Punkt() {
		this.x=0;
		this.y=0;
	}
	
// generator Constructor using fields
	public Punkt(int x, int y) {
		this.x = x;
		this.y = y;
	}

// generator getters and setters
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

// generate toString
	@Override
	public String toString() {
		return "Punkt [x=" + x + ", y=" + y + "]";
	}

}
