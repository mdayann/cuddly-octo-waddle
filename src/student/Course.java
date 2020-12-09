package student;

public class Course {
	
	private String courseName;
	
	private String lecturer;
	
	private int sks;
	
	private String roomName;

	public Course(String courseName, String lecturer, int sks, String roomName) {
		this.courseName = courseName;
		this.lecturer = lecturer;
		this.sks = sks;
		this.roomName = roomName;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getLecturer() {
		return lecturer;
	}

	public void setLecturer(String lecturer) {
		this.lecturer = lecturer;
	}

	public int getSks() {
		return sks;
	}

	public void setSks(int sks) {
		this.sks = sks;
	}

	public String getRoomName() {
		return roomName;
	}

	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}
	
	

}
