package methodLearn;

public class Biodata {
	
	public String firstName = "Muhammad";
	public String lastName = "Dayan";
	public String domisili = "Temanggung, Jawa Tengah";
	public String birthYear = "2000";
	
	public void callMyName() {
		System.out.println(firstName + " " + lastName);
		System.out.println(domisili);
	}
	
	public static void main(String[] args) {
		Biodata biodata = new Biodata();
		
		biodata.callMyName();
		System.out.println(biodata.birthYear);
	}
	

}
