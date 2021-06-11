package models;

public class Samurai extends Human {
	
	public Samurai() {
		this.setHealth(200);
	}
	
	//death blow. cuts Samurai health by half
	public void deathBlow(Human kenny) {
		
		kenny.setHealth(0);
		
		this.setHealth((int)this.getHealth()/2);
		
	}
	
	public void meditate(Human kenny) {
		
		this.setHealth(this.getHealth() + (int)this.getHealth()/2);
		
	}
	
	
	
	

}

