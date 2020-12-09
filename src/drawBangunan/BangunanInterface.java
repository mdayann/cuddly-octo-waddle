package drawBangunan;

public interface BangunanInterface {

	public void drawBangunDatar();

	default void descFigure(String name) {

		if (name.equals("lingkaran")) {
			propsCircle();

		} else if (name.equals("persegi")) {
			propsSquare();

		} else if (name.equals("segitiga")) {
			propsTriangle();

		} else {
			System.out.println("Data not found");
		}
	}

	static void propsCircle() {
		System.out.println("Jumlah sisi : 1");
		System.out.println("Rumus :  L = π × r², K = π × d");
	}

	static void propsSquare() {
		System.out.println("Jumlah sisi : 4");
		System.out.println("Rumus : L = s × s, K = 4 × s");
	}

	static void propsTriangle() {
		System.out.println("Jumlah sisi : 3");
		System.out.println("Rumus : L =  ½ × a × t, K = sisi + sisi + sisi");
	}
}
