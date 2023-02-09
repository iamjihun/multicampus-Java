
package 배열;

public class 배열개념 {

	public static void main(String[] args) {
		// 배열 : 여러 개의 데이터를 RAM에 저장해 두고, 
		// CPU가 접근하여 사용하고 싶은 경우 사용하는 부품

		// 1. 값을 이미 알고 있는 경우.
		
		int[] jumsu = {10, 20, 30, 40}; // length 만들어서 몇 개 인지 세어서 값을 넣어 줌.
		
		System.out.println(jumsu);
		System.out.println(jumsu[0]);
		System.out.println(jumsu[1]);
		System.out.println(jumsu[2]);
		System.out.println(jumsu[3]);
		System.out.println(jumsu.length);
		
		jumsu[0] = 100; // 첫 번째 값으로 100을 넣으세요. 10<--100
		System.out.println(jumsu[0]);
		
		// 2. 값을 아직 모르고 있는데, 먼저 저장공간 만들어 두고
		//    나중에 값을 넣는 경우.
		int[] jumsu2 = new int[5];
		jumsu2[4] = 200;
		System.out.println(jumsu2[4]);
		
		
	}

}
