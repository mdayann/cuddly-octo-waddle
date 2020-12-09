package methodLearn;

import java.util.Scanner;

public class ChildLuas extends ParentLuas {

	public void volumeKubus(double firstSide) {
		double volume;
		volume = Math.pow(firstSide, 3);
		System.out.println("Volume kubus: " + volume);
	}
	
	public static void main(String[] args) {
		
		Scanner scanInput = new Scanner(System.in);
		
		System.out.print("Input sisi persegi : ");
		double sisiPersegi = scanInput.nextDouble();
		
		System.out.print("Input alas segitiga : ");
		double alasSegitiga = scanInput.nextDouble();
		
		System.out.print("Input tinggi segitiga : ");
		double tinggiSegitiga = scanInput.nextDouble();
		
		System.out.print("Input sisi kubus : ");
		double sisiKubus = scanInput.nextDouble();
		
		scanInput.close();
		
		ChildLuas childLuas = new ChildLuas();

		childLuas.luasPersegi(sisiPersegi);
		childLuas.luasSegitiga(alasSegitiga, tinggiSegitiga);
		childLuas.volumeKubus(sisiKubus);
			
	}
}
