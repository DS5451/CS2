/* Author:Damien Sapra
 * Due Date: February 27, 2022
 * Purpose: This program returns the max total in a substring
 * Credits: I finished this program independently and had no help
 */
package hw5;

import java.util.Scanner;

public class MaxSubSum {
		public static int[] getData() {
			Scanner input = new Scanner(System.in);
			System.out.println("How many integers do you want to enter? ");
			int length = input.nextInt();
			
			int[] a = new int[length];
			System.out.print("Please enter " + length + " integers: ");
			for (int i = 0; i<a.length; i++) {
				int num = input.nextInt();
				a[i] += num;
			}
			
			
			
			return a;
		}

		public static int getMaxSubSum(int[] a) {
		
	    int max= 0;

	    for (int i = 0; i < a.length; i++) {
	        int counter = 0;
	        for (int j = i; j < a.length; j++) {
	           counter += a[j];
	 
	            if (counter > max) {
	                max = counter;
	            }
	        }
	        }
	    return max;
	}
		 
		 public static void main(String[] args) {
			 int[] a = getData();
			 System.out.println(getMaxSubSum(a));
		 }
	}

