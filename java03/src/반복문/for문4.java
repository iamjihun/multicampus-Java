package 반복문;

public class for문4 {

	public static void main(String[] args) {
		// 1.
		for (int i = 0; i < 10; i++) {
			System.out.print("*");
		}
		System.out.println();

		// 2.
		for (int i = 0; i < 5; i++) {
			System.out.print("커피*");
		}
		System.out.println();

		// 3.
		for (int i = 0; i < 3; i++) {
			System.out.println("커피*우유");
		}

		// 4.
		for (int i = 0; i < 3; i++) {
			System.out.println(i + 1 + " : 짱!");
			//연산이 +만 있어 앞에서부터 계산되기 때문에 (i + 1) 괄호 안 씌워도 됨.
		}
	}

}
