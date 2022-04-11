package hw8;


public class Transaction extends Account {
	private char type;
	private String accountType;
	private double amount;
	private String memo;
	private java.util.Date dateCreated;
	
public Transaction(char type, String accountType, double amount, String memo) {
	this.type = type;
	this.accountType = accountType;
	this.amount = amount;
	this.memo = memo;
	
}

public char getType() {
	return type;
}

public void setType(char type) {
	this.type = type;
}

public String getAccountType() {
	return accountType;
}

public void setAccountType(String accountType) {
	this.accountType = accountType;
}

public double getAmount() {
	return amount;
}

public void setAmount(double amount) {
	this.amount = amount;
}

public String getMemo() {
	return memo;
}

public void setMemo(String memo) {
	this.memo = memo;
}

public java.util.Date getDateCreated() {
	return dateCreated;
}

public void setDateCreated(java.util.Date dateCreated) {
	this.dateCreated = dateCreated;
}

public String toString(){
	return type+" "+accountType+" "+amount+" "+memo;
}

}
