package hw7;

import java.util.ArrayList;
public class ProcessArrayList {
		
		public static void removeAll(ArrayList<Integer> aList, int n ){
			for(int i = 0; i<aList.size(); i++) {
				if(aList.get(i)==n) {
					aList.remove(i);
					i--;
				}
			}
			
		}

		public static void main(String[] args) {
			ArrayList<Integer> intList = new ArrayList<>();
			intList.add(2);
			intList.add(2);
			intList.add(3);
			intList.add(4);
			intList.add(2);
			intList.add(6);
			intList.add(6);
			intList.add(2);
			intList.add(2);
			intList.add(0);
			
			System.out.println("Before removal: " + intList);
			removeAll(intList, 2);
			System.out.println("After removal: " + intList);
		}
	}


