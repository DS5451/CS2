package hw8;
import java.util.ArrayList;
import java.util.Scanner;
public class MyStackTest extends MyStack {
	public static void main(String[] args) {
			MyStack stack1 = new MyStack();
			
		stack1.push("cat");
		stack1.push("car");
		stack1.push(1);

		stack1.push(-10);
			
		
		System.out.println(stack1.toString());
//			
//		Scanner input = new Scanner(System.in);
//		for(int i = 0; i<4; i++) {
//		System.out.println("Enter an Object: ");
//		Object obj = input.nextLine();
//		stack1.push(obj);
//		}
//		
//		
//		
//		
//		
//		ArrayList<Object> objList = stack1.getObject();
//		
		
	}
}
