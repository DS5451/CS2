/* Author:Damien Sapra
 * Due Date: February 20, 2022
 * Purpose:This program checks if a credit card number is valid
 * Credits: I finished this program independently and had no help
 */
package hw4;

import java.util.Scanner;

public class CreditCard {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Please enter a credit card number ");
	String number = input.nextLine();
	input.close();
	
	if (isValid(number)==true) {
		System.out.println(number+ " Is valid ");
	} else if (isValid(number)== false) {
		System.out.println(number+ " is Not valid");
		
	}
	
	
	}
	
	public static boolean isValid(String number) {
	
		
		boolean valid = false;
		int m10 = sumOfDoubleEvenPlace(number)+sumOfOddPlace(number);
		
		if (prefixMatched(number)==true && m10%10==0) {
			
			valid = true;
		} 
		
		
		return valid;
	} 
	
		public static int sumOfDoubleEvenPlace(String number) {
			int evenPlace = 0;
			int sum = 0;

			for (int i = number.length()-1; i>=0;i--) {
				if (i%2==0) {

					evenPlace = Integer.parseInt(number.charAt(i)+"");
					evenPlace *=2;
				if (evenPlace <=9) {
					sum+=evenPlace;
					evenPlace=0;
					
				} else {
					sum += getDigit(evenPlace);
					evenPlace=0;
				}
				
				
				
				}
			}
		
			return sum;
		}
		
		public static int getDigit(int number) {

			if (number<=9) {
				return number;
			
			}else { 
				return number % 10 + number / 10;
			
		}} public static int sumOfOddPlace(String number) {

			int oddPlace = 0;
			int sum = 0;

			for (int i = number.length()-1; i>=0; i-=2) {
					oddPlace = Integer.parseInt(number.charAt(i)+"");
				sum+=oddPlace;
				oddPlace=0;
			} 
			return sum;
			
			}

		public static boolean prefixMatched(String number) {
	boolean prefixMatch = false;
	
			if (number.charAt(0)=='4') {
				prefixMatch=true;
				
			} else if (number.charAt(0)=='3' && number.charAt(1)=='7') {
				prefixMatch = true;
				
				
			} else if (number.charAt(0)=='5') {
				prefixMatch = true;

			
		} else if (number.charAt(0)=='6') {
			prefixMatch=true;
			
		}
			return prefixMatch;
		}
		
		
		
}
	