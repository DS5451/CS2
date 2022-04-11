/* Author:Damien Sapra
 * Due Date: February 6, 2022
 * Purpose: This program will randomly generate a license plate
 * Credits: I finished this program independently and had no help
 */
package hw2;

public class VehiclePlate {
	public static void main(String[] args) {

	 char letter1 = (char)((int)(Math.random()*(26)+'A'));
	 char letter2 = (char)((int)(Math.random()*(26)+'A'));
	 char letter3 = (char)((int)(Math.random()*(26)+'A'));

	
	int num1 = (int)(Math.random()*10);
	int num2 = (int)(Math.random()*10);
	int num3 = (int)(Math.random()*10);
	int num4 = (int)(Math.random()*10);
	
	System.out.println(letter1+""+letter2+""+letter3+""+num1+""+num2+""+num3+""+num4);
}
}