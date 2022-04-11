package hw6;

public class MyDate_test {
	public static void main(String[] args) {
		MyDate d1 = new MyDate(2020, 10, 16);
		MyDate d2 = new MyDate(2020,10, 26);

		d1.addDays(20);
		System.out.println(d1);
		

	}

}
