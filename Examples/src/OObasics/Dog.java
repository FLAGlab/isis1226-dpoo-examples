package OObasics;

public class Dog {
	private String name;
	private int timesPlayed;
	
	public Dog(String name) {
		this.name = name;
		this.timesPlayed = 0;
	}
	
	public void play() {
		this.timesPlayed += 1;
	}
	
	public int getTimesPlayed() {
		return this.timesPlayed;
	}
	
	public String getName() {
		return this.name;
	}
}
