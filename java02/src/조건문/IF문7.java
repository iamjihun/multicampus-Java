package 조건문;

import javax.swing.JOptionPane;

public class IF문7 {
	public static void main(String[] args) {
		String password = JOptionPane.showInputDialog("암호를 대시오.");
		if (password.equals("pass")) {
			System.out.println("들어오세요.");
		} else {
			System.out.println("나가세요.");
		}
		
		String food = JOptionPane.showInputDialog("당신이 먹고 싶은 저녁 메뉴는?");
		if (food.equals("자장면")) {
			System.out.println("중국집으로 가요.");
		} else if (food.equals("라면")) {
			System.out.println("분식집으로 가요.");
		} else if (food.equals("회")) {
			System.out.println("횟집으로 가요.");
		} else {
			System.out.println("그냥 안먹어요");
		}
		
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("숫자1을 입력하세요."));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("숫자2를 입력하세요."));
		if (num1 > num2) {
			System.out.println(num1 + ", 숫자1이 더 큽니다.");
		} else if (num2 > num1) {
			System.out.println(num2 + ", 숫자2가 더 큽니다.");
		}
		
		String no = "A100EX";
		char firstLetter = no.charAt(0);
		if (firstLetter == 'A') {
			System.out.println("기획부");
		} else if (firstLetter == 'B') {
			System.out.println("총무부");
		} else if (firstLetter == 'C') {
			System.out.println("개발부");
		} else {
			System.out.println("해당부서없음");
		}
	}
}