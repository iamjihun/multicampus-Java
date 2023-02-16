package 생성자;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.TexturePaint;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 카운터프로그램 {
	static int count;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(300, 300);
		f.getContentPane().setBackground(Color.LIGHT_GRAY);

		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		Font font1 = new Font("함초롬돋움", Font.BOLD, 150);

		JLabel number = new JLabel();
		number.setText(count + "");
		number.setFont(font1);
		number.setForeground(Color.red);

		JButton plus = new JButton("1더하기");
		plus.setBackground(Color.green);
		plus.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				count++;
				number.setText(count + "");
			}
		});

		JButton reset = new JButton("0으로 초기화");
		reset.setBackground(Color.blue);
		reset.setForeground(Color.white);
		reset.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				count = 0;
				number.setText(count + "");
			}
		});

		JButton minus = new JButton("1빼기");
		minus.setBackground(Color.green);
		minus.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				count--;
				number.setText(count + "");
			}
		});
		f.add(plus);
		f.add(reset);
		f.add(minus);
		f.add(number);

		f.setVisible(true);
	}

}
