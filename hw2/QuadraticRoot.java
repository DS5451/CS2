/* Author:Damien Sapra
 * Due Date: February 6, 2022
 * Purpose: This program will calculate how many roots are in a quadratic equation and what they are.
 * Credits: I finished this program independently and had no help
 */
package hw2;

import java.util.Scanner;

public class QuadraticRoot {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a, b , c: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		input.close();
		
		double disc = (b*b)-4*(a*c);
		
		if (disc>0) {
			double r1 = -1*(b)-(Math.sqrt((b*b)-4*(a)*(c)));
			r1 /= 2*a;
			double r2 =  -1*(b)+(Math.sqrt((b*b)-4*(a*c)));
			r2 /= 2*a;

			System.out.println("There are two roots: "+r1+" "+r2);		
			
		} else if (disc == 0) {
			
			double r1 = -1*(b)-(Math.sqrt((b*b)-4*(a)*(c)));
			r1 /= 2*a;
			
			
			System.out.println("There is one root: "+r1);
			
			
			
		} else if (disc<0) {
		System.out.println("There are no roots");
		
		
	}
	

}
}