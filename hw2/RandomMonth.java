/* Author:Damien Sapra
 * Due Date: February 6, 2022
 * Purpose: This program will randomly generate a number then return the corresponding month associated with that number.
 * Credits: I finished this independently for the most part except for when I used the textbook to understand how to randomly
 * generate a number.
 */
package hw2;

public class RandomMonth {
	public static void main(String[] args) {
	int randnumber = (int)(Math.random()*12)+1;
	System.out.println("The random number generated is "+randnumber);
	
	switch(randnumber) {
	case 1:
		System.out.println("The corresponding month is January");
		break;
	case 2:
		System.out.println("The corresponding month is Febuary ");
		break;
	case 3:
		System.out.println("The corresponding month is March");
		break;
	case 4:
		System.out.println("The corresponding month is April");
		break;
	case 5:
		System.out.println("The corresponding month is May");
		break;
	case 6:
		System.out.println("The corresponding month is June");
		break;
	case 7:
		System.out.println("The corresponding month is July");
		break;
	case 8:
		System.out.println("The corresponding month is August");
		break;
	case 9:
		System.out.println("The corresponding month is September");
		break;
	case 10:
		System.out.println("The corresponding month is October");
		break;
	case 11:
		System.out.println("The corresponding month is November");
		break;
	case 12:
		System.out.println("The corresponding month is December");
		break;
	default:
		System.out.println("Not a valid number");
		
	
	}
	
	}
}