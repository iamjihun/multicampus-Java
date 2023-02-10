package 순차문;

import javax.swing.JOptionPane;
//부품이 있는 위치를 알려주는 역할

public class 순차문_문제1 {
	public static void main(String[] args) {
		// 기본 순차문 == 입력 --> 처리--> 출력
		// 입력 -> 부품사용, 망치같이 언제나 바로 사용 할 수 있는 것!
		String data1 = JOptionPane.showInputDialog("정수를 입력하시오-1");
		String data2 = JOptionPane.showInputDialog("정수를 입력하시오-2");
		
		// 처리 -> 숫자 더하기 연산 
		//String을 int로 변환해주어야 함.
		int data11 = Integer.parseInt(data1); // ex) "200" --> 200
		int data22 = Integer.parseInt(data2);
		
		double data33 = Double.parseDouble(data1);
		double data44 = Double.parseDouble(data2);
		
		int result = data11 + data22; //int + int = int
		double result2 = data33 + data44;
		
		// 출력 -> 모니터에 보이고 싶음.
		System.out.println(result);
		System.out.println(result2);
	}

}