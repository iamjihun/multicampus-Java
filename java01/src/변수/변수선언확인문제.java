package 변수;

public class 변수선언확인문제 {

	public static void main(String[] args) {
		// 내 정보 중 기본 데이터에 속하는 정보를 변수에 넣고, 출력!
		// 정수
		// 실수
		// 문자1
		// 논리
		// 프린트!
		
		int num = 180;
		double num2 = 1.2;
		char c = '훈';
		boolean b = false;
		String name = "전지훈";
		//여러 글자를 쓸 때는 ""
		
		System.out.println("제 키는 " + num + "입니다.");
		System.out.println("제 시력은 " + num2 + "입니다.");
		System.out.println("제 이름의 마지막 글자는 " + c + "입니다.");
		System.out.println("제 풀네임은 " + name + "입니다.");
		System.out.println("저는 여자입니다. ==> " + b);
		
	}

}
