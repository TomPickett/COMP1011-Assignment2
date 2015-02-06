//Thomas Pickett

import java.util.ArrayList;
import java.util.*;

public class SuperHero extends Hero {
	
	//Properties
	private String[] superPowers = new String[3];
	
	
	//Constructor
	public SuperHero(String name) {
		super(name);
		
		generateRandomPowers();
}


	//Private Methods

	private void generateRandomPowers(){
		
		//List of powers		
        ArrayList<String> powerList = new ArrayList<String>();
		powerList.add("Super Speed");
		powerList.add("Super Strength");
		powerList.add("Body Armour");
		powerList.add("Flight");
		powerList.add("Fire Generation");
		powerList.add("Weather Control");
		
		//Making the Powers Random 
		Random power = new Random();
		for(int i=0; i<3 ; i++){
		int index = power.nextInt(powerList.size());
		this.superPowers[i] = powerList.get(index);
		 powerList.remove(index);
		}
	}
	
	
	//Public Methods
	public void showPowers(){
	    //Printing the output on screen for the user 
		System.out.println(name + " powers are: ");
		System.out.println("-----------------------------------------");
		for(int i = 0; i < superPowers.length; i++){
		System.out.println(superPowers[i]);}
		System.out.println("-----------------------------------------");
	}
}