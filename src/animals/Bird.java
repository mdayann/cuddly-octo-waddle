package animals;

public class Bird implements AnimalInterface {
	
	private int legs;
	private String eat;
	private String walk;

	@Override
	public void getName() {
		System.out.println("This bird has " + this.getLegs() + " legs");
		System.out.println("This bird is " + this.getEat());
		System.out.println("This bird is " + this.getWalk());
	}
	
	
	public Bird(int legs, String eat, String walk) {
		super();
		this.legs = legs;
		this.eat = eat;
		this.walk = walk;
	}


	public int getLegs() {
		return legs;
	}


	public void setLegs(int legs) {
		this.legs = legs;
	}


	public String getEat() {
		return eat;
	}


	public void setEat(String eat) {
		this.eat = eat;
	}


	public String getWalk() {
		return walk;
	}


	public void setWalk(String walk) {
		this.walk = walk;
	}


}
