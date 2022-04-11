package hw8;
//finish test program
import java.util.ArrayList;


public class Account {
	private String id;
	private String holder_name;
	private double balance;
	private double annualRate;
	private ArrayList<Transaction> transactions = new ArrayList<>();
	
public Account() {
	
}

public Account(String id, double balance, String holder_name, double rate) {
	this.id = id;
	this.balance = balance;
	this.holder_name = holder_name;
	this.annualRate = rate;

	transactions = new ArrayList<>(1);
}

public String getID() {
return id;	
}

public double getBalance() {
	return balance;
}

public String getHolder() {
	return holder_name;
}

public void withdraw(double amount) {
	balance -= amount;
	
}

public void deposit(double amount) {
	balance += amount;
}

public String getTransactions() {
	String a = "";
	for(int i = 0; i<transactions.size(); ) {i++;
		a += transactions.get(i);

		return a;
	}

	return "";
}

public void addTransactions(char type, String accountType, double amount, String memo) {


		Transaction T = new Transaction(type,accountType,amount,memo);
		transactions.add(T);
	
	
	}


public String toString() {
	String toString = id+" "+holder_name+" "+annualRate+" "+balance;
	return toString;
}
}
