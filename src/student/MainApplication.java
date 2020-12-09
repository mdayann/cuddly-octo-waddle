package student;

import java.util.ArrayList;

public class MainApplication {

	public static void main(String[] args) {

		Student student1 = new Student();
		student1.studentRegistration("M", "Dayan", "Jogja", "2020/12/12", "081000", "mdayan@gmail.com", "12345");

		Course course1 = new Course("Math", "Budi", 1, "Room A");
		Course course2 = new Course("Math", "Budi", 1, "Room A");

		ArrayList<Course> courseList = new ArrayList<>();
		courseList.add(course1);
		courseList.add(course2);

		System.out.println("****************************");
		System.out.println("");
		System.out.println("****************************");

		student1.learningPlan(courseList);

	}
}
