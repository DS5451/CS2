/* Author:Damien Sapra
 * Due Date: March 13, 2022
 * Purpose: This program returns a rotated array
 * Credits: I finished this program independently and had no help
 */
package hw6;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Scanner;

public class Rotate {
	  public static int[][] rotate(int[][] a){
		      int length = a.length;
		        for (int i = 0; i < length; i++)
		        {
		            for (int j = 0; j < i; j++)
		            {
		                int temp = a[i][j];
		                a[i][j] = a[j][i];
		                a[j][i] = temp;
		            }
		        }
		 
		        for (int i = 0; i <length; i++)
		        {
		            for (int j = 0; j < length / 2; j++)
		            {
		                int temp = a[i][j];
		                a[i][j] = a[i][length - j - 1];
		                a[i][length - j - 1] = temp;
		            }
		        }
		        return a;
		    }
		 
	        
	    
		    
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the length and width of array: ");
		int N = input.nextInt();
		int[][] user = new int[N][N];
		
		System.out.println("Enter a number: ");
		for(int i = 0; i<user.length; i++) {
			for(int j = 0; j<user.length; j++) {
				int userNum = input.nextInt();
				user[i][j] = userNum;
			}
		}
		
		int[][] b = rotate(user);
		for (int row=0; row<b.length; row++) {
			// matrix[row] is a 1D array
			System.out.println(Arrays.toString(b[row]));
		}	
		}
	}

