package 메서드연습;

public class 계산기 {
	public void 더하기(int x, int y) {
		//System.out.println("더하기 기능 처리 방법 내용...");
		System.out.println(x + y);
}
	public void 곱하기(int x, int y) {
		System.out.println(x * y);
	}
	public int 빼기(int x, int y) { //매개변수(parameter)
		System.out.println("빼기 기능 처리 방법 내용");
		int result = x - y;
		System.out.println("뺀 결과값은 " + result + "입니다.");
		return result;
	}
}
