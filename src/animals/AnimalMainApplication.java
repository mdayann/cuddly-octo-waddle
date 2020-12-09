package animals;

public class AnimalMainApplication {
	public static void main(String[] args) {
		
		Cat cat = new Cat("Cat", 4, "Omnivore", "Walking");
		cat.getName();
		
		System.out.println("");
		
		Bird bird = new Bird(2, "Herbivore", "Flying");
		bird.getName();
		
	}
}
