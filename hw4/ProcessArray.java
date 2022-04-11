/* Author:Damien Sapra
 * Due Date: February 20, 2022
 * Purpose: This program inserts a value and deletes it from an array
 * Credits: I finished this program independently and had no help
 */
package hw4;

import java.util.Scanner;

public class ProcessArray {
	public static int[] insert(int[] a, int b) {
		
		int[] array1 = new int[a.length+1];
		
		
		for (int i = 0; i<a.length; i++) {
			array1[i] += a[i];
		}
		
		array1[a.length] += b;
		
		return array1;	
	}
	
	public static int[] delete(int[] b, int c) {
		int counter=0;
		for (int i = 0; i<b.length; i++) {
			if (b[i]==c) counter++;	
		}
		int[] array2 = new int[b.length-counter];
//		int[] array2 = new int[b.length-1];
//		
		for (int i = 0, j=0; i<b.length;i++) {
			if (b[i]!=c) {
				array2[j]=b[i];
				j++;
		}	
		}
		return array2;
//		
	}
	public static void display(int[] array) {
		for (int i=0; i<array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		
		
	}
	
	public static void main(String[] args) {
		int[] arrayUser = new int[10];
		for (int i = 0; i<10; i++) {
			int arrayNum = (int)(Math.random()*50)+1;
			arrayUser[i] += arrayNum;
		}
		
		System.out.print("The array is: ");
		display(arrayUser);
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a number to be added into the array: ");
		int userAdd = input.nextInt();
		int[] a = insert(arrayUser,userAdd);
	
		System.out.print("The updated array is: ");
		display(a);
		
		System.out.println("Please enter a number to be deleted from the array: ");
		int userDelete = input.nextInt();
		input.close();
		int[] b = delete(a,userDelete);
		
		System.out.print("The updated array is: ");
		display(b);
		
		
		
		

	}
	
	

}
