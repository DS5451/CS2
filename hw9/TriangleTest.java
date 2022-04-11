package hw9;

public class TriangleTest {
	public static void main(String[] args) {
		try {
			Triangle t1 = new Triangle(3, 3, 9);
			System.out.println(t1);
		} catch (IllegalTriangleException e) {
			
			System.out.println(e);
		}
	}
}
