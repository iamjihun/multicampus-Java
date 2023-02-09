package 제어문문제;

import java.util.Scanner;

public class 인기투표시스템 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int data = 0;
		int i = 0;
		int b = 0;
		int n = 0;

		System.out.println("인기투표 시스템");
		System.out.println("====================");
		for (int j = 0; j < 10; j++) {
			System.out.println("1)아이유 2) BTS 3)뉴진스 4)종료 (" + (j + 1) + "번째 투표입니다.)");
			System.out.print("투표를 해주세요 >> ");
			data = sc.nextInt();
			if (data == 1) {
				i++;
			} else if (data == 2) {
				b++;
			} else if (data == 3) {
				n++;
			} else if (data == 4) {
				System.out.println("시스템을 종료합니다.");
				System.exit(0);
			}
			else {
				System.out.println("1, 2, 3으로만 투표해주세요.");
			}
		}
		System.out.println();
		System.out.println("======투표결과======");
		System.out.println("====== 총" + (i + b + n) + "표 ======");
		System.out.println("아이유 : " + i + "표");
		System.out.println("BTS : " + b + "표");
		System.out.println("뉴진스 : " + n + "표");
		System.out.println("====================");
		
		sc.close();
	}

}
