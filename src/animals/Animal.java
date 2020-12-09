package animals;

public class Animal {
	
	private int legs;
	private String eat;
	private String walk;
	
	
	public Animal(int legs, String eat, String walk) {
		super();
		this.legs = legs;
		this.setEat(eat);
		this.setWalk(walk);
	}
	
	public void getProps() {
		System.out.println("This animal has " + this.getLegs() + " legs");
		System.out.println("This animal is " + this.getEat());
		System.out.println("This animal is " + this.getWalk());
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

