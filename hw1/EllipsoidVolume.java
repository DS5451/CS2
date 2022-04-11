/* Author Damien Sapra
 * Due Date: January 30th, 2021
 * Purpose: The purpose of this program is to calculate the volume of an Ellipsoid and display it
 * Credits: I finished this program on my own
 */

package hw1;

public class EllipsoidVolume {
	public static void main(String[] args) {
		//declare variables
		double PI = Math.PI;
		double fraction = 4.0/3;
		double volume;
		double axis1 = 10.5;
		double axis2 = 8.6;
		double axis3 = 5.7;
		//calculate the volume
		volume = fraction*PI*axis1*axis2*axis3;
		//display results
		System.out.printf("The volume for the ellpisoid with the axis's of "+axis1+", "+axis2+", and "+axis3+" is: "+"%.2f",volume);
		
		
	}
}
