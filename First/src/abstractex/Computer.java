package abstractex;

public abstract class Computer {
	public abstract void display();
	public abstract void typing();
	public void turnOn() {
		System.out.println("turn on");
	}
	
	public void turnOff() {
		System.out.println("turn off");
	}
}
