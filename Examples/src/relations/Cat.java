package relations;

public class Cat implements IDomesticPet {
	
	@Override
	public String talk() {
		return "miauw";
	}

	@Override
	public void play() {
		System.out.println("Cats dont play");
	}
}
