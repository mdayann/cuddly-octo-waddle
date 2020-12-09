package animals;

public class Cat extends Animal {
	
	String catName;
	
	public Cat(String name, int legs, String eat, String walk) {
		super(legs, eat, walk);
		this.catName = name;
	}

	public void getName() {
		System.out.println("This animal name is " + this.catName);
		super.getProps();
	}
}
