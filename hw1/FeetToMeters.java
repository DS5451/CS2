/* Author Damien Sapra
 * Due Date: January 30th, 2021
 * Purpose: The purpose of this program is to take a in feet and convert it to meters.
 *  Credits: I finished this program by myself
 */

package hw1;

import java.util.Scanner;

public class FeetToMeters {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//Getting user input
		System.out.println("Please enter a value for feet: ");
		double ft = input.nextDouble();
		//calculating conversion
		double meters = ft*0.305;
		//displaying results
		System.out.printf(ft+" feet is "+"%.2f",meters);
		System.out.print(" meters");
		
		
		
	}
	
}