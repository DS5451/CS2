/* Author:Damien Sapra
 * Due Date: March 13, 2022
 * Purpose: This program returns account information
 * Credits: I finished this program independently and had no help
 */
package hw6;

public class Account {
	private String id;
	private double balance;
	private double annualInterestRate;
	private MyDate dateCreated;
	
	public Account() {
		
	}
	
	public Account(String id, double balance, double rate, MyDate date) {
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = rate;
		this.dateCreated = date;
		
	}

	public String getID() {
		return id;
	}

	public double getBalance() {
		return balance;
	}


	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double rate) {
		this.annualInterestRate = annualInterestRate;
	}

	public MyDate getDate() {
		return dateCreated;
	}

	public double getMonthlyInterestRate() {
		double monthly = annualInterestRate/12;
		return monthly;
		
	}
	public double getMonthlyInterest() {
		double monthly = getMonthlyInterestRate()*balance;
		return monthly;
	}
	
	public void withdraw(double amount) {
		if(this.balance-amount>0) {
			this.balance-=amount;}
		 else {
			System.out.println("You do not have enough funds to perform this action");}
	}
	
	public void deposit(double amount) {
			this.balance+=amount;
	}
	public void transfer(Account other, double amount) {
		this.balance-=amount;
		other.balance+=amount;
		
		
	}
	public String toString() {
		String toString = id+" "+Double.toString(annualInterestRate*100)+"% "+Double.toString(balance);
		return toString;
	}
	

}
