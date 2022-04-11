package hw8;

import java.util.Arrays;
import java.util.Date;

public class SortOctagon extends GeometricObject {

	private java.util.Date dateCreated;
	

	public static Octagon[] sort(Octagon[] a) {
		
		Octagon[] s = new Octagon[a.length];
		for(int i = 0; i<a.length; i++) {
			for(int j = 0; j<a.length; j++) {
				int b = a[i].compareTo(a[j]);
				if(b==-11) {
					Octagon higher = a[j];
					a[j] = a[i];
					a[i] = higher;
				} 
				
			}}
		

		return a;
	}
	
	public static void main(String[] args) { 
		Octagon octTest = new Octagon("White", true, 8);
		System.out.println(octTest.getArea());
		Date current = new Date();
		Octagon[] oct = new Octagon[10];
		for(int i = 0; i<oct.length; i++) {
			double sideValue =(Math.random()*49)+1;
			Octagon o = new Octagon("White",true, sideValue);
			oct[i]=o;
		}
		
		Octagon[] a = sort(oct);
		
		for(int i = 0; i<oct.length; i++) {
			System.out.println(a[i]);
			System.out.println(current);
		}
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 0;
	}


}
