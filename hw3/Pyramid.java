/* Author:Damien Sapra
 * Due Date: February 13, 2022
 * Purpose: This program creates a pyramid in a specific number pattern with an amount of lines that the user specifies
 * Credits: I finished this program independently and had no help
 */
package hw3;
import java.util.Scanner;

public class Pyramid {	
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			System.out.print("Enter the number of lines from 1 to 15: ");
			int lines = input.nextInt();
			input.close();
			
	 if (lines>=1 && lines<=15) {
			for (int rows = 1; rows <= lines; rows++) {
			for (int b = lines - rows; b >= 1; b--) {
					System.out.print("  ");
				}
				for (int i = rows; i >= 2; i--) {
					System.out.print(i + " ");
				}
				for (int r = 1; r <= rows; r++) {
					System.out.print(r + " ");
				}
				
				System.out.println();
			
			}
//			
} else {
	System.out.println("number is to high");
}
	 }}
	
		
			
	

		
		
	

