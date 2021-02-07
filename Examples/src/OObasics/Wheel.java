package OObasics;

/**
 * Composed class for a car
 * @author ISIS1126
 */
public class Wheel {
	//Attributes
	private int id;
	private double torque;
	
	//Constructor
	public Wheel(int id) {
		this.id = id;
		this.torque = 1;
	}
	
	//Methods
	public void increaseTorque() {
		this.torque *= 1.35;
	}
	
	public void decreaseTorque() {
		this.torque /= 1.35;
	}	
}
