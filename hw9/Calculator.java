package hw9;
import java.util.Scanner;

public class Calculator {

public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Please enter a expression: ");
	String t = input.nextLine();
	
	try {
		double a = Double.parseDouble(t.substring(0, t.indexOf(" ")));
	double b = Double.parseDouble(t.substring(t.indexOf(" ")+3, t.length()));
		double c = 0;
		
	if(t.contains("+")) {
		c = a + b;
	} else if(t.contains("-")) {
		c = a - b;
	} else if(t.contains("*")) {
		c = a *b; 
	}if(t.contains("/")) {
		c = a/b;
	}

	System.out.println(c);
}catch(NumberFormatException e) {
		System.out.println("wrong input: "+ e);
	}
	
	
	input.close();
}
}
