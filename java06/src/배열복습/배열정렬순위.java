package 배열복습;

import java.util.Arrays;
import java.util.Random;

public class 배열정렬순위 {

	public static void main(String[] args) {
		// 정렬을 할 때는 Arrays
		Random r = new Random(42);
		int[] jumsu = new int[10000];
		for (int i = 0; i < jumsu.length; i++) {
			jumsu[i] = r.nextInt(1000) + 1; // 1~1000
		}

		// for each : 알아서 위치값을 옮겨주면서 하나씩 꺼내옵니다.!!
		for (int i : jumsu) {
			System.out.println(i);
		}
		// 오름차순 (작-->큰) 내림차순 (큰-->작)
		Arrays.sort(jumsu);

		// 정렬 후 확인
		int sum30 = 0;
		for (int i = 0; i < 3000; i++) {
			sum30 = sum30 + jumsu[i];
		}
		System.out.println(sum30 / 3000);
	}

}
