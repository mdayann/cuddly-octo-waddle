package methodLearn;

public class Looping {

	public void makeSquare(int limit) {

		for (int i = 1; i <= limit; i++) {

			for (int j = 1; j <= limit; j++) {
				System.out.print("* ");
			}

			System.out.println("");
		}
	}

	public static void main(String[] args) {
		Looping looping = new Looping();
		looping.makeSquare(4);
	}

}
