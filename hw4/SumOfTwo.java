/* Author:Damien Sapra
 * Due Date: February 20, 2022
 * Purpose: takes 8 numbers in array from the user and tells the user what numbers at what indexes will add up to the target number
 * Credits: I finished this program independently and had no help
 */
package hw4;

import java.util.Scanner;

public class SumOfTwo {
	
	
	public static int[] sumOfTwo(int[] a, int b) {
	int[] targetArray = new int[2];
	
	for (int i = 0; i < a.length; i++) {
        int rem = b - a[i];
        for (int j = i + 1; j < a.length; j++) {
          if (a[j] == rem) {
        	  targetArray[0]=i;
        	  targetArray[1]=j;
          } 
		}
	}
       if (targetArray[0]==0 && targetArray[1]==0) {
      	  targetArray[0]=-1;
      	  targetArray[1]=-1;
        }
		

	for (int i = 0; i<targetArray.length;i++) {
		System.out.print(targetArray[i]+" ");
	
		
		
	}

	return targetArray;
	
	}
		

	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] a = new int[8];
		
		for (int i = 0; i<a.length; i++) {
		System.out.println("Please enter 8 numbers to create an array: ");
		int num = input.nextInt();
		a[i]=num;
		
		}
		
		
		System.out.println("The content of the array is: ");
		for (int i = 0; i<a.length;i++) {
			System.out.print(a[i]+" ");
			
		}
		System.out.println();
		
		
		System.out.println("Enter a target number: ");
		int target = input.nextInt();
		System.out.print("The two elements that add up to "+target+" are at indexes: ");
		sumOfTwo(a,target);
		
		input.close();
		
		
	}
	}