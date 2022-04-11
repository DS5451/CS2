package hw8;

public class Octagon extends GeometricObject {
	private double side;
	private String color;
	private boolean filled;

	public Octagon(double side) {
		this.side = side;
	}
	
	public Octagon(String color, boolean filled, double side) {
		this.color = color;
		this.filled = filled;
		this.side = side;
	}
	
	public double getPerimeter() {
		return side*8;
	}
	
	public double getArea() {
		double area = (2*(1+Math.sqrt(2))*side*side);
		return area;
	}
	
	public String toString() {
		return color+" "+filled+" "+side;
	}
	public int compareTo(Octagon other) {
		if(this.getArea()>other.getArea()) {
		return 1;} 
		else if(this.getArea()<other.getArea()) {
			return -1;
		} else {
			return 0;
		}
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	
}
