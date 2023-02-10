package 복습;

public class 자바연산시주의점 {

	public static void main(String[] args) {
		// 자바 연산시 주의점
		int x = 20; // 컨트롤 + 알트 + 화살표 아래
		double z = 20;
		int y = 30; // 컨트롤 + 알트 + 화살표 아래

		System.out.println(x / y); // 연산은 CPU가 함
		// 소숫점까지 구하고 싶은 경우에는 ...?
		// 정수와 정수의 계산의 결과는 무조건 정수!! (자바가 소숫점 잘라버림)
		// 계산 시 하나라도 실수이면 결과는 무조건 실수!
		System.out.println(z / y);
		System.out.println(x % y);

		// 이미 정수로 저장된 값을 가져다가 실수 연산을 하고 싶은 경우
		// cpu가 정수를 실수로 변환해서 연산 할 수 있음.
		// 강제타입변환(강제형변환)이라고 부름 ==> (강제로 바꾸고 싶은 타입)변수명
		System.out.println(x / (double) y);
	}

}
