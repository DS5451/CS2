package hw9;

public class IllegalTriangleException extends Exception {

	String msg = "Invalid Triangle";
	public IllegalTriangleException(double side) {
	
		
	}
	
	public String toString() {
		return this.msg;
	}
	

}
