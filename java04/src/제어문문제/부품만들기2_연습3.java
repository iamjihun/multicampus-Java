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

public class 부품만들기2_연습3 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(270, 450);
		f.getContentPane().setBackground(Color.white);

		// 물 흐르듯이 순서대로 배치해주는 부품을 RAM에 복사해서 가져다 놓기
		FlowLayout flow = new FlowLayout();
		// f에 그 부품을 쓰겠다라고 조립(설정)
		f.setLayout(flow);

		// JLabel : 글자를 쓰고 싶을 때
		JLabel logoLabel = new JLabel();
		JLabel text3 = new JLabel(); //글씨
		JLabel idLabel = new JLabel();
		idLabel.setText("사용자 ID입력");
		JLabel pwLabel = new JLabel();
		pwLabel.setText("사용자 PW입력");
		JLabel nameLabel = new JLabel();
		nameLabel.setText("이름 입력");
		JLabel telLabel = new JLabel();
		telLabel.setText("전화번호 입력");

		// JtextField : 글자 입력하는 곳..
		JTextField inputId = new JTextField(10);
		JTextField inputPw = new JTextField(10);
		JTextField inputName = new JTextField(10);
		JTextField inputTel = new JTextField(10);
		

		// JButton : 버튼 생성.
		JButton b1 = new JButton();
		b1.setText("회원가입처리");
		
		// 폰트 설정
		Font font = new Font("궁서", 1, 20);

		// setFont = 폰트 적용
		idLabel.setFont(font);
		pwLabel.setFont(font);
		nameLabel.setFont(font);
		telLabel.setFont(font);
		inputId.setFont(font);
		inputPw.setFont(font);
		inputName.setFont(font);
		inputTel.setFont(font);
		text3.setFont(font);
		
		text3.setForeground(Color.red); //버튼의 위색, 글자색
		inputId.setBackground(Color.yellow);
		inputId.setForeground(Color.red);
		inputPw.setBackground(Color.yellow);
		inputPw.setForeground(Color.red);
		inputName.setBackground(Color.yellow);
		inputName.setForeground(Color.red);
		inputTel.setBackground(Color.yellow);
		inputTel.setForeground(Color.red);
		b1.setBackground(Color.green);

		// ***.png 파일명을 쓰면 java02 프로젝트 바로 안에 있는 것으로 인식!
		ImageIcon logo = new ImageIcon("naver_logo.png");

		logoLabel.setIcon(logo);
		
		f.add(logoLabel);
		f.add(idLabel);
		f.add(inputId);
		f.add(pwLabel);
		f.add(inputPw);
		f.add(nameLabel);
		f.add(inputName);
		f.add(telLabel);
		f.add(inputTel);
		f.add(b1);
		f.add(text3);
				
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 클릭했을 때 처리 할 내용을 코딩해 주면 됨..!
				String id = inputId.getText();
				String pw = inputPw.getText();
				String name = inputName.getText();
				String tel = inputTel.getText();
				JOptionPane.showMessageDialog(f, "아이디 : " + id + "비밀번호 : " + pw + " 이름 : " + name + " 전화번호 : " + tel);
					text3.setText("회원가입 완료!");
					inputId.setText("");
					inputPw.setText("");
					inputName.setText("");
					inputTel
					.setText("");
				}
				

		}); //b1

		f.setVisible(true);
	}

}
