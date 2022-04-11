/* Author:Damien Sapra
 * Due Date: February 27, 2022
 * Purpose: This program returns the time between a binary and linear search
 * Credits: I finished this program independently and had no help
 */
package hw5;
import java.util.Arrays;

public class ExecutionTime {
	public static int[] getData(){
		int[] data = new int[100000];
		for (int i =0; i<data.length;i++) {
			data[i]+=(int) (Math.random()*1000)+1;
			
		}
		return data;
	}
	
	public static int linearSearch(int[] a, int b) {
		int targetIndex = -1;
		for (int i = 0; i<a.length; i++) {
			if (a[i]==b) {
				targetIndex = i;
				 
			
			}
		
		}
		return targetIndex;
	}
	
	public static int binarySearch(int[] a, int target) {
		Arrays.sort(a);
		int low = 0, high = a.length - 1,mid = 0;
		while (low <= high) {
			mid = (low + high) / 2;
			if (a[mid] > target) {
				high = mid - 1;
			} else if (a[mid] < target) {
				low = mid + 1;
			} else {
				return mid;
			}	
		
		}
		return -1;
	}
		
		

	
	
	public static void main(String[] args) {
		int[] a = getData();
		int target = (int) (Math.random()*1000);
		
		linearSearch(a,target);
		
		binarySearch(a,target);
		
		

		long startTime = System.nanoTime(); 
		long endTime = System.nanoTime();
		long executionTime = endTime - startTime;
		System.out.println("Start time: "+startTime);
		System.out.println("End time: "+ endTime);
		System.out.println("Execution: "+executionTime);
		
		
	}
	
	

}
