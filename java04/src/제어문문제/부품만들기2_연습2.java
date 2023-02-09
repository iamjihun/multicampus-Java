package 제어문문제;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class 부품만들기2_연습2 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(300, 400);
		f.getContentPane().setBackground(Color.green);

		// 물 흐르듯이 순서대로 배치해주는 부품을 RAM에 복사해서 가져다 놓기
		FlowLayout flow = new FlowLayout();
		// f에 그 부품을 쓰겠다라고 조립(설정)
		f.setLayout(flow);

		// JLabel : 글자를 쓰고 싶을 때
		JLabel idLabel = new JLabel();
		idLabel.setText("사용자 ID입력");
		JLabel pwLabel = new JLabel();
		pwLabel.setText("사용자 PW입력");

		// JtextField : 글자 입력하는 곳..
		JTextField inputId = new JTextField(10);
		JTextField inputPw = new JTextField(10);
		JLabel text3 = new JLabel(); //글씨
		text3.setText("로그인 결과");

		// JButton : 버튼 생성.
		JButton b1 = new JButton();

		// 폰트 설정
		Font font = new Font("궁서", 1, 20);

		// setFont = 폰트 적용
		idLabel.setFont(font);
		pwLabel.setFont(font);
		inputId.setFont(font);
		inputPw.setFont(font);
		text3.setFont(font);
		
		text3.setForeground(Color.red); //버튼의 위색, 글자색
		inputId.setBackground(Color.yellow);
		inputId.setForeground(Color.red);
		inputPw.setBackground(Color.yellow);
		inputPw.setForeground(Color.red);
		b1.setBackground(Color.green);

		// ***.png 파일명을 쓰면 java02 프로젝트 바로 안에 있는 것으로 인식!
		ImageIcon icon = new ImageIcon("12.png");

		b1.setIcon(icon);
		
		f.add(idLabel);
		f.add(inputId);
		f.add(pwLabel);
		f.add(inputPw);
		f.add(b1);
		f.add(text3);
				
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 클릭했을 때 처리 할 내용을 코딩해 주면 됨..!
				String id = inputId.getText();
				String pw = inputPw.getText();
				if (id.equals("root") && pw.equals("1234")) {
					text3.setText("로그인 성공!");
				} else {
					text3.setText("로그인 실패..");
					inputId.setText("");
					inputPw.setText("");
				}
				
			}
		}); //b1

		f.setVisible(true);
	}

}
