package models;

public class HumanTest {

	public static void main(String[] args) {
		
		Human bel = new Human();
		Human opps = new Human();
		
		System.out.println(opps.getHealth());
		bel.attack(opps);
		bel.attack(opps);
		System.out.println(opps.getHealth());
		

	}

}
