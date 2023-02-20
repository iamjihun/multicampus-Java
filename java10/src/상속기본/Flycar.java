package 상속기본;

public class Flycar extends Car {
	boolean fly;
	
	public void fly() {
		System.out.println("하늘을 날다.");
	}

	public Flycar(String color, boolean fly) {
		super(color);
		this.fly = fly;
	}

	@Override
	public String toString() {
		return "Flycar [fly=" + fly + "]";
	}

}
