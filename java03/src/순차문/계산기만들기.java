package 순차문;

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

public class 계산기만들기 {

	public static void main(String[] args) {

		FlowLayout flow = new FlowLayout();

		ImageIcon calc = new ImageIcon("calculator.png");

		JFrame frame = new JFrame();
		frame.setSize(400, 1000);
		frame.getContentPane().setBackground(Color.darkGray);

		JLabel pic = new JLabel();
		pic.setIcon(calc);
		JLabel num1 = new JLabel();
		num1.setText("숫자1");
		JLabel num2 = new JLabel();
		num2.setText("숫자2");

		JTextField inputNum1 = new JTextField(10);
		JTextField inputNum2 = new JTextField(10);
		
		Font font = new Font("D2Coding", 1, 40);

		JButton b1 = new JButton("+");
		JButton b2 = new JButton("-");
		JButton b3 = new JButton("*");
		JButton b4 = new JButton("/");

		frame.setLayout(flow);

		num1.setForeground(Color.black);
		num2.setForeground(Color.black);

		b1.setBackground(Color.black);
		b1.setForeground(Color.pink);

		b2.setBackground(Color.black);
		b2.setForeground(Color.pink);

		b3.setBackground(Color.black);
		b3.setForeground(Color.pink);

		b4.setBackground(Color.black);
		b4.setForeground(Color.pink);

		inputNum1.setBackground(Color.black);
		inputNum1.setForeground(Color.pink);

		inputNum2.setBackground(Color.black);
		inputNum2.setForeground(Color.pink);

		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		b4.setFont(font);
		num1.setFont(font);
		inputNum1.setFont(font);
		num2.setFont(font);
		inputNum2.setFont(font);

		frame.add(pic);
		frame.add(num1);
		frame.add(inputNum1);
		frame.add(num2);
		frame.add(inputNum2);
		frame.add(b1);
		frame.add(b2);
		frame.add(b3);
		frame.add(b4);
		
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 클릭했을 때 처리 내용 쓰기
				// num1, num2에 있는 글자를 가지고 온다.
				String s1 = inputNum1.getText();
				String s2 = inputNum2.getText();

				int n1 = Integer.parseInt(s1);
				int n2 = Integer.parseInt(s2);

				int result = n1 + n2;
				JOptionPane.showMessageDialog(frame,result);
			}
		});
		
		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 클릭했을 때 처리 내용 쓰기
				// num1, num2에 있는 글자를 가지고 온다.
				String s1 = inputNum1.getText();
				String s2 = inputNum2.getText();

				int n1 = Integer.parseInt(s1);
				int n2 = Integer.parseInt(s2);

				int result = n1 - n2;
				JOptionPane.showMessageDialog(frame,result);
			}
		});
		
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 클릭했을 때 처리 내용 쓰기
				// num1, num2에 있는 글자를 가지고 온다.
				String s1 = inputNum1.getText();
				String s2 = inputNum2.getText();
				
				int n1 = Integer.parseInt(s1);
				int n2 = Integer.parseInt(s2);
				
				int result = n1 * n2;
				JOptionPane.showMessageDialog(frame,result);
			}
		});
		
		b4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 클릭했을 때 처리 내용 쓰기
				// num1, num2에 있는 글자를 가지고 온다.
				String s1 = inputNum1.getText();
				String s2 = inputNum2.getText();
				
				int n1 = Integer.parseInt(s1);
				int n2 = Integer.parseInt(s2);
				
				double result = ((double)n1 / n2);
				int remainder = n1 % n2;
				JOptionPane.showMessageDialog(frame,result + ", 나머지는 " + remainder);
			}
		});

		frame.setVisible(true);
	}

}
