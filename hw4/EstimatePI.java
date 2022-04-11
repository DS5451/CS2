/* Author:Damien Sapra
 * Due Date: February 20, 2022
 * Purpose: This program estimates pi
 * Credits: I finished this program independently and had no help
 */
package hw4;
import java.util.Scanner;


public class EstimatePI {

	public static void main(String[]args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Please enter a positive integer: ");
	int userPi = input.nextInt();
	input.close();
	
	System.out.println(estimate(userPi));
}
	public static double estimate(int userPi) {
	double pi = 0;
	for (int i = 1 ; i<=userPi; i++) {
		double one = Math.pow(-1, i+1);
			pi += (one/(2*i-1));
		

	
	}
	
	pi*=4;

	   return pi;

}
}
