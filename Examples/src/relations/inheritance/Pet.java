package relations.inheritance;

/**
 * Inheritance
 * Pet super class to inherit from for all pet types
 * @author ISIS1126
 */
public class Pet {
	private String name;
	private int timesPlayed;
	
	public Pet() {
		this.name = new String();
		this.timesPlayed = 0;
	}
	
	public Pet(String name) {
		this.name = name;
		this.timesPlayed = 0;
	}
	
	public int getTimesPlayed() {
		return this.timesPlayed;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void play( ) {
		this.timesPlayed += 1;
	}
}
