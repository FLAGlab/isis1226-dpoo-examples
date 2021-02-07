package relations.abstractclasses;

/**
 * Dog example
 * @author ISIS1126
 */
public class Dog extends AbstractPet {
	
	public Dog(String name) {
		super(name);
	}

	@Override
	public String talk() {
		return "guau";
	}
}
