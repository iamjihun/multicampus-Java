package 배열응용;

import java.awt.Color;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 랜덤버튼배열2 {

	public static void main(String[] args) {
		// 1. 프레임을 만들어보세요.
		// 2. 프레임 설정해보세요. 실행해서 눈으로 확인
		// 3. 버튼을 넣을 배열을 먼저 만들어 두세요.
		// 4. 버튼을 500개 만들어서 배열에 넣어주세요
		// 5. 배열에 있는 버튼을 꺼내서 위치를 지정 후, f에 붙여주세요.
		// 심화-1) 버튼 색을 몇 가지 지정해서 임의로 설정, 힌트 : Color 배열
		// 심화-2) f에 배경색을 넣어보세요.

		JFrame f = new JFrame();
		f.setSize(1200, 1000);
		f.setLayout(null);
		f.getContentPane().setBackground(Color.yellow);

		Random r = new Random(800);
		Random c = new Random(4);

		Color[] colors = { Color.red, Color.black, Color.cyan, Color.blue };

		JButton[] buttons = new JButton[500];
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton("버튼 " + i);

			int x = r.nextInt(1200);
			int y = r.nextInt(1000);

			// null ==> 조립해서 넣을 부품의 주소가 램에 없음.
			// 첫번째 버튼을 가로 500, 세로 500 위치, 크기 100*30
			buttons[i].setBounds(x, y, 100, 30);

			f.add(buttons[i]);

			buttons[i].setBackground(colors[c.nextInt(4)]);

			f.setVisible(true);
		}
	}

}