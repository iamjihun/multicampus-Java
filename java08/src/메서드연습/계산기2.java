package 메서드연습;

public class 계산기2 {
	// 입력값이 다르면, 메서드 이름을 다 동일하게 써도 된다.
	// 하나의 이름으로 다양한 형태를 구현 가능하다.
	// ==> 다형성(오버로딩)
	public int add(int x, int y) {
		return x + y;
	}
	public double add(int x, double y) {
		return x + y;
	}
	public double add(double x, double y) {
		return x + y;
	}
	public String add(String x, int y) {
		return x + y + "시에 점심을 먹겠어!";
	}
}
