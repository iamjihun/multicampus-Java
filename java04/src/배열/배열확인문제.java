
package 배열;

public class 배열확인문제 {

	public static void main(String[] args) {
		
		int[] test = new int[5]; //길이가 5인 test 배열 만들기
		
		System.out.println(test.length);
	
		test[0] = 100;
		System.out.println(test[0]);
		
		test[4] = 500;
		System.out.println(test[4]);
		
		test[2] = 200;
		System.out.println(test[2]);
		
		for (int i = 0; i < test.length; i++) {
			System.out.print(test[i] + " ");
		}
		System.out.println();
		
		for (int i = 0; i < test.length; i++) {
			System.out.println("이 배열의 " + i + "번 index의 항목은 " + test[i] + "입니다.");
		}
		
	}
}
