package student;

import java.util.ArrayList;

public class Student extends Person implements StudentInterface {

	private String email;

	private String password;

	private int studentNumber;

	private int totalSks;

	@Override
	public void studentRegistration(String firstName, String lastName, String address, String birthDate,
			String phoneNumber, String email, String password) {

		this.studentNumber = (int) (Math.random() * 10000 + 1);

		this.email = email;
		this.password = password;

		super.setFirstName(firstName);
		super.setLastName(lastName);
		super.setAddress(address);
		super.setBirthDate(birthDate);
		super.setPhoneNumber(phoneNumber);

		System.out.println("Registration Successful");
		System.out.println("=======================");
		System.out.println("Person Data :");
		System.out.println("Full Name : " + super.getFullName());
		System.out.println("Address : " + super.getAddress());
		System.out.println("Birth Date : " + super.getBirthDate());
		System.out.println("Phone Number : " + super.getPhoneNumber());
		System.out.println("=======================");
		System.out.println("Student Data");
		System.out.println("Email : " + this.email);
		System.out.println("NIM : " + this.studentNumber);
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public void learningPlan(ArrayList<Course> course) {

		for (Course c : course) {
			int sks = c.getSks();
			this.totalSks += sks;
		}

		if (this.totalSks >= 144) {
			super.setLastName(super.getLastName() + " S.Kom");
		}

		System.out.println("Learning Plan Info");
		System.out.println("============================");
		System.out.println("Email : " + this.email);
		System.out.println("NIM : " + this.studentNumber);
		System.out.println("Full Name : " + super.getFullName());
		System.out.println("Total SKS : " + this.totalSks);
	}

}
