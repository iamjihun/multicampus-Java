package 주식정보시스템;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 주식정보시스템 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(300, 470);
		f.getContentPane().setBackground(Color.decode("#F5F5F5"));
		f.setLayout(new FlowLayout());
		Font font1 = new Font("D2Coding", Font.BOLD, 40);
		Font font2 = new Font("함초롬바탕", Font.BOLD, 35);

		JLabel title = new JLabel("주식정보시스템");
		title.setFont(font2);

		JButton b1 = new JButton();
		ImageIcon icon1 = new ImageIcon("Samsung_logo.png");
		b1.setBackground(Color.blue);
		b1.setIcon(icon1);
		b1.setBorder(null);

		JButton b2 = new JButton();
		ImageIcon icon2 = new ImageIcon("Kakao_logo.png");
		b2.setBackground(Color.decode("#F7E600"));
		b2.setIcon(icon2);
		b2.setBorder(null);

		JButton b3 = new JButton();
		ImageIcon icon3 = new ImageIcon("Naver_logo.png");
		b3.setBackground(Color.decode("#2DB400"));
		b3.setIcon(icon3);
		b3.setBorder(null);

		JButton b4 = new JButton("크롤링시작");
		b1.setFont(font1);
		b2.setFont(font1);
		b3.setFont(font1);
		b4.setFont(font2);

		b4.setBackground(Color.red);
		b4.setForeground(Color.white);

		// 액션기능
		// 1) 액션기능추가,
		// 2) 클릭했을 때 누가 담당할지 부품을 만들어주세요.
		// 3) 클릭했을 때 어떻게 처리할 지를 코딩!!!
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// 처리내용
				// 삼성전자코드005930을 주면서
				// 크롤링하는 부품에게 크롤링기능 요청!
				네이버증권크롤링3 c = new 네이버증권크롤링3();
				c.naver("005930");
			}
		});

		b2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// 처리내용
				// 삼성전자코드005930을 주면서
				// 크롤링하는 부품에게 크롤링기능 요청!
				네이버증권크롤링3 c = new 네이버증권크롤링3();
				c.naver("035720");
			}
		});

		b3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// 처리내용
				// 삼성전자코드005930을 주면서
				// 크롤링하는 부품에게 크롤링기능 요청!
				네이버증권크롤링3 c = new 네이버증권크롤링3();
				c.naver("035420");
			}
		});

		JLabel label = new JLabel("CODE");
		label.setFont(font1);

		JTextField text = new JTextField(7);
		text.setFont(font1);

		b4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				네이버증권크롤링3 c = new 네이버증권크롤링3();
				String data = text.getText();
				c.naver(data);
			}
		});

		f.add(title);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(label);
		f.add(text);
		f.add(b4);

		f.setVisible(true);
	}

}
