package 순차문;

import javax.swing.JOptionPane;
//부품이 있는 위치를 알려주는 역할

public class 순차문_문제2 {
	public static void main(String[] args) {
		
		//이름, 나이, 회사 값을 입력받기.
		String name = JOptionPane.showInputDialog("당신의 이름은?");
		String age = JOptionPane.showInputDialog("당신의 나이는?");
		String company = JOptionPane.showInputDialog("당신의 소속은?");
		
		//result 값 선언하기.
		String result = "당신의 이름은 " + name + "이고, 나이는 " + age + "살이며, 소속은 " + company + "입니다.";
		
		//result 값을 메세지창으로 띄우기.
		JOptionPane.showMessageDialog(null, result);
	}

}