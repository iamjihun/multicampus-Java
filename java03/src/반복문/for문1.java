package 반복문;

public class for문1 {

	public static void main(String[] args) {
		// 3번 반복
		// for(초기값; 조건식; 증감식)
		for (int i = 0; i < 3; i++) {
			// i변수는 for 지역{ }안에서만쓸 수 있음.
			// 지역변수(local)
			// 그래서 아래 for문에서 똑같이 i로 써도 상관 없음.
			// i2, i3,,, 안해도 됨.
			
			// i = 0, i < 3 (true), 처리, i++
			System.out.println(i + " 내가 반복1");
		}
		
		int data = 0;
		
		while (data < 100) {
			System.out.println("내가 반복3");
			data++;
		}

		//100번 반복 ==> 내가 반복2 >>0
		
		for (int i = 0; i < 100; i++) {
			System.out.println("내가 반복2 >> " + i);
		}
		
		//10번 반복 ==> 내가 반복3 >> 1번째 실행중
		for (int i = 0; i < 10; i++) {
			System.out.println("내가 반복3 >> " + (i + 1) + " 번째 실행중");
		}
	}

}
