package 상속기본;

public class Car {
	String color;
	
	public void run() {
		System.out.println("달리다.");
	}

	public Car(String color) {
		super();
		this.color = color;
	}

	@Override
	public String toString() {
		return "Car [color=" + color + "]";
	}
	
	
}
