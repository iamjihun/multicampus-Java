package 제어문문제;

import java.util.Random;
import java.util.Scanner;

public class 정답맞추기게임 {

	public static void main(String[] args) {
		// 2. 랜덤을 이용해서 프로그램 실행될 때마다 정답을 바꾸세요.
		// int target = 77;
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		int data = 0;
		int target = r.nextInt(100);
		int count = 0; // 카운트 변수 선언

		while (true) {
			System.out.print("0~100까지 숫자 중 생각한 정답은?? ");
			data = sc.nextInt();
			count++; // 반복할 때 마다 count +1
			if (data == target) {
				System.out.println("정답입니다. 시도 횟수는 " + count + "회 입니다.");
				break;
			} else {
				// 1. 힌트 주기 : 오답인 경우
				// data가 target보다 크면 "너무 커요.."
				// data가 target보다 작으면 "너무 작아요.."
				if (data > 100 || data < 0) {
					System.out.println("0~100 사이의 값을 넣어주세요.");
				} else if (data > target) {
					System.out.print("오답입니다, 다시 시도해주세요. ");
					System.out.println("너무 커요!");
				} else
				{
					System.out.print("오답입니다, 다시 시도해주세요. ");
					System.out.println("너무 작아요!");
				}
			}
		}
		sc.close();

	}

}
