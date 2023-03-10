package template;

public abstract class Car {
	public abstract void drive();
	public abstract void stop();
	
	public void startCar() {
		System.out.println("Turn on");
	}
	
	public void turnOff() {
		System.out.println("Turn off");
	}
	
	final public void run() {
		startCar();
		drive();
		stop();
		turnOff();
	}
}
