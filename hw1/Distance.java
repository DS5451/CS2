/* Author Damien Sapra
 * Due Date: January 30th, 2021
 * Purpose: The purpose of this program is to find the distance between 2 different points that
 * are provided by the user
 *  Credits: I finished this program by myself
 */
package hw1;

import java.util.Scanner;
public class Distance {
	public static void main(String[] args) {
		
		//creating a new instance of Scanner to get user input
		Scanner input = new Scanner(System.in); 
		
		//getting first point from user
		System.out.println("Please enter x1 and y1: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		
		//getting second point from user
		System.out.println("Please enter x2 and y2: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		
		//calculating the distance between the two points
		double x = (x1-x2);
		x = x*x;
		double y = (y1-y2);
		y = y*y;
		double xy = x+y;
		double result = Math.sqrt(xy);
		
		//displaying the distance between the two points to the user
		System.out.printf("The distance between these two points is: "+"%.2f",result);
		
	}

}
