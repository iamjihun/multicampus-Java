package 메서드연습;

public class 계산기3 {
	// 입력값이 다르면, 메서드 이름을 다 동일하게 써도 된다.
	// 하나의 이름으로 다양한 형태를 구현 가능하다.
	// ==> 다형성(오버로딩)
	public int add(int x, int y) {
		return x + y;
	}
	public int minus(int x, int y) {
		return x - y;
	}
	public int mul(int x, int y) {
		return x * y;
	}
	public int div(int x, int y) {
		return x / y;
	}
}
