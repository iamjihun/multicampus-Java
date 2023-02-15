package 생성자맛보기;

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

public class 키오스크만들기2 {

	// 심화
	// 1) 버튼을 클릭했을 때, 각 음식의 주문량을 체크해서 f의 title로 보여주세요!
	// f.setTitle("음료 주문 시스템");
	// 2) 음식의 값을 다 분리, 아메리카노 4500원, 라떼 5900원, 티 5700원

	static int index = 1;
	static int count; // 전역변수는 자동 초기화
	static int count2; // 전역변수는 자동 초기화
	static int count3; // 전역변수는 자동 초기화
	final static int PRICE1 = 4500;
	final static int PRICE2 = 5900;
	final static int PRICE3 = 5700;

	public static void main(String[] args) {
		// String[] name = { "쿠로미", "시나모롤", "마이멜로디", "헬로키티", "포챠코" };
		String[] img = { "ame.jpg", "latte.jpg", "tea.jpg" };
		// double[] cuteLevel = { 9.9, 8.5, 7.6, 7.1, 9.2 };
		Font font1 = new Font("함초롬바탕", 1, 25);
		Font font2 = new Font("함초롬바탕", Font.ITALIC, 20);
		JFrame f = new JFrame();
		// f.getContentPane().setBackground(Color.green);
		f.setTitle("음료 주문 시스템");
		f.setSize(920, 630);
		f.getContentPane().setBackground(Color.decode("#1b3c35"));
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		JLabel logo = new JLabel();
		ImageIcon logo2 = new ImageIcon("logo (4).png");
		logo.setIcon(logo2);
		logo.setHorizontalAlignment(0);
		f.add(logo);
		JLabel space = new JLabel("   ");
		space.setFont(font2);
		f.add(space);
		JButton btn1 = new JButton("아메리카노");
		btn1.setFont(font2);
		btn1.setBackground(Color.decode("#b39283"));
		btn1.setForeground(Color.white);
		btn1.setBorderPainted(false);
		JButton btn2 = new JButton("카페라떼");
		btn2.setFont(font2);
		btn2.setBackground(Color.decode("#b39283"));
		btn2.setForeground(Color.white);
		btn2.setBorderPainted(false);
		JButton btn3 = new JButton("자몽허니블랙티");
		btn3.setFont(font2);
		btn3.setBackground(Color.decode("#b39283"));
		btn3.setForeground(Color.white);
		btn3.setBorderPainted(false);
		f.add(btn1);
		f.add(btn2);
		f.add(btn3);
		JLabel qty = new JLabel("   총 수량 : ");
		qty.setFont(font2);
		qty.setForeground(Color.white);
		JLabel qty2 = new JLabel((count + count2 + count3) + "잔");
		qty2.setFont(font2);
		qty2.setForeground(Color.white);
		JLabel space2 = new JLabel("                             ");
		space2.setFont(font1);
		JLabel image = new JLabel();
		ImageIcon image2 = new ImageIcon(img[0]);
		image.setIcon(image2);
		image.setHorizontalAlignment(0);
		// f.add(image, BorderLayout.CENTER);
		JLabel space3 = new JLabel("                          ");
		space3.setFont(font1);
		JLabel result = new JLabel("   결제금액 : 0원");
		result.setFont(font1);
		result.setForeground(Color.white);
		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ImageIcon image2 = new ImageIcon(img[0]);
				image.setIcon(image2);
				count++;
				qty2.setText((count + count2 + count3) + "잔");
				int amePrice = count * PRICE1;
				int lattePrice = count2 * PRICE2;
				int teaPrice = count3 * PRICE3;
				result.setText("   결제금액 : " + (amePrice + lattePrice + teaPrice) + "원");
				f.setTitle("아메리카노 : " + count + "잔, 카페라떼 : " + count2 + "잔, 자몽허니블랙티 : " + count3 + "잔 // 총 결제금액 : "
						+ (amePrice + lattePrice + teaPrice) + "원");
				if ((amePrice + lattePrice + teaPrice) > 100000) {
					JOptionPane.showMessageDialog(f, "한도초과... 주문을 종료합니다.");
					System.exit(0);
				}
			}
		});
		btn2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ImageIcon image2 = new ImageIcon(img[1]);
				image.setIcon(image2);
				count2++;
				qty2.setText((count + count2 + count3) + "잔");
				int amePrice = count * PRICE1;
				int lattePrice = count2 * PRICE2;
				int teaPrice = count3 * PRICE3;
				result.setText("   결제금액 : " + (amePrice + lattePrice + teaPrice) + "원");
				f.setTitle("아메리카노 : " + count + "잔, 카페라떼 : " + count2 + "잔, 자몽허니블랙티 : " + count3 + "잔 // 총 결제금액 : "
						+ (amePrice + lattePrice + teaPrice) + "원");
				if ((amePrice + lattePrice + teaPrice) > 100000) {
					JOptionPane.showMessageDialog(f, "한도초과... 주문을 종료합니다.");
					System.exit(0);
				}
			}
		});
		btn3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ImageIcon image2 = new ImageIcon(img[2]);
				image.setIcon(image2);
				count3++;
				qty2.setText((count + count2 + count3) + "잔");
				int amePrice = count * PRICE1;
				int lattePrice = count2 * PRICE2;
				int teaPrice = count3 * PRICE3;
				result.setText("   결제금액 : " + (amePrice + lattePrice + teaPrice) + "원");
				f.setTitle("아메리카노 : " + count + "잔, 카페라떼 : " + count2 + "잔, 자몽허니블랙티 : " + count3 + "잔 // 총 결제금액 : "
						+ (amePrice + lattePrice + teaPrice) + "원");
				if ((amePrice + lattePrice + teaPrice) > 100000) {
					JOptionPane.showMessageDialog(f, "한도초과... 주문을 종료합니다.");
					System.exit(0);
				}
			}
		});
		f.add(qty);
		f.add(qty2);
		f.add(space2);
		f.add(image);
		f.add(space3);
		f.add(result);
		f.setVisible(true);
	}
}