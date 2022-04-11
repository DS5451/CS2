package hw7;

import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;

public class CourseStudent_test {

	public static void main(String[] args) {

		
		// Create an array of 5 courses
		Course[] courses = new Course[5];
		String name = "Java programming";
		String id = "CS132";
		String dept = "Computer Science";
		courses[0] = new Course(name, id, dept);
		
		name = "Python programming";
		id = "CS131";
		courses[1] = new Course(name, id, dept);
		
		name = "Data Structure and Algorithm";
		id = "CS265";
		courses[2] = new Course(name, id, dept);
		
		name = "C++ and Qt";
		id = "CS331";
		courses[3] = new Course(name, id, dept);
		
		name = "Data Science";
		id = "CS511";
		courses[4] = new Course(name, id, dept);
		
		// Create an array of 3 students
		Student[] students = new Student[3];
		name = "Isla Chan";
		id = "123456";
		String major = "Computer Science";
		students[0] = new Student(name, id, major);
		
		name = "Emmett Smith";
		id = "654321";
		students[1] = new Student(name, id, major);
		
		name = "Ayaana Anderson";
		id = "543216";
		major = "Math";
		students[2] = new Student(name, id, major);
		
		Random rnd = new Random();
		//Each student will randomly add 4 courses.
		for (int i=0; i<3; i++){
			// generate four distinct courses.
			ArrayList<Integer> intList = new ArrayList<Integer>();
			while (intList.size()<4){
				int courseIndex = rnd.nextInt(5);
				if (!intList.contains(courseIndex)){
					intList.add(courseIndex);
				}
			}
			for (Integer index: intList){
				courses[index].addStudent(students[i]);
				students[i].addCourse(courses[index]);
			}
		}
		
		// Each course sets the score of each of its enrolled students.
		for (int i=0; i<courses.length; i++){
			if (courses[i].getStudentNo()!=0){
				Student[] allStudents = courses[i].getStudents();		
				for (int j=0; j<courses[i].getStudentNo(); j++){
					// a random score within [40, 100]
					int score = rnd.nextInt(100-40+1)+40;
					courses[i].setScore(allStudents[j], score);
				}
			}
		}
		
		// Each student randomly drops one course.
		for (int i=0; i<students.length; i++){
			int courseIndex;
			while (true){
				courseIndex = rnd.nextInt(5);
				if (students[i].isTaking(courses[courseIndex])){
					break;
				}
			}
			students[i].dropCourse(courses[courseIndex]);
			courses[courseIndex].dropStudent(students[i]);
		}
		
		// Each course reports its average score.
		for (int i=0; i<courses.length; i++){
			System.out.printf("%s %s %.2f\n", courses[i].getName(), courses[i].getID(), courses[i].getAverage());
		}
		System.out.println();
		
		// Each student checks the score of each of his/her enrolled courses, and his/her overall GPA.
		for (int i=0; i<students.length; i++){
			System.out.println(students[i].getName() + " " + students[i].getID() + ": ");
			System.out.print(students[i].getCourses());
			System.out.printf("The GPA is: %.2f\n", students[i].getGPA());
			System.out.println();
			
			
		}

	}
}

