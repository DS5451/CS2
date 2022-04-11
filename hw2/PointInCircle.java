/* Author:Damien Sapra
 * Due Date: February 6, 2022
 * Purpose: This program will take a pair of coordinates then return whether the point is in a circle or not.
 * Credits: I finished this program independently and had no help
 */
package hw2;
import java.util.Scanner;

public class PointInCircle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter the two coordinates of a point: ");
		
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		input.close();
		
		double radius = 10;
		double x2= 0;
		double y2=0;
		
		double distance = Math.sqrt(((x1-x2)*(x1-x2))+((y1-y2)*(y1-y2)));
		
		if (distance<=radius) {
			System.out.println("Point "+x1+" , "+y1+" is in the circle ");
		} else {
			System.out.println("Point "+x1+" , "+y1+" is not in the circle ");
			
		}
	}

}
