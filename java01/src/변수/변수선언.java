package 변수;

public class 변수선언 {

	public static void main(String[] args) {
		// 자바는 변수를 만들 때, 어떤 타입의 데이터를 넣을지 미리 결정
		// 선언!! 타입 변수명!! ==> RAM에 변수가 생성됨.
		
		int num = 100; // int : 정수 변수
		double num2 = 22.2; // double : 실수변수 (정수포함)
		char c = '한'; //글자 단 한 자 : ''
		boolean b = true; //false
		//int num = 200; 동일 이름의 변수 재선언 불가
		num = 200; //이건 ok!!
		
		System.out.println("정수 값은 " + num + "입니다.");
		System.out.println("실수 값은 " + num2 + "입니다.");
		System.out.println("문자 한 개 값은 " + c + "입니다.");
		System.out.println("부울렌 값은 " + b + "입니다.");
	}

}
