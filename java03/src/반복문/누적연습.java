package 반복문;

import javax.swing.JOptionPane;
import javax.xml.crypto.Data;

public class 누적연습 {

	public static void main(String[] args) {
		
		// 1.숫자누적
		// 5부터 300까지 5의 배수만 모두 더해 출력해보세요!
		//5의 배수 조건 ==> (i % 5 == 0)
		
		int sum = 0;
		for (int i = 5; i <= 300; i++) {
			if (i % 5 ==0) {
				sum = sum + i;
			}
		}System.out.println("5부터 300까지 5의 배수를 모두 더하면 : " + sum);
		
		// 2. 문자누적
		// 먹고 싶은 음식 네 가지 입력 받아서
		// 다음과 같이 되도록 해보세요.
		// 감자랑 고구마랑 딸기랑 커피랑
		
		String food = "";
		for (int i = 0; i < 4; i++) {
			String data = JOptionPane.showInputDialog("먹고 싶은 음식은?");
			food = food + data + "랑 ";
		}
		System.out.print(food);
	}		
}
