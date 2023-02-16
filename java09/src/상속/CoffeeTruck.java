package 상속;

public class CoffeeTruck extends Truck{
	
	String origin;
	int customers;

	public void order() {
		System.out.println("주문을 받다.");
	}
	public void coffee() {
		System.out.println("커피를 내리다.");
	}
	public void load() {
		System.out.println("화물 중에서 커피머신을 싣다.");
	}
	public CoffeeTruck(int wheels, String oil, int people, int maxLoad, String origin, int customers) {
		super(wheels, oil, people, maxLoad);
		this.origin = origin;
		this.customers = customers;
	}
	@Override
	public String toString() {
		return "CoffeeTruck [origin=" + origin + ", customers=" + customers + "]";
	}
	
	
}
