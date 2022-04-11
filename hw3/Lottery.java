/* Author:Damien Sapra
 * Due Date: February 13, 2022
 * Purpose: This program randomly generates lottery numbers
 * Credits: I finished this program independently and had no help
 */
package hw3;

public class Lottery {
	public static void main(String[] args) {
		 int letter1 = (int)(Math.random()*10);

		 int letter2;
		System.out.println("The first number is "+letter1);
	do {


		 letter2 = (int)(Math.random()*10);

		
		
	} while (letter1==letter2);

	System.out.println("The second number is "+letter2);

	

}
}