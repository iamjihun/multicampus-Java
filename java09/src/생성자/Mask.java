package 생성자;

public class Mask {
	String color;
	int price;
	int qty;
	
	
	public Mask(String color, int price, int qty) {
		super();
		this.color = color;
		this.price = price;
		this.qty = qty;
	}


	@Override
	public String toString() {
		return "Mask [color=" + color + ", price=" + price + ", qty=" + qty + "]";
	}
}
