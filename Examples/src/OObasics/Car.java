package OObasics;

/**
 * Car class example
 * @author ISIS1126
 */
public class Car {
	//Attributes
	private Wheel[] wheels;
	private boolean lights;
	private boolean roof;
	private int windows;
	private int seats;
	private int steeringWheel;

	//Constructor(s)
	public Car(Wheel[] wheels, int windows, int seats, int steeringWheel) {
		this.wheels = wheels;
		this.windows = windows;
		this.seats = seats;
		this.steeringWheel = steeringWheel; 
	}

	//Methods
	public Wheel[] getWheels() {
		return wheels;
	}

	public void setWheels(Wheel[] wheels) {
		this.wheels = wheels;
	}

	public boolean isLights() {
		return lights;
	}

	public void setLights(boolean lights) {
		this.lights = lights;
	}

	public boolean isRoof() {
		return roof;
	}

	public void setRoof(boolean roof) {
		this.roof = roof;
	}

	public int getWindows() {
		return windows;
	}

	public void setWindows(int windows) {
		this.windows = windows;
	}

	public int getSteeringWheel() {
		return steeringWheel;
	}

	public void setSteeringWheel(int steeringWheel) {
		this.steeringWheel = steeringWheel;
	}

	public int getSeats() {
		return this.seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	public void drive() {
		this.wheels[2].increaseTorque();
		this.wheels[3].increaseTorque();
	}

	public void fourWheelDrive() {
		for(int i=0; i<this.wheels.length; i++) 
			this.wheels[i].increaseTorque();
	}

	//main
	public static void main(String[] args) {
		Wheel[] wheels = {new Wheel(1),new Wheel(2),new Wheel(3),new Wheel(4)};
		Car car = new Car(wheels, 6, 2, 1);

	}
}
