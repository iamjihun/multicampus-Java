package 상속;

public class 내차들 {

	public static void main(String[] args) {
		Car sonata = new Car(4, "가솔린", 5);
		Car santafe = new Car(4, "디젤", 7);
		System.out.println(sonata);
		System.out.println(santafe);
		sonata.drive();
		santafe.gas();
		
		System.out.println();

		Truck porter = new Truck(4, "디젤", 3, 1000);
		System.out.println(porter);
		porter.load();
		porter.fwd();
		
		System.out.println();
		
		CoffeeTruck bongo = new CoffeeTruck(4, "디젤", 4, 800, "브라질산", 20);
		System.out.println(bongo);
		bongo.load();
		bongo.coffee();
		bongo.order();
	}
}
