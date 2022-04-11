/* Author:Damien Sapra
 * Due Date: February 13, 2022
 * Purpose: This program will display the longest common prefix of two strings the user enters.
 * Credits: I finished this program independently and had no help
 */
package hw3;

import java.util.Scanner;

public class LongestCommonPrefix {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the first string:");
	System.out.println("Enter the second string: ");
	String string1 = input.nextLine();
	String string2 = input.nextLine();
	input.close();


		 String stringc1 = "";
				for (int b = 0; string1.charAt(b)==string2.charAt(b); b++) {
					if (string1.charAt(b)==string2.charAt(b)) {
					stringc1 += string1.charAt(b);
			}

				
			
		 } 

				if (stringc1.length()>0) {
				System.out.println("The longest common prefix: "+stringc1);
				} else {
					System.out.println("There is no longest common prefix");
				}
	
	
	
	}

}