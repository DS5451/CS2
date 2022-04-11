/* Author:Damien Sapra
 * Due Date: March 13, 2022
 * Purpose: This program returns the date
 * Credits: I finished this program independently and had no help
 */
package hw6;

public class MyDate {
private int year;
public int getYear() {
	return year;
}

public void setYear(int year) {
	this.year = year;
}

public int getMonth() {
	return month;
}

public void setMonth(int month) {
	this.month = month;
}

public int getDay() {
	return day;
}

public void setDay(int day) {
	this.day = day;
}
private int month;
private int day;

public MyDate() {
	year = 2000;
	month = 1;
	day = 1;
}

public MyDate(int year, int month, int day) {
	this.year = year;
	this.month = month;
	this.day = day;
	
}



public void addDays(int days) {
	
	int daysmonth = daysInMonth(this.month);
	 
	day += days;  
	while (day>daysmonth) {
		month++;
		day-=daysmonth;

		if (month==12) {
			month=1;
			year++;
		}
	}
	if(day<0) day = 1;
	
}


public void addWeeks(int weeks) {
	int day = (weeks *7);
	addDays(day);
	
}

public int daysTo(MyDate other) {
	int daysto = 0;
	while(this.year!=other.year || this.month!=other.month || day!=other.day) {
		addDays(1);
		daysto++;
	}
	
	
return daysto;	
}

public int daysInMonth(int month) {
	switch(month) {
	case 1:
		month = 31;
	break;
	case 2: 
		if(isLeapYear()==true) {
			month = 29;
			
		} else {
			month = 28;
		}
		break;
	case 3:
		month = 31;
		break;
	case 4: 
		month = 30;
		break;
	case 5:
		month = 31;
		break;
	case 6:
		month = 30;
		break;
	case 7:
		month = 31;
		break;
	case 8:
		month = 31;
		break;
	case 9:
		month = 30;
		break;
	case 10:
		month = 31;
		break;
	case 11:
		month = 30;
		break;
	case 12:
		month = 31;
		break;
	}
	return month;
}

public boolean isLeapYear() {
	boolean leap = false;
	if (year%100 == 0 && year%400==0) {
	leap =true;
	} else if (year%100!=0 && year%4==0) {
		leap = true;
	}
	return leap;
}

public String toString() {
	int month = this.month;
	int year = this.year;
	int day = this.day;
	String toString = Integer.toString(year) +"/"+ Integer.toString(month)+"/"+Integer.toString(day); 
	return toString;
	
}
}


