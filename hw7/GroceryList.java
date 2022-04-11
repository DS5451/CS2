package hw7;

import java.util.ArrayList;

public class GroceryList {
	private ArrayList<GroceryItemOrder> item = new ArrayList<>();
public GroceryList() {
	
}
public void add(GroceryItemOrder item) {
	this.item.add(item);
}

public double getTotalCost() {
	double total = 0;
	for(int i =0; i<item.size();i++) {
			total += item.get(i).getCost();
	}
	return total;
}




}