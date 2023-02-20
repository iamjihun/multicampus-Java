package 복습;

public class Mask {
	//멤버변수
	String color;
	int price;
	int count;
	//클래스이름과 동일한 메서드를 만들어주면, 
	//new를 가지고 객체생성시 자동호출
	//생성자(메서드) ==> constructor(컨스트럭터)
	public Mask(String color, int price, int count) {
		this.color = color;
		this.price = price;
		this.count = count;
	}
	public Mask(String color, int price) {
		this.color = color;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "마스크 [color=" + color + ", price=" + price + ", count=" + count + "]";
	}
	
	
	
	
	
	
}
