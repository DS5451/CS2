package hw8;

public class Saving extends Account {
	public Saving() {
		
	}
	
	public Saving(String id, double balance, String holder_name, double rate) {
		super(id, balance, holder_name, rate);
		
	}

	@Override
	public void withdraw(double amount) {
		if(this.getBalance()-amount>=0) {
			super.withdraw(amount);
		}else {
			System.out.println("You do not have enoug funds to perform this function");
		}
	}
}
