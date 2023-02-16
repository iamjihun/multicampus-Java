package 생성자;

public class 컴퓨터 {
	int price;
	String company;
	int monitor;
	
	public 컴퓨터(int price, String company, int monitor) {
		super();
		this.price = price;
		this.company = company;
		this.monitor = monitor;
	}

	@Override
	public String toString() {
		return "컴퓨터 [price=" + price + ", company=" + company + ", monitor=" + monitor + "]";
	}
}
