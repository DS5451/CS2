package hw7;

public class GroceryTest {
	public static void main(String[] args) {
		GroceryItemOrder apple = new GroceryItemOrder("Blueberry", 10, 4.99); 
		GroceryItemOrder orange = new GroceryItemOrder("Orange", 7, 3.99);
		GroceryList l1 = new GroceryList();
		System.out.println(apple.getCost());
		System.out.println(l1.getTotalCost());		
		
	}
}
