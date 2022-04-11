/* Author:Damien Sapra
 * Due Date: February 13, 2022
 * Purpose: This program plays rock paper scissors until either the user or computer wins three times in a row
 * Credits: I finished this program independently and had no help
 */
package hw3;

public class Game {
	public static void main(String[] args) {

	String userObj = " ";
	String compObj = " ";
	
	int userWins = 0;
	int compWins = 0;
	
	boolean userWin = false;
	boolean compWin = false;
 	
		while (compWins != 3 && userWins != 3) {
			
			if (userWin == true) {
				compWins = 0;
				userWin = false;
			} else if (compWin == true) {
				userWins = 0;
				compWin = false;	
			}
		int userNum = (int) (Math.random()*3);
			int compNum = (int) (Math.random()*3);
			
			if (userNum == 0) {
				userObj = "scissor";
			} else if (userNum == 1) {
				userObj = "rock";
			} else if (userNum == 2) {
				userObj = "paper";
			} 
			

			if (compNum == 0) {
				compObj = "scissor";
			} else if (compNum == 1) {
				compObj = "rock";
			} else if (compNum == 2) {
				compObj = "paper";
			} 
			
	 if (userNum == compNum) {
		System.out.println("You had "+userObj);
		System.out.println("The computer had "+compObj);
		System.out.println("It is a draw");
		
	} else if (userNum == 1 && compNum == 2) {
		System.out.println("You had "+userObj);
		System.out.println("The computer had "+compObj);
		System.out.println("The computer wins!");
		compWins += 1;
		compWin = true;
		
		}  else if (userNum == 0 && compNum == 1) {
		System.out.println("You had "+userObj);
		System.out.println("The computer had "+compObj);
		System.out.println("The computer wins!");
		compWins += 1;
		compWin = true;
		
		} else if (userNum == 2 && compNum == 0) {
		System.out.println("You had "+userObj);
		System.out.println("The computer had "+compObj);
		System.out.println("The computer wins!");
			compWins += 1;
			compWin = true;
		
		} else if (userNum == 2 && compNum == 1) {
			System.out.println("You had "+userObj);
			System.out.println("The computer had "+compObj);
			System.out.println("You win!");
			userWins += 1;
			userWin = true;
		
			}  else if (userNum == 1 && compNum == 0) {
			System.out.println("You had "+userObj);
			System.out.println("The computer had "+compObj);
			System.out.println("You win!");
			userWins += 1;
			userWin = true;
		
			} else if (userNum == 0 && compNum == 2) {
			System.out.println("You had "+userObj);
			System.out.println("The computer had "+compObj);
			System.out.println("You win!");
				userWins += 1;
				userWin = true;
				
				
			} 
	 
	 System.out.println("Game Over!");

	}}}

