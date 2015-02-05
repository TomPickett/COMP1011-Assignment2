/**
 * @author Tom Pickett
 *Class Description: The Hero 
 *
 */

public class Hero {
	
	//Private properties ***********************
	private int strength;
	private int speed;
	private int health;
	
	//Public Properties ***********************
	public String name;
	public int randomNumber;
	public int damageNumber;
	
	//Getters *********************************
	public int getStrength() {
		return strength;
	}


	public int getSpeed() {
		return speed;
	}


	public int getHealth() {
		return health;
	}

	//Constructor *****************************
	public Hero(String name) {
		this.name = name;
		
		generateAbilities();
	}

	
	//Private Methods *************************
	private void generateAbilities() {
		this.strength = (int)(Math.random() * 100 + 1);
		this.speed = (int)(Math.random() * 100 + 1);
		this.health = (int)(Math.random() * 100 + 1);
	}
	
	private boolean hitAttempt() {
		randomNumber = (int)(Math.random() * 100 + 1);
		if(randomNumber > 0 && randomNumber <= 20)
		return true;
	 else
		return false;
		
	}
	
	private int hitDamage() {
		damageNumber = (int)(Math.random() *6 + 1);
		damageNumber = damageNumber * strength;
		return damageNumber;
	}
	
	//Public Methods **************************
	public void showAbilities() {
		System.out.println("***************************");
		System.out.println("Strength: " + this.strength);
		System.out.println("Speed: " + this.speed);
		System.out.println("Health: " + this.health);
		System.out.println("***************************");
	}
	
	public void fight() {
		System.out.println(this.name + " is fighting");
		hitAttempt();
		if(hitAttempt() == true) {
			hitDamage(); 
			System.out.println(name + " has hit for " + damageNumber + " Damage!");
		}else{ 
				System.out.println(name + " has missed the attack!");
			}
	}
	
}

