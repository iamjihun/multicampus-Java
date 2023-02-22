package 인터페이스;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class 글자길이판독기 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500, 400);
		// flow를 만들어두고, 아래 코드에서 flow를 쓰는 경우
		// FlowLayout flow = new FlowLayout();
		// f.setLayout(flow)
		// 한 번 쓰고 아래 코드에서 쓸 일이 없는 경우
		f.setLayout(new FlowLayout());

		Font font1 = new Font("함초롬바탕", Font.BOLD, 30);
		Font font2 = new Font("함초롬바탕", Font.ITALIC, 20);
		Font font3 = new Font("함초롬바탕", Font.ITALIC, 15);

		JLabel title = new JLabel("===글자/단어 수 판독기===");
		title.setFont(font1);

		JTextArea area = new JTextArea(10, 30);
		area.setLineWrap(true);
		area.setBackground(Color.black);
		area.setForeground(Color.green);
		area.setFont(font3);

		JButton btn1 = new JButton("글자수세기");
		JButton btn2 = new JButton("배경색변경");
		JButton btn3 = new JButton("폰트색변경");
		btn1.setFont(font3);
		btn2.setFont(font3);
		btn3.setFont(font3);

		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String text = area.getText();
				JOptionPane.showMessageDialog(f, "글자 수는 " + text.length() + "입니다.");
			}
		}); //익명클래스

		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				area.setBackground(Color.yellow);
			}
		});

		btn3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				area.setForeground(Color.pink);
			}
		});

		f.add(title);
		f.add(area);
		f.add(btn1);
		f.add(btn2);
		f.add(btn3);

		// 1. text.length() 글자 수
		// 2. area.setBackground(color.***);
		// 3. area.setForeground(color.%%%);

		f.setVisible(true);
	}

}
