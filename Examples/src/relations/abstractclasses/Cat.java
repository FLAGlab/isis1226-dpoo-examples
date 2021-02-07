package relations.abstractclasses;

/**
 * Cat class
 * @author ISIS1126
 */
public class Cat extends AbstractPet {
	
	protected Cat(String name) {
		super(name);
	}

	@Override
	public String talk() {
		return "miauw";
	}

	@Override
	public void play() {
		System.out.println("Cats dont play");
	}
}
