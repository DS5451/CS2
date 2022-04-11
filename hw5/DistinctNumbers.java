/* Author:Damien Sapra
 * Due Date: February 27, 2022
 * Purpose: This program returns all distinct numbers in a sequence
 * Credits: I finished this program independently and had no help
 */
package hw5;
import java.util.Scanner;
public class DistinctNumbers {
	public static int[] getDistinctNumber() {
		//Getting user input
		Scanner input = new Scanner(System.in);
		int[] userArray = new int[10];

		System.out.println("Please enter 10 Numbers: ");
		for (int i =0, z=0; i<userArray.length;i++) {
		int userNum = input.nextInt();
		
		boolean distinctC = true;
		
		for (int j = 0; j < userArray.length; j++) {
			if (userNum == userArray[j]) {
				distinctC = false;
			}
			
			}
		if (distinctC == true) {
			userArray[z]+=userNum;
			z++;
		}
		
		}
		input.close();
		int distinctL = 0;
		for (int i = 0; i<userArray.length;i++ ) {
			if (userArray[i]>0) {
				distinctL++;
			}
		}
		int[] distinctArray = new int[distinctL];
		
		for (int i = 0, j=0; i<userArray.length;i++ ) {
			if (userArray[i]>0) {
				distinctArray[j]+=userArray[i];
				j++;
			}
		}
		
		
	return distinctArray;}
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		int[] a = getDistinctNumber();
		System.out.println("There are "+a.length+" distinct numbers");
		System.out.print("They are: ");
		for (int i = 0; i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		
	}



}
