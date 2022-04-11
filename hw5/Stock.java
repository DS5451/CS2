/* Author:Damien Sapra
 * Due Date: February 27, 2022
 * Purpose:This program returns the maximum profit that could be made from a stock
 * Credits: I finished this program independently and had no help
 */
package hw5;
import java.util.Scanner;
public class Stock {
	public static int[] getData() {
		int[] array = new int[10];
		Scanner input = new Scanner(System.in);		
		System.out.println("Please enter 10 stock prices: ");
		for (int i = 0; i<array.length; i++) {
			int userNum = input.nextInt();
			array[i]+=userNum;
		}
		
		return array;
	}
	public static int maxProfit(int[] a) {
		int max = 0;
		int maxcounter = 0;
		
		for (int i =0; i<a.length-1; i++) {
			if (a[i]<a[i+1]) {
				max += a[i+1]-a[i];
			}
		}
		
		return max;
		
	}
	
	
	public static void main(String[] args) {
		int[] a = getData();
		System.out.println(maxProfit(a));
	}

}
