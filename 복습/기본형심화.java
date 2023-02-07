package 복습;

public class 기본형심화 {

	public static void main(String[] args) {
		// 기본형 4가지
		// 정수, 실수, 문자, 논리
		// int, double, char, boolean
		double temp = 1.2; // 끝낼 때 세미콜론 필수.. 생략불가
		int floor = 6;
		char color = 'w';
		boolean coffee = true;

		String location = "퇴계동";

		// sysout 컨트롤 + 스페이스바 (윈도우), alt+/ (맥)
		// 망치처럼 자주 사용하는 부분은 대문자로 바로 씁니다..!!
		// System - 컴퓨터, out - 출력장치(모니터)
		// in - 입력장치(키보드)
		System.out.println("오늘의 온도는 " + temp + "도");
		System.out.println("우리집은 " + floor + "층");
		System.out.println("내 차 색은 " + color);
		System.out.println("커피를 마셨나요? " + coffee);
		System.out.println("내가 있는 곳은 " + location);
	}

}
