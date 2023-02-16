package 생성자;

public class 우리집 {

	public static void main(String[] args) {
		딸 d1 = new 딸("홍길순", '여');
		딸 d2 = new 딸("홍길진", '여');
		
		// a. 딸들의 정보 출력
		System.out.println(d1);
		System.out.println(d2);
		
		// b. 딸이 몇 명인지 카운트 한 것 프린트
		System.out.println("우리집의 딸은 " + 딸.count + "명");
		
		// c. 현재 남은 아빠 지갑에 들어있는 돈 프린트
		System.out.println("아빠 지갑에 있던 돈은 " + 딸.wallet + "원");
		System.out.println("아빠 지갑에 남은 돈은 " + (딸.wallet - (딸.count * 1000)) + "원");
	}

}