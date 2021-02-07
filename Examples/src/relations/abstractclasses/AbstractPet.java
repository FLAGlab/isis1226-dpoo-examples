package relations.abstractclasses;

/**
 * Abstract class for the pet example
 * This class implements the behavior of a Pet
 * @author ISIS1126
 */
public abstract class AbstractPet {
	private String name;
	private int timesPlayed;
	
	protected AbstractPet(String name) {
		this.name = name;
		this.timesPlayed = 0;
	}

	public int getTimesPlayed() {
		return this.timesPlayed;
	}
	
	public void setTimesPlayed(int timesPlayed) {
		this.timesPlayed = timesPlayed;
	}
	
	public void play() {
		this.setTimesPlayed(this.getTimesPlayed() + 1);
	}
	
	public abstract String talk();
}
