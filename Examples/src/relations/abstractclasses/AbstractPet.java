package relations;

public abstract class AbstractPet extends Pet {
	
	protected AbstractPet(String name) {
		super(name);
	}

	public void play() {
		this.setTimesPlayed(this.getTimesPlayed() + 1);
	}
	
	public abstract String talk();
}
