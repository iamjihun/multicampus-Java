package 스태틱;

import java.util.concurrent.CountDownLatch;

public class 나의일지 {

	public static void main(String[] args) {
		Day day1 = new Day("JAVA공부", 8, "집");
		System.out.println(Day.count);
		Day day2 = new Day("JAVA공부", 8, "집");
		System.out.println(Day.count);
		Day day3 = new Day("JAVA공부", 8, "집");
		Day day4 = new Day("JAVA공부", 8, "집");
		System.out.println(Day.count);
		// 총 12개 다이나믹 생성, 멤버변수 ==> 객체생성 할 때마다 다이나믹하게 무더기영엉(heap)에 
		// 생긴 변수, 인스턴스 변수라고 부른다.
		
		System.out.println(day1);
		System.out.println(day2);
		System.out.println(day3);
		System.out.println("일기 쓴 날 수 : " + Day.count  + "일");
		System.out.println(Day.sum);
	}

}
