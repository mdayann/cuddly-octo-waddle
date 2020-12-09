package student;

import java.util.ArrayList;

public interface StudentInterface {
	
	public void studentRegistration(
			String firstName,
			String lastName,
			String addres,
			String birthDate,
			String phoneNumber,
			String email, 
			String password);
	
	public void learningPlan(ArrayList<Course> course);
}
