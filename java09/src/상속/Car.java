package 상속;

public class Car {
	int wheels;
	String oil;
	int people;
	
	public void drive() {
		System.out.println("달리다.");
	}
	public void gas() {
		System.out.println("주유하다.");
	}
	public Car(int wheels, String oil, int people) {
		super();
		this.wheels = wheels;
		this.oil = oil;
		this.people = people;
	}
	@Override
	public String toString() {
		return "Car [wheels=" + wheels + ", oil=" + oil + ", people=" + people + "]";
	}
	
	
}
