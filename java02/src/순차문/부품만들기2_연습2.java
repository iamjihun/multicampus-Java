package 순차문;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 부품만들기2_연습2 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(1000, 1000);

		//물 흐르듯이 순서대로 배치해주는 부품을 RAM에 복사해서 가져다 놓기
		FlowLayout flow = new FlowLayout();
		//f에 그 부품을 쓰겠다라고 조립(설정)
		f.setLayout(flow);
		
		JButton b1 = new JButton();
		b1.setText("안녕 나는 b1버튼이야.");
		JButton b2 = new JButton();
		b2.setText("안녕 나는 b2버튼이야.");
		
		//JLabel : 글자를 쓰고 싶을 때
		JLabel id = new JLabel();
		id.setText("아이디");
		JLabel pw = new JLabel();
		pw.setText("패스워드");
		
		//JtextField : 글자 입력하는 곳..
		JTextField inputId = new JTextField(10);
		JTextField inputPw = new JTextField(10);
		
		//폰트 설정
		Font font = new Font("궁서", 1, 20);
		
		//setFont = 폰트 적용
		id.setFont(font);
		pw.setFont(font);
		b1.setFont(font);
		b2.setFont(font);
		inputId.setFont(font);
		inputPw.setFont(font);
		
		b1.setBackground(Color.green); //배경색
		b1.setForeground(Color.blue); //버튼 윗부분 색, 글자색
		b2.setBackground(Color.green);
		b2.setForeground(Color.blue);
		inputId.setBackground(Color.pink);
		inputId.setForeground(Color.gray);
		inputPw.setBackground(Color.pink);
		inputPw.setForeground(Color.white);
		
		//***.png 파일명을 쓰면 java02 프로젝트 바로 안에 있는 것으로 인식!
		ImageIcon icon = new ImageIcon("no.png");
		ImageIcon icon2 = new ImageIcon("ok.png");

		
		b1.setIcon(icon);
		b2.setIcon(icon2);
		
		f.add(id);
		f.add(inputId);
		f.add(b1);
		f.add(pw);
		f.add(inputPw);
		f.add(b2);

		f.setVisible(true);
	}

}
