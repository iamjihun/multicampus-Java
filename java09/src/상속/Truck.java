package 상속;

public class Truck extends Car{
	
	int maxLoad;
	
	public void load() {
		System.out.println("화물을 싣다");		
	}
	public void fwd() {
		System.out.println("4륜기어를 넣다");		
	}
	public Truck(int wheels, String oil, int people, int maxLoad) {
		super(wheels, oil, people);
		this.maxLoad = maxLoad;
	}
	@Override
	public String toString() {
		return "Truck [maxLoad=" + maxLoad + "]";
	}
	
	

}
