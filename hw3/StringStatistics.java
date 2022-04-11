/* Author:Damien Sapra
 * Due Date: February 13, 2022
 * Purpose: This program returns statistics about a string that the user enters
 * Credits: I finished this program independently and had no help
 */
package hw3;

import java.util.Scanner;
public class StringStatistics {
	public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in);
	System.out.println("Please enter a string: ");
	String user = input.nextLine();
	input.close();

	int firstL = (int)user.charAt(0);
	System.out.println("The ASCII value of the first letter is "+firstL);
	
	int numcounter = 0;
	int charcounter = 0;
	int ecounter = 0;
	
	for (int i = 0; i<user.length();) {
		if (user.charAt(i) >= 65 && user.charAt(i) <= 90 || user.charAt(i) >= 97 && user.charAt(i) <= 122 ) {
			charcounter += 1;
			
			i++;
		} else {
			i++;
		}
	}
	System.out.println("The are "+charcounter+" alphabetical letters");
	
	for (int b=0; b<user.length();) {
		if (user.charAt(b) >= 48 && user.charAt(b)<= 57) {
			numcounter += 1;
			b++;
		} else {
			b++;
		}
		
	}

	System.out.println("There are "+numcounter+" digital letters.");
//	for (int i = 0; i<user.length();) {
//		if (user.charAt(i) >= 65 && user.charAt(i) <= 90 || user.charAt(i) >= 97 && user.charAt(i) <= 122 ) {
//			charcounter += 1;
//			
//			i++;
//		} else {
//			i++;
//		}
//	}
//	System.out.println("The are "+charcounter+" alphabetical letters");
	
	int uppercasecount = 0;
	for (int i = 0; i<user.length();) {
		if (user.charAt(i) >= 65 && user.charAt(i) <= 90 ) {
			 uppercasecount += 1;
			 i++;
			
		} else {
			i++;	
	}	
	}
	
	System.out.println("There are "+uppercasecount+" upper case letters.");
	
	int lowercasecount = 0;
	for (int i = 0; i<user.length();) {
		if (user.charAt(i) >= 97 && user.charAt(i) <= 122) {
			 lowercasecount += 1;
			 i++;
			
		} else {
			i++;	
	}	
	}
	
	System.out.println("There are "+lowercasecount+" lower case letters.");
	
	for (int b=0; b<user.length();) {
		if (user.charAt(b) == 101) {
			ecounter += 1;
			b++;
		} else {
			b++;
		}
		
	}
	System.out.println("There are "+ecounter+" 'e's in the string.");
	if (user.charAt(0) == 65) {
	System.out.println("The string initiates iwith 'A'");	
		
		
	} else {
		System.out.println("The string does not initiate with 'A'");
	}
	String tion = "tion";
	if (user.contains(tion)) {
		System.out.println("It contains a substring as 'tion'");
		
	} else {
		System.out.println("It does not contain a substring as tion.");
	
	}
	}
}
