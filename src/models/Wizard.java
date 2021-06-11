package models;

public class Wizard extends Human {
	
	public Wizard() {
		this.setHealth(50);
		this.setIntelligence(8);
		
	}
	
	//Heal human method by wizard intelligence
	public void heal(Human casualty) {
		
		casualty.setHealth(casualty.getHealth() + this.getIntelligence());
	}
	
	//Fireball method decreases health by 3* wizard intelligence
	public void fireball(Human opposition) {
		opposition.setHealth(opposition.getHealth() - this.getIntelligence()*3);
	}

}
