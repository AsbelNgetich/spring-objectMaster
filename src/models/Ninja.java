package models;

public class Ninja extends Human {
	
	public Ninja() {
		this.setStealth(10);
		
	}
	
	public void steal(Human victim) {
		victim.setHealth(victim.getHealth()-this.getStealth());
		this.setHealth(getHealth() + this.getStealth());
	}
	
	public void runAway() {
		this.setHealth(this.getHealth() - 10);
		
	}

}
