package hw8;
import java.util.Scanner;
//implement date
public class AccountTest {
public static void main(String[] args) {
	
	
	Checking Checking1 = new Checking("1122",1000,"George",1.5,500);
	Saving Saving1 = new Saving("2233",5000,"George",2.5);
	
for(int i=0; i<1;) {
Scanner input = new Scanner(System.in);
	
	System.out.println("Checking or Saving:");
	String s2 = input.nextLine();
	
	System.out.println("Withdraw/Deposit: ");
	char s1 = input.next().charAt(0);

	System.out.println("The amount: ");
	double s3 = input.nextDouble();
	
	if(s2.equals("Checking")) {
		Checking1.addTransactions(s1, s2, s3, " ");
		if(s1=='W') {
			Checking1.withdraw(s3);
			if(Checking1.getBalance()<Checking1.getOverdraft_limit()) { 
				Checking1.deposit(s3);
				System.out.println("Action not possible: overdraft limit");
			}
		} else if(s1=='D') {
			Checking1.deposit(s3);
		}
	} else if(s2.equals("Savings")) {
		Saving1.addTransactions(s1, s2, s3, " ");
		if(s1=='W') {
			Saving1.withdraw(s3);
		} else if(s1=='D') {
			Saving1.deposit(s3);
		}
	}
	
	input.nextLine();
	
	System.out.println("Would you like to make another transaction? ");
	String t1 = input.nextLine();
	if(t1.equals("no")) {
		i++;
	}
	
}
System.out.println("Checking Account summary: ");
System.out.println(Checking1.getTransactions());


System.out.println("Saving Account summary: ");
System.out.println(Saving1.getTransactions());

}
}