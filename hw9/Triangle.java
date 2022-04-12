package hw9;

public class Triangle extends SimpleGeometric {
	private double side1;
	private double side2;
	private double side3;
	private int TriangleNo = 0;
	public Triangle(){
		
	}
	public Triangle(double side1, double side2, double side3) throws IllegalTriangleException {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		
		if(side1+side2<side3) {
			throw new IllegalTriangleException(side3);
		} else if(side2+side3<side1) {

			throw new IllegalTriangleException(side1);
		} else if(side3+side1<side2) {

			throw new IllegalTriangleException(side2);
		}
	}
	public Triangle(String color, boolean filled, double side1, double side2, double side3) {
		super(color, filled);
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	public double[] getSides() {
	double[] sides = {side1, side2, side3};

	return sides;
		
	}
	
	public double getArea() {
		double s = this.getPerimeter(); 
		double area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
		return area;
		
	}
	public double getPerimeter() {
		double per = side1 + side2 + side3;
		return per;
	}
	public String toString() {
		return super.getColor()+" "+super.isFilled()+" "+side1+" "+side2+" "+side3+" "+this.getArea()+" "+this.getPerimeter();
	}
}
