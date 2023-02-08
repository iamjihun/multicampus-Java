package 반복문;

import javax.swing.JOptionPane;

public class 누적연습2 {

	public static void main(String[] args) {
		// iu = iu + 1;
		// sum = sum + i;

		// 숫자누적
		int sum = 0; // int sum; 이거 절대 안됨(쓰레기 값 됨...) 변수의 초기화 필수!
		for (int i = 0; i <= 10000; i++) {
			sum = sum + i;
			// System.out.println(sum);
		}
		System.out.println("전체 합은 : " + sum);

		// 글자누적
		String sum2 = ""; // String에 초기값 넣어줄 때 공백.
		for (int i = 0; i < 3; i++) {
			String data = JOptionPane.showInputDialog("가 본 나라는?");
			sum2 = sum2 + data + " ";
		}
		System.out.println(sum2);
	}

}
