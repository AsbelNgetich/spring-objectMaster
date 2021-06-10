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
		this.strength = 3;
		this.stealth = 3;
		this.intelligence = 3;
		this.health = 100;
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
	
	
	
	//attack method
	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public void attack(Human opps) {
		
		opps.setHealth(opps.getHealth()-this.strength);
		
	}
	
}
