package relations;

/**
 * Message sending example
 * @author ISIS1126
 */
public class Kid {
	
	private String name;
	private int age;
	private AbstractPet pet;
	
	public Kid(String name, int age) {
		this.name = name;
		this.age = age;
		this.pet = null;
	}
	
	public void addPet(AbstractPet dog) {
		this.pet = dog;
	}
	
	public boolean removePet() {
		this.pet = null;
		return true;
	}
	
	public void play() {
		this.pet.play();
	}
	
	
	public static void main(String[] args) {
		Kid kid = new Kid("bob", 42);
		Dog dog = new Dog("snowy");
		Cat cat = new Cat();
		
		kid.addPet(dog);
		
		kid.play();
		kid.play();
		
		kid.removePet();
		System.out.println(dog.getTimesPlayed());
		//kid.addPet(cat);
		cat.play();
	}
}
