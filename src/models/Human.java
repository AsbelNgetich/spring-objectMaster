package models;

public class Human {
	
	//Human attributes
	private int strength;
	private int stealth;
	private int intelligence;
	private int health;
	
	//class constructor
	public Human() {
		super();
		this.setStrength(3);;
		this.setStealth(3);
		this.setIntelligence(3);
		this.setHealth(100);
	}
	
	//Getters and setters
	public int getStrength() {
		return strength;
	}
	public void setStrength(int strength) {
		this.strength = strength;
	}
	public int getStealth() {
		return stealth;
	}
	public void setStealth(int stealth) {
		this.stealth = stealth;
	}
	public int getIntelligence() {
		return intelligence;
	}
	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}
	
	
	
	
	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}
	
	//attack method
	public void attack(Human opps) {
		
		opps.setHealth(opps.getHealth()-this.strength);
		
	}
	
}
