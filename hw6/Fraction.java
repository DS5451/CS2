/* Author:Damien Sapra
 * Due Date: March 13, 2022
 * Purpose: This program returns modified fractions
 * Credits: I finished this program independently and had no help
 */
package hw6;

public class Fraction {
private int numerator; 
private int denominator;

//constructor
public Fraction() {
	numerator = 1; 
	denominator = 1;	
}

public int getNumerator() {
	return numerator;
}

public void setNumerator(int numerator) {
	this.numerator = numerator;
}

public int getDenominator() {
	return denominator;
}

public void setDenominator(int denominator) {
	this.denominator = denominator;
}

public Fraction(int num, int demo) {
	numerator = num;
	denominator = demo;
	reduce();
}

public void set(int num, int demo) {
	numerator = num;
	denominator = demo;
}

public Fraction add(Fraction other) {
	int num = (this.numerator*other.denominator)+(other.numerator*this.denominator);
	int demo = (this.denominator*other.denominator);

	this.numerator = num;
	this.denominator = demo;
	reduce();
	return this;
}

public Fraction subtract(Fraction other) {
	int num = (numerator*other.denominator)-(other.numerator*denominator);
	int demo = (denominator*other.denominator);
	this.numerator = num;
	this.denominator = demo;
	reduce();
	return this;
}

public Fraction multiply(Fraction other) {
	int num = (numerator*other.numerator);
	int demo = (denominator*other.denominator); 
	this.numerator=num;
	this.denominator=demo;
	reduce();
	return this;
}

public Fraction divide(Fraction other) {
	int num = (numerator*other.denominator);
	int demo = (denominator*other.numerator);
	this.numerator = num;
	this.denominator = demo;
	reduce();
	return this;
}

public double toDouble() {
	int a = this.numerator;
	int b = this.denominator;
			double toDouble = this.numerator*1.0/this.denominator*1.0;
	return toDouble;
}

public String toString() {
	int num = this.numerator;
	int demo = this.denominator;
	String toString = Integer.toString(num) +"/"+ Integer.toString(demo); 
	return toString;
}

private void reduce() {
	
if(this.numerator<0) {this.numerator*=-1; 
	for(int i = 2; i<this.numerator;i++) {
		if(this.numerator%i==0 && this.denominator%i==0) {
			this.numerator/=i;
			this.denominator/=i;
			i--;
		} 
	}
	this.numerator*=-1;} 
else {
		for(int i = 2; i<this.numerator;i++) {
			if(this.numerator%i==0 && this.denominator%i==0) {
				this.numerator/=i;
				this.denominator/=i;
				i--;
			} 
		}
		
	}

} 

	
}




