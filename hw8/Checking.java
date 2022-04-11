package hw8;

import java.util.Date;

//implementation of overdraft?
public class Checking extends Account {
	private double overdraft_limit;

	public Checking() {
		
	}
	
	public Checking(String id, double balance, String holder_name, double rate, double overdraft_limit) {
		super(id, balance, holder_name, rate);
		this.overdraft_limit = overdraft_limit;
		
	}

	@Override
	public void withdraw(double amount) {
		if(this.getBalance() - amount >= (0- overdraft_limit)) {
		super.withdraw(amount);
	}else {
		System.out.println("Withdrawal is over overdraft");
	}
		
		
		}
	public double getOverdraft_limit() {
		return overdraft_limit;
	}

	public void setOverdraft_limit(double overdraft_limit) {
		this.overdraft_limit = overdraft_limit;
	}
	
}
