package relations.inheritance;

/**
 * Message sending example
 * @author ISIS1126
 */
public class Kid {
	
	private String name;
	private int age;
	private Pet pet;
	
	public Kid(String name, int age) {
		this.name = name;
		this.age = age;
		this.pet = new Pet();
	}
	
	public void addPet(Pet pet) {
		this.pet = pet;
	}
	
	public boolean removePet() {
		this.pet = new Pet();
		return true;
	}
	
	public void play() {
		this.pet.play();
	}
	
	//Execution example
	public static void main(String[] args) {
		Kid kid = new Kid("bob", 42);
		Dog dog = new Dog("snowy");
		Cat cat = new Cat("top cat");
		
		kid.addPet(dog);
		
		kid.play();
		kid.play();
		
		kid.removePet();
		System.out.println(dog.getTimesPlayed());
		kid.addPet(cat);
		cat.play();
	}
}
