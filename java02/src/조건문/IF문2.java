package 조건문;

import java.util.Date;

public class IF문2 {

	public static void main(String[] args) {
		//Date - 년월일시분초, java.util.Date
		
		java.util.Date date = new Date();
		
		int hour = date.getHours();
		//int hour = 15;

		if (hour < 11) {
			System.out.println("굿모닝");
		} else if (hour < 14) {
			System.out.println("굿에프터눈");
		} else if (hour < 20) {
			System.out.println("굿이브닝");
		} else {
			System.out.println("굿나잇");
		}
	}

}
