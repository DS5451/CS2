/* Author:Damien Sapra
 * Due Date: February 27, 2022
 * Purpose: This program returns the range in a array
 * Credits: I finished this program independently and had no help
 */
package hw5;



public class ArrayRange {
	public static int getRange(int[] a) {
		int range = 0;
		int max = 0;
		int min = a[0];
		
		for (int i = 0; i<a.length; i++) {
			if (a[i]>max) {
				max = a[i];
			}
		}
		
		for (int i = 0; i<a.length; i++) {
			if (a[i]<min) {
				min = a[i];
			}
		}
		
		range = max-min;
		
		return range;
	}
	
	public static void main(String[] args) {
		int[] a = {500,100, 300, 20};

		
		
		System.out.print("For an array: ");
		for (int i = 0; i<a.length;i++) {
			System.out.print(a[i]+" ");
			
	}
		System.out.println("Its range is: "+getRange(a));
		
}
	
	
	
	
	
	
}
