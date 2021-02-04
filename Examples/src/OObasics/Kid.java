package OObasics;

public class Kid {
	
	private String name;
	private int age;
	private Dog dog;
	
	public Kid(String name, int age) {
		this.name = name;
		this.age = age;
		this.dog = null;
	}
	
	public void addPet(Dog dog) {
		this.dog = dog;
	}
	
	public boolean removePet() {
		this.dog = null;
		return true;
	}
	
	public void play() {
		this.dog.play();
	}
	
	
	public static void main(String[] args) {
		Kid kid = new Kid("bob", 42);
		Dog dog = new Dog("snowy");
		
		kid.addPet(dog);
		
		kid.play();
		kid.play();
		
		kid.removePet();
		System.out.println(dog.getTimesPlayed());		
	}
}
