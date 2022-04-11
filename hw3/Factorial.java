/* Author:Damien Sapra
 * Due Date: February 13, 2022
 * Purpose: This program will calculate the factorial of a number the user enters.
 * Credits: I finished this program independently and had no help
 */
package hw3;

import java.util.Scanner;
public class Factorial {
	public static void main(String[] args) {
 	Scanner input = new Scanner(System.in);
 	System.out.println("Please enter a number: ");
 	int factorial = input.nextInt();
 	input.close();
 	
 	
 	long factorialc = 1;
 if (factorial>=0) {
 	for (int i=1; i<=factorial;) {
 		factorialc*=i;
 		i++;
 	
 	}
 	System.out.println(factorialc);
 	} else {
 		System.out.println("Negative numbers have no factorials.");
 	}
 	}
	}

