package 반복문;

import javax.swing.JOptionPane;

public class for문2 {

	public static void main(String[] args) {
		for (; ;) { // 무한루프(반복)
			System.out.println("잘쓰지 않음.");
			String data = JOptionPane.showInputDialog("종료할까요? y를 입력");
			// if (data == "y") 이렇게 하면 안된다. String이기 때문
			// 비교 연산자는 기본데이터만 가능하므로,
			// String 부품에서 제공하는 기능을 사용해서 비교해 주어야 함.
			if (data.equals("y")) {
				System.out.println("안녕히가세요!!!");
				break; // if의 break가 아니고 for문의 break임!
			}
		}
	}

}
