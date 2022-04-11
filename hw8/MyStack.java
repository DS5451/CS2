package hw8;
//write test program
import java.util.ArrayList;

public class MyStack {

	private ArrayList<Object> object = new ArrayList<Object>();
	public MyStack() {
	}
		
	
	
	public ArrayList<Object> getObject() {
		return object;
	}



	public void setObject(ArrayList<Object> object) {
		this.object = object;
	}



	public void push(Object a) {
		object.add(a);
		
	}
	public Object pop() {

		Object a = object.get(object.size()-1); 
		object.remove(object.size()-1); 
		return a;
		
	}
	
	public Object peek() {
		return object.get(object.size()-1);
	}
	
	public int getSize() {
		return object.size();
	}
	public boolean empty() {
		if(object.size()==0) {

			return true;
		}
		return false;
	}
	
	public String toString() {
		String toString = "";
		ArrayList<Object> objectRev = new ArrayList<Object>();
		for(int i = this.getSize()-1; i>= 0; i--) {
			objectRev.add(object.get(i));
			
		}
		
		for(int i = 0; i<objectRev.size(); i++) {
			toString += objectRev.get(i);
			toString += " ";
		}
		
		return toString;
	}
	}

