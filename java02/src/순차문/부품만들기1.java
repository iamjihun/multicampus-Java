package 순차문;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 부품만들기1 {

	public static void main(String[] args) {
		// 자주 사용하지 않는 부품을 만들어보자.
		// 틀이 있어서 그 틀을 가지고 필요한 부품을 만들어 CPU가 조립!
		// new : 틀을 가지고 찍어낼 때 사용
		// new JFrame() : JFrame이라는 틀을 이용해서 부품을 찍어내라!
		// 만든 부품은 모두 ram에 저장되어야 한다.
		// f변수 만들어서 부품을 넣어주세요.
		// f에서는 JFrame이 저장되어야 함.

		// f라는 프레임(윈도우) 생성
		JFrame f = new JFrame();
		// setsize : f 프레임의 사이즈 설정
		f.setSize(300, 300);

		// b1이라는 버튼 생성
		JButton b1 = new JButton();
		// setText : b1 버튼 안에 텍스트 설정
		b1.setText("나는 버튼1");

		// f에 b1을 추가하기
		f.add(b1);

		// setVisible = 보여주기, 보여주는 것은 맨 끝으로!
		f.setVisible(true);
	}

}
