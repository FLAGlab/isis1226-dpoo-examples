package relations;

/**
 * Inheritance enxample
 * @author ISIS1126
 */
public class Pet {
	private String name;
	private int timesPlayed;
	
	public Pet(String name) {
		this.name = name;
		this.timesPlayed = 0;
	}
	
	public int getTimesPlayed() {
		return this.timesPlayed;
	}
	
	public void setTimesPlayed(int timesPlayed) {
		this.timesPlayed = timesPlayed;
	}
	
	public String getName() {
		return this.name;
	}
}
