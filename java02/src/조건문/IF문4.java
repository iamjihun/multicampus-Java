package 조건문;

import java.util.Date;

public class IF문4 {

	public static void main(String[] args) {
		// Date - 년월일시분초, java.util.Date

		java.util.Date date = new Date();

		System.out.println(date.getHours());
		System.out.println(date.getMinutes());
		System.out.println(date.getSeconds());
		System.out.println(date.getYear());
		System.out.println(date.getMonth() + 1);
		System.out.println(date.getDate());
		System.err.println(date.getDay()); //요일! 0부터 시작, 일요일부터!
		
		int hour = date.getHours();
		// int hour = 15;

		if (hour < 11) {
			System.out.println("굿모닝");

		} else if (hour < 14) {
			System.out.println("굿애프터눈");

		} else if (hour < 20) {
			System.out.println("굿이브닝");

		} else {
			System.out.println("굿나잇");
		}

		int month = date.getMonth();
		switch (month) {
		case '3':
		case '4':
		case '5': // 조건 여러 개 설정 가능.
			System.out.println("봄입니다.");
			break;
		case '6':
		case '7':
		case '8':
		case '9':
			System.out.println("여름입니다.");
			break;
		case 10:
		case 11:
			System.out.println("가을입니다.");
			break;
		default:
			System.out.println("겨울입니다.");
		}
	}

}
