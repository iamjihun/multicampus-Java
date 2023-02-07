package 순차문;

import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 부품만들기2_연습 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(460, 140);

		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		JLabel id = new JLabel("아이디");
		JLabel pw = new JLabel("패스워드");

		JButton b1 = new JButton("버튼1");
		JButton b2 = new JButton("버튼2");

		JTextField inputId = new JTextField("아이디를 입력하세요");
		JTextField inputPw = new JTextField("비밀번호를 입력하세요");

		Font gungseo = new Font("궁서", 1, 20);

		id.setFont(gungseo);
		pw.setFont(gungseo);
		inputId.setFont(gungseo);
		inputPw.setFont(gungseo);
		b1.setFont(gungseo);
		b2.setFont(gungseo);
		f.add(id);
		f.add(inputId);
		f.add(b1);
		f.add(pw);
		f.add(inputPw);
		f.add(b2);
		
		f.setVisible(true);
	}

}
