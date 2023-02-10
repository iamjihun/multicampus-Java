package 배열기본;

import java.util.Random;

public class 많은양만들어보기2 {

	public static void main(String[] args) {
		int[] number = new int[1000];

		Random r = new Random();

		// 2부터 20까지 임의로 만들어서 배열에 넣어보세요.

		for (int i = 0; i < number.length; i++) {
			number[i] = r.nextInt(19) + 2;
		}

		// 전체 프린트
		for (int i : number) {
			System.out.println(number[i]);
		}

		// 3이상인 숫자 몇 개인지 프린트!
		// 배열은 전체를 가지고 와서, 3 이상인지 체크 후 갯수를 세어주세요.

		int sum = 0;
		int count = 0;
		for (int i = 0; i < number.length; i++) {
			if (number[i] >= 15) {
				count++; // count = count + 1;
				sum = sum + number[i];
			}
		}
		System.out.println("============");
		System.out.println("15이상 갯수 : " + count);
		System.out.println("15이상 총 합 : " + count);
	}

}
