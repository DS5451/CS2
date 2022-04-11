package hw8;

import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;

public class SortMovie extends Movie implements Comparable<Movie> {
	


public SortMovie(String name, int year, double rating) {
		super(name, year, rating);
		// TODO Auto-generated constructor stub
	}

public static ArrayList<Movie> sortByName(ArrayList<Movie> mov){

	for(int i =0; i<mov.size(); i++) {
		for(int j = 0; j<mov.size(); j++) {
		int a = mov.get(i).compareTo(mov.get(j));
		if(a==-1) {
			Movie temp = mov.get(i);
			mov.set(i, mov.get(j));
			mov.set(j, temp);
			
		}
	}
		}
	
	return mov; 
}

public static ArrayList<Movie> sortByYear(ArrayList<Movie> mov){

	 for(int i = 0; i<mov.size(); i++) {
		 YearCompare y1 = mov.get(i).new YearCompare();
		 for(int j = 0; j<mov.size(); j++) {
			 int a = y1.compare(mov.get(i), mov.get(j));
			 if(a==1) {
				 Movie temp = mov.get(i);
					mov.set(i, mov.get(j));
					mov.set(j, temp);
			 }
		 }
	 }
	return mov;
}

public static ArrayList<Movie> sortByRating(ArrayList<Movie> mov) {
	
	 for(int i = 0; i<mov.size(); i++) {
		 RatingCompare r1 = mov.get(i).new RatingCompare();
		 for(int j = 0; j<mov.size(); j++) {
			 int a = r1.compare(mov.get(i), mov.get(j));
			 if(a==1) {
				 Movie temp = mov.get(i);
					mov.set(i, mov.get(j));
					mov.set(j, temp);
			 }
		 }
	 }
	return mov;
}


public static void main(String[] args) {
	Movie Mov = new Movie("Turtles", 2022, 7.6);
	Movie Mov1 = new Movie("Airplane", 1989, 5.4);
	Movie Mov2 = new Movie("Frog Life", 2003, 3.2);
	Movie Mov3 = new Movie("Trucks", 2005, 4.1);
	Movie Mov4 = new Movie("Midgets", 1988, 1.2);
	Movie Mov5 = new Movie("Titanic", 1997, 10);
	Movie Mov6 = new Movie("Spider Man", 2018, 9.8);
	Movie Mov7 = new Movie("Avengers", 2007, 8.5);
	Movie Mov8 = new Movie("Cars", 2001, 5.9);
	Movie Mov9 = new Movie("Zebras", 2018, 6.2);
	Movie Mov10 = new Movie("Avengers 2", 2010, 8.9);

	ArrayList<Movie> mov = new ArrayList<Movie>();

	mov.add(Mov);
	mov.add(Mov1);
	mov.add(Mov3);
	mov.add(Mov4);
	mov.add(Mov5);
	mov.add(Mov6);
	mov.add(Mov7);
	mov.add(Mov8);
	mov.add(Mov9);
	mov.add(Mov10);
	
	sortByName(mov);
	
	System.out.println("Alphabetically Sorted: ");
	String str = "";
	for(int i = 0; i<mov.size(); i++) {
		str += mov.get(i);
	}
	
	System.out.println(str);

	sortByYear(mov);
	System.out.println("Sorted by year: ");
	String str1 = "";
	for(int i = 0; i<mov.size(); i++) {
		str1 += mov.get(i);
	}
	
	System.out.println(str1);
	
	sortByRating(mov);
	System.out.println("Sorted by rating: ");
	String str2 = "";
	for(int i = 0; i<mov.size(); i++) {
		str2 += mov.get(i);
	}
	
	System.out.println(str2);
	

}



}
