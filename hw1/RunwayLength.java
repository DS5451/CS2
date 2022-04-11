/* Author Damien Sapra
 * Due Date: January 30th, 2021
 * Purpose: The purpose of this program is to compute the minimum runway length needed for an airplane to take off
 * Credits: I finished this program mainly by myself but i did use the text book 
 * to understand how to store a user input into the variable.
 */

package hw1;

import java.util.Scanner;

public class RunwayLength {
	public static void main(String[] args) {
		//create  a new instance of the scanner to get user input
		Scanner input = new Scanner(System.in);
		//get user input
		System.out.println("Enter the speed and acceleration: ");
		double vel = input.nextDouble();
		double acc = input.nextDouble();
		//calculate results
		double length = (vel*vel)/(2*acc);
		//display results
		System.out.printf("The minimum runway length for this airplane is: "+"%.2f",length);
		
		
		

	}

}