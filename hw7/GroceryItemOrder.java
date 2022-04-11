package hw7;

public class GroceryItemOrder {
	private String name;
	private int quantity;
	private double pricePerUnit;
	
	public GroceryItemOrder(String name, int quantity, double pricePerUnit) {
		this.name = name;
		this.quantity = quantity;
		this.pricePerUnit = pricePerUnit;		
		
	}
	
	public void setQuantity(int quantity) {
		this.quantity=quantity;
		
	}
	public int getQuantity() {
		return quantity;
	}
	public double getCost() {
		return pricePerUnit*quantity;
	}
}
