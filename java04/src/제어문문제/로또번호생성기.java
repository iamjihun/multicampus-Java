package 제어문문제;

import java.util.Random;

public class 로또번호생성기 {

	public static void main(String[] args) {
		// 아무 값이나 발생 시키는 부품 ==> Random
		// 가짜 랜덤한 값 만들어주는 부품.
		Random r = new Random(); // 시드값
		System.out.print("로또 번호 : ");
		for (int i = 0; i < 6; i++) {
			System.out.print((r.nextInt(44) + 1) + " "); // 0~9
		}
	}

}
