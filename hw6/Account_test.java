package hw6;

public class Account_test {
public static void main(String[] args) {

	MyDate d1 = new MyDate(2020, 10, 17);
	Account account1 = new Account("1122", 20000, .045, d1);
	Account account2 = new Account("1122", 20000, .045, d1);
	
	account2.transfer(account1, 200);
	System.out.println(account1.getBalance());
	
	System.out.println(account1.getID());
	
	
}
}
