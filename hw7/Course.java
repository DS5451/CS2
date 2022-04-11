package hw7;

public class Course {
	private String name;
	private String id;
	private String department;
	private int max_cap = 60;
	private int min_cap = 1;
	private Student[] students;
	private double[] scores = new double[max_cap];
	private int studentNo;
	private static int course_number;
	
public Course(String name, String id, String department) {
	this.name = name;
	this.id = id;
	this.department = department;
	
	this.course_number++;

}

public String getName() {
	return name;
}

public String getID() {
	return id;
}

public String getDept() {
	return department;	
}

public int getMaxCap() {
	return max_cap;
}

public int getMinCap() {
	return min_cap;
}

public Student[] getStudents() {
	
	return students;
}

public int getStudentNo() {
	return studentNo;
}
	
public void addStudent(Student s){
	 if(studentNo<max_cap) {
	studentNo++;
	 Student[] newStudent = new Student[studentNo];
	 for(int i = 0; i<newStudent.length-1; i++) {
			newStudent[i]=students[i];
			
		}

		newStudent[studentNo-1] = s;
	 students=newStudent;
	 
	
}
	 }
public void dropStudent(Student s) {
	studentNo--;
	int j = 0;
	Student[] newStudent = new Student[studentNo];
	for (int i=0; i<students.length;i++) {
		if (s != students[i]) {
			newStudent[j]=students[i];
			j++;
			
		}
	}
	
	students=newStudent;
	
}
public double getScore(String id) {
	for(int i =0; i<students.length;i++) {
		String a = students[i].getID();
		if(id==a) {
			return scores[i];
		}
	}
	  return 0;              
}
public void setScore(Student s, double score) {
	for(int i = 0; i<students.length; i++) {
		if(students[i]==s) {
			scores[i]=score;
		}
	}
}
//^
public double getAverage() {
	double len = studentNo;
	double total = 0;
	for (int i = 0; i<len; i++) {
		total+=scores[i];
	}
	
	return total/len;
}

public int getCourseNo() {
	return course_number;
}
public String toString() {
	return name+" "+id;
}
}
