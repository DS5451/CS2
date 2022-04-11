/* Author:Damien Sapra
 * Due Date: February 6, 2022
 * Purpose: This program will calculate the cost of shipping depending on the weight of the package the user enters.
 * Credits: I finished this program independently and had no help
 */
package hw2;
import java.util.Scanner;

public class CostOfShipping {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Please enter the weight of a package: ");
	double weight = input.nextDouble();
	input.close();
	
	if (weight<= 1) {
		System.out.println("The cost of shipping would be: 3.5 dollars");
	} else if (weight>=1 && weight <= 3) {
		System.out.println("The cost of shipping would be: 5.5 dollars");
	} else if (weight>=3 && weight  <=9) {
		System.out.println("The cost of shipping would be: 8.5 dollars");
	} else if (weight>=10 && weight<=20) {
		System.out.println("The cost of shipping would be: 10.5 dollars");
	} else {
		System.out.println("The package cannot be shipped.");
	}
	
	}
}
