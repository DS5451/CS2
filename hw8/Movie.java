package hw8;

import java.util.Comparator;


public class Movie implements Comparable<Movie> {
private String name;
private int year;
private double rating;

public Movie(String name, int year, double rating) {
	this.name = name;
	this.year = year;
	this.rating = rating;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getYear() {
	return year;
}

public void setYear(int year) {
	this.year = year;
}

public double getRating() {
	return rating;
}

public void setRating(double rating) {
	this.rating = rating;
}

public String toString() {
	
	return name+" "+year+" "+rating+" ";
}

public int compareTo(Movie other) {
	char thisC = this.name.charAt(0);
	char otherC = other.name.charAt(0);
	if(thisC<otherC) return 1;
	else if(thisC>otherC) return -1;
	else return 0;
	
}

class YearCompare implements Comparator<Movie>{
@Override
	public int compare(Movie m1, Movie m2) {
		int thisY = m1.getYear();
		int otherY = m2.getYear();
		if(thisY>otherY) return 1;
		else if(thisY<otherY) return -1;
		else return 0;
	}
}

class RatingCompare implements Comparator<Movie> {
@Override
public int compare(Movie m1, Movie m2) {
		double thisR = m1.getRating();
		double otherR = m2.getRating();
		if(thisR>otherR)  return 1;
		else if(thisR<otherR) return -1;
		else return 0;
		
	}
}

}




