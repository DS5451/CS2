/* Author Damien Sapra
 * Due Date: January 30th, 2021
 * Purpose: The purpose of this program is to get the subtotal from the user and gratuity rate from the user
 * then returns the amount paid for the gratuity rate as well as the total
 *  Credits: I finished this program by myself
 */
package hw1;

import java.util.Scanner;

public class Tips {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		//getting subototal and gratuity rate from user
		System.out.println("Please enter the subtotal: ");
		double subtotal= input.nextDouble();
		System.out.println("Please enter the gratuity rate: ");
		double tip = input.nextDouble();
		//calculating total
		double tipf = subtotal*(tip/100);
		double total = subtotal + tipf;
		System.out.printf("The gratuity rate is "+"%.2f",tipf);
		System.out.printf(" and your is: "+"%.2f",total);
	
		
	}

}