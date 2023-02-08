package 조건문;

import java.util.Scanner;

public class 콘솔입력문제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 1. ID와 PW를 입력받아 ID가 root이고, PW가 1234이면 "로그인 성공"
		// 아니면 "로그인 실패"

		System.out.println("=======================");
		System.out.println("=========로그인========");
		System.out.println("=======================");
		System.out.print("ID를 입력하세요. >> ");
		String id = sc.next();
		System.out.print("PW를 입력하세요. >> ");
		String pw = sc.next();
		if (id.equals("root") && pw.equals("1234")) {
			System.out.println(". . . 로그인 성공!");
			System.out.println("=======================");
		} else {
			System.out.println(". . . 로그인 실패ㅠㅠ");
			System.out.println("=======================");
		}
		
		// 2. 사과 구매 갯수, 사과 한 개 당 가격 입력
		// 딸기 구매 갯수, 딸기 한 개 당 가격 입력
		// 다음과 같이 출력
		// 사과 구매 가격은 5500원 입니다.
		// 딸기 구매 가격은 4500원 입니다.
		// 전체 구매 가격은 10000원 입니다.

		System.out.print("사과 한 개당 가격을 입력하세요. >> ");
		int applePrice = sc.nextInt();
		System.out.print("사과 구매 갯수를 입력하세요. >> ");
		int appleQty = sc.nextInt();
		System.out.print("딸기 한 개당 가격을 입력하세요. >> ");
		int berryPrice = sc.nextInt();
		System.out.print("사과 구매 갯수를 입력하세요. >> ");
		int berryeQty = sc.nextInt();

		int appleTotal = applePrice * appleQty;
		int berryTotal = berryPrice * berryeQty;
		int total = (applePrice * appleQty) + (berryPrice * berryeQty);

		System.out.println("사과 구매 가격은 " + appleTotal + "원 입니다.");
		System.out.println("딸기 구매 가격은 " + berryTotal + "원 입니다.");
		System.out.println("전체 구매 가격은 " + total + "원 입니다.");

		// 3. 시작값, 종료값 입력 후 모두 더해서 출력

		int num = 0;

		System.out.println("시작값을 입력하세요 >>");
		int start = sc.nextInt();
		System.out.println("종료값을 입력하세요 >>");
		int end = sc.nextInt();

		for (int i = start; i <= end; i++) {
			num = num + i;
		}
		System.out.println("시작값부터 종료값까지 더한 값은 " + num + "입니다.");

		// 4. 시작값, 종료값, 점프값 입력
		// 시작값부터 종료값까지 점프값만큼 증가하면서 더함, 더한 값을 출력.
		// 더한 값이 100을 넘으면 프로그램 종료

		int num1 = 0;

		System.out.println("시작값을 입력하세요 >>");
		int start1 = sc.nextInt();
		System.out.println("종료값을 입력하세요 >>");
		int end1 = sc.nextInt();
		System.out.println("점프값을 입력하세요 >>");
		int jump = sc.nextInt();

		for (int i = start1; i <= end1; i++) {
			num1 = num1 + i + jump;
			if (num1 >= 100) {
				System.exit(0);
			}
		}
		System.out.println("점프값만큼 증가하면서 더한 값은 " + num1 + "입니다.");
		
		sc.close();
	}
}
