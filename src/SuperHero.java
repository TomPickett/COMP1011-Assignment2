//Thomas Pickett

public class SuperHero extends Hero {
	
	//Properties
	private String superPowers;

	
	//Constructor
	public SuperHero(String name) {
		super(name);
		
		generateRandomPowers();
		
	}

	//Private Methods
	private void generateRandomPowers() {
		
	}
	
	
	//Public Methods
	public void showPowers() {
		System.out.println(name + " super powers are: " + superPowers);
	}
}