package 배열응용;

import javax.swing.JOptionPane;

public class 입력받아평균 {

	public static void main(String[] args) {
		// 입력을 여러 번 여러 개 받아서
		// 저장공간에 넣고 싶을 때  ==> 배열을 사용!!
		// 1. 배열을 만들어주세요.
		int[] jumsu = new int[5];
		int sum = 0;
		
		//배열에 값을 넣을 때는 index가 필요 ==> i가 있는 for문 사용
		for (int i = 0; i < jumsu.length; i++) {
			String data = JOptionPane.showInputDialog("숫자 입력");
			//숫자로 변환한 값을 배열의 해당 인덱스에 값으로 넣자.
			jumsu[i] = Integer.parseInt(data);
//			sum = sum + jumsu[i];
		}
		
		// 1. 전체 합계 구해서, 평균 구해보세요.
		for (int i : jumsu) {
			sum = sum + i;
		}
		double avg = sum / (double) jumsu.length;
		System.out.println("전체 합계 : " + sum + ", 평균 : " + avg);
		
		int sum2 = 0;
		
		for (int i = 0; i < jumsu.length; i++) {
			if (jumsu[i] >= 300) {
				sum2 = sum2 + jumsu[i];
				// 3. 심화 : 300이상 되는 위치인 index를 프린트
				System.out.println("300 이상 위치 : " + i);
			} 
		} 
		// 2. 300 이상 되는 숫자만 찾아서, 합계를 구해보세요.
		System.out.println("300 이상 점수의 합계 : " + sum2);
		}
	
}
