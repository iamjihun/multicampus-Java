package 조건문;

import java.util.Date;

public class IF문6 {

	public static void main(String[] args) {
		Date date = new Date();

		int year = (date.getYear() + 1900);
		int day = (date.getDay());
		int month = (date.getMonth() + 1);

		if (year >= 2000) {
			System.out.println("밀레니얼 세대시군요.");
		} else {
			System.out.println("밀레니얼 세대가 아니시군요");
		}
		
		switch (day) {
		
		case 5: case 6:;
			System.out.println("토,일은 쉬자~~~~");
			break;

		default:
			System.out.println("나머지 요일은 열~~심히 공부하자!");
					}
		
		switch (month) {
		case 2:;
		System.out.println("28일까지");
			break;
		case 4: case 6: case 9: case 11:;
			System.out.println("30일까지");
			break;

		default:
			System.out.println("31일까지");
			break;
		}
	}

}
