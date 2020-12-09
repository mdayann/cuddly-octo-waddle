package drawBangunan;

import java.util.Scanner;

public class MainApplication {
	public static void main(String[] args) {

		// Print menu
		System.out.println("Menu");
		System.out.println("1. Lingkaran");
		System.out.println("2. Persegi");
		System.out.println("3. Segitiga");
		System.out.println("");

		// Scanner init
		Scanner scanInput = new Scanner(System.in);
		System.out.print("Please select a menu : ");
		int selectedMenu = scanInput.nextInt();
		scanInput.close();

		// Select menu
		if (selectedMenu == 1) {
			
			Lingkaran lingkaran = new Lingkaran();
			lingkaran.descFigure("lingkaran");
			lingkaran.drawBangunDatar();
			
		} else if (selectedMenu == 2) {
			
			Persegi persegi = new Persegi();
			persegi.descFigure("persegi");
			persegi.drawBangunDatar();
			
		} else if (selectedMenu == 3) {
			
			Segitiga segitiga = new Segitiga();
			segitiga.descFigure("segitiga");
			segitiga.drawBangunDatar();
			
		} else {
			System.out.println("Invalid menu");
		}
	}
}
