package models;

public class HumanTest {

	public static void main(String[] args) {
		
		Human bel = new Human();
		Human opps = new Human();
		
		System.out.println("Opposition health: " + opps.getHealth());
		bel.attack(opps);
		bel.attack(opps);
		bel.attack(opps);
		bel.attack(opps);
		
		System.out.println("Opposition health: " + opps.getHealth());
		
		//wizard
		Wizard gandolf = new Wizard();
		System.out.println("Gandolf has "+ gandolf.getHealth() + " health and " + gandolf.getIntelligence() + " intelligence");
		
		//wizard healing power
		gandolf.heal(opps);
		System.out.println("Opposition health: " + opps.getHealth());
		System.out.println("..");
		
		//wizard fireball throwing power
		System.out.println("bel health: " + bel.getHealth());
		gandolf.fireball(bel);
		System.out.println("bel health: " + bel.getHealth());
		
		//Ninja
		Ninja shaolin = new Ninja();
		shaolin.steal(bel);
		System.out.println("shaolin health: " + shaolin.getHealth());
		System.out.println("bel health: " + bel.getHealth());
		shaolin.runAway();
		System.out.println("Shaolin ran away");
		System.out.println("shaolin health: " + shaolin.getHealth());
		
		//Samurai
		Samurai sachio = new Samurai();
		sachio.deathBlow(shaolin);
		System.out.println("shaolin health: " + shaolin.getHealth());
		System.out.println("Samurai health: " + sachio.getHealth());

	}

}
