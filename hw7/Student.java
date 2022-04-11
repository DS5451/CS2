package hw7;

import java.util.Arrays;

public class Student {
	private String name;
	private String id;
	private String major;
	private Course[] courses;
	private int courseNo;
	private static int student_number;
	private int CAPACITY=50;



public Student(String name, String ID ,String major) {
	this.name = name;
	this.id = ID;
	this.major = major;
	
	student_number++;
}

public String getName() {
	return name;
}

public String getID() {
	return id;
}

public String getMajor() {
	return major;
}

//^
public String getCourses() {
	String a ="";
	double b =0.0;
	for(int i = 0; i<courseNo; i++) {
		b = 0;
		a +=courses[i]+" "+courses[i].getScore(id)+" ";

	}
	return a;
}

public int getCourseNo() {
	return courseNo;
	
}

public void addCourse(Course C) {
	if(C.getStudentNo()<CAPACITY) {
	courseNo++;
	Course[] newCourses = new Course[courseNo];
	for(int i = 0; i<newCourses.length-1; i++) {
		newCourses[i]=courses[i];
		
	}
	newCourses[courseNo-1] = C;
	

	courses=newCourses;
	}
}

public void dropCourse(Course C) {
	courseNo--;
	int j = 0;
	Course[] newCourses = new Course[courseNo];
	for (int i=0; i<courses.length;i++) {
		if (C != courses[i]) {
			newCourses[j]=courses[i];
			j++;
			
		}
	}
	
	courses=newCourses;
	
}

public double getGPA() {
	int len = courseNo;
	int total = 0;
	for (int i =0; i<courses.length; i++) {
		double score = courses[i].getScore(id);
		total += score; 
		
	}
	
	double GPA = total/len;
	return GPA;
}

public int getStudentNo() {
	return student_number;
}
public boolean isTaking(Course C) {
	for(int i =0; i<courses.length;i++) {
		if (C==courses[i]) {

			return true;
		}

	}

	return false;
}

public String toString() {
	String toString = name+" "+id+" "+major;
	return toString;
}


}

