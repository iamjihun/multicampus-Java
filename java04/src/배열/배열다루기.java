
package 배열;

public class 배열다루기 {

	public static void main(String[] args) {
		// int[] x = new int[10]; // length : 10
		// index는 0부터 시작, 마지막 위치의 index는 length보다 1 적음.
//		x[0] = 10;
//		x[1] = 20;
//
//		for (int i = 0; i < x.length; i++) {
//			System.out.print(x[i] + " ");
//		}

		// 우리 가족의 성별을 char[]로 저장, 프린트
		// 우리 가족의 이름을 string[]로 저장, 프린트
		// 우리 가족의 시력을 double[]로 저장, 프린트
		// 우리 가족이 점심을 먹었는지 boolean[]으로 저장, 프린트

		char[] s = { '남', '여', '여', '남' };
		String[] name = { "아빠", "엄마", "누나", "나" };
		double[] sight = { 1.5, 0.3, 1.2, 1.2 };
		boolean[] lunch = { true, true, true, true };

		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < name.length; i++) {
			System.out.print(name[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < sight.length; i++) {
			System.out.print(sight[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < lunch.length; i++) {
			System.out.print(lunch[i] + " ");
		}
	}

}
